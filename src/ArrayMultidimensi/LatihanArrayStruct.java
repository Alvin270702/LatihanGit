/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayMultidimensi;

import javax.swing.JOptionPane;

/**
 *
 * @author uSeR
 */
class Smatkul {

    String kodeMK, namaMK;
    int banyakNilai;
    int[] nilai;
    float[] persentase;
    float nAkhir;
    char nHuruf;
    int jumlahSks;

    public Smatkul(String _KodeMk, String _namaMk, int _banyakNilai, int _jumlahSKS) {
        this.kodeMK = _KodeMk;
        this.namaMK = _namaMk;
        this.nilai = new int[_banyakNilai];
        this.persentase = new float[_banyakNilai];
        this.jumlahSks = _jumlahSKS;
    }

    Smatkul() {

    }
}

class SMhs {

    String nim, nama;
    int ambilMK;
    Smatkul[] Smatkul;
    float IP;

    public SMhs(String _nim, String _nama, int _mk) {
        this.nim = _nim;
        this.nama = _nama;
        this.ambilMK = _mk;
        Smatkul = new Smatkul[ambilMK];
        for (int i = 0; i < ambilMK; i++) {
            this.Smatkul[i] = new Smatkul();
        }
    }

    SMhs() {

    }
}

public class LatihanArrayStruct {

    static SMhs[] sMhs = new SMhs[1];

    static String inputj(String text, int no) {

        return JOptionPane.showInputDialog(null, text + no, "Message", JOptionPane.QUESTION_MESSAGE);
    }

    public static void main(String[] args) {

        for (int i = 0; i < sMhs.length; i++) {
            sMhs[i] = new SMhs();
            String nim = inputj("Input Nim Mahasiswa ", i + 1);
            String nama = inputj("Input Nama Mahasiwa ", i + 1);
            int mk = Integer.parseInt(inputj("Input Jumlah Mata Kuliah Mahasiswa ", i + 1));
            sMhs[i] = new SMhs(nim, nama, mk);
            int totalSks = 0;
            float totalNilaidikaliSks = 0;

            for (int j = 0; j < sMhs[i].Smatkul.length; j++) {
                String kodeMk = inputj("Input Kode MK ", j + 1);
                String namaMK = inputj("Input Nama Mk ", j + 1);
                int jumlahSKS = Integer.parseInt(inputj("Input Jumlah SKS MK", j + 1));
                int banyakNilai = Integer.parseInt(inputj("Input banyak nilai MK ", j + 1));
                sMhs[i].Smatkul[j] = new Smatkul(kodeMk, namaMK, banyakNilai, jumlahSKS);
                totalSks += jumlahSKS;
                for (int k = 0; k < sMhs[i].Smatkul[j].nilai.length; k++) {
                    int nilai = Integer.parseInt(inputj("Input Nilai ", k + 1));
                    float persentase = Float.parseFloat(inputj("Input Persentase ", k + 1));
                    sMhs[i].Smatkul[j].nilai[k] = nilai;
                    sMhs[i].Smatkul[j].persentase[k] = persentase;
                }
                sMhs[i].Smatkul[j].nAkhir = nilaiakhir(i, j);
                sMhs[i].Smatkul[j].nHuruf = nilaihuruf(sMhs[i].Smatkul[j].nAkhir);
                totalNilaidikaliSks += nilaiAkhir(sMhs[i].Smatkul[j].nHuruf) * jumlahSKS;
            }
            sMhs[i].IP = totalNilaidikaliSks / totalSks;
        }
        display();
    }

    private static void display() {
        for (SMhs sMh : sMhs) {
            System.out.println("Nim " + sMh.nim);
            System.out.println("Nama " + sMh.nama);
            System.out.print("Kode Mk\tNama Mk\t\tNilai 1\tNilai 2\tNilai 3\tNilai 4\tNilai 5\tNilai Akhir\tNilai Huruf\n");
            for (Smatkul Smatkul : sMh.Smatkul) {
                System.out.print(Smatkul.kodeMK + "\t");
                System.out.print(Smatkul.namaMK + "\t\t");
                for (int k = 0; k < Smatkul.nilai.length; k++) {
                    System.out.print(Smatkul.nilai[k] + "\t");
                }
                System.out.print(Smatkul.nAkhir + "\t\t");
                System.out.print(Smatkul.nHuruf + "\n");

            }
            System.out.println("IP : " + sMh.IP);

        }
    }

    public static double nilaiAkhir(char huruf) {
        switch (huruf) {
            case 'A':
                return 4;
            case 'B':
                return 3;
            case 'C':
                return 2.4;
            case 'D':
                return 1;
            default:
                return 0;
        }
    }

    public static float nilaiakhir(int i, int j) {
        float nilaiakhir = 0;
        for (int k = 0; k < sMhs[i].Smatkul[j].nilai.length; k++) {
            nilaiakhir += sMhs[i].Smatkul[j].nilai[k] * sMhs[i].Smatkul[j].persentase[k];
        }
        return nilaiakhir;
    }

    public static char nilaihuruf(float nAkhir) {
        if (nAkhir >= 80) {
            return 'A';
        } else if (nAkhir < 80 && nAkhir >= 70) {
            return 'B';
        } else if (nAkhir < 70 && nAkhir >= 60) {
            return 'C';
        } else if (nAkhir < 60 && nAkhir >= 50) {
            return 'D';
        } else {
            return 'E';
        }
    }
}
