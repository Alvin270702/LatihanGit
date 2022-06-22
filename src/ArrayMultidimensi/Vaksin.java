/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayMultidimensi;

/**
 *
 * @author uSeR
 */
import javax.swing.JOptionPane;

public class Vaksin {

    static void vaksinPerJenis(int[][][] _jumlahWarga, int _jenis, String[] _jenisvaksin) {
        int jumlah = 0;
        for (int[][] _jumlahWarga1 : _jumlahWarga) {
            for (int j = 0; j < _jumlahWarga[0].length; j++) {
                jumlah += _jumlahWarga1[j][_jenis - 1];
            }
        }
        System.out.println("Jumlah warga yang menggunakan vaksin " + _jenisvaksin[_jenis - 1] + " sebanyak " + jumlah);
    }

    static void vaksinPerUsia(int[][][] _jumlahWarga, int _umur, String[] _usia) {
        int jumlah = 0;
        for (int i = 0; i < _jumlahWarga[0].length; i++) {
            for (int j = 0; j < _jumlahWarga[0][0].length; j++) {
                jumlah += _jumlahWarga[_umur - 1][i][j];
            }
        }
        System.out.println("Jumlah warga yang vaksin usia " + _usia[_umur - 1] + " ada sebanyak " + jumlah);
    }

    static void vaksinPerTahap(int[][][] _jumlahWarga, int _tahap) {
        int jumlah = 0;
        for (int[][] _jumlahWarga1 : _jumlahWarga) {
            for (int j = 0; j < _jumlahWarga[0][0].length; j++) {
                jumlah += _jumlahWarga1[_tahap - 1][j];
            }
        }
        System.out.println("Jumlah warga yang vaksin tahap " + _tahap + " ada sebanyak " + jumlah);
    }

    public static void main(String[] args) {
        int[][][] jumlahWarga = {
            //[4][3][5]
            {{3, 8, 10,11,12}, {11, 10, 15,20,30}, {14, 12, 50,15,16} },
            {{5, 6, 7,9,1}, {60, 9, 81,24,25}, {22, 26, 28,21,22}},
            {{20, 26, 18,21,12}, {21, 22, 43,33,4}, {19, 8, 14,5,6}},
            {{20, 26, 18,6,5}, {21, 22, 43,3,2}, {19, 8, 14,1,2}}
        };
        String[] usia = {"Balita","Remaja", "Dewasa", "Lanjut Usia"};
        String[] jenisVaksin = {"Sinovac","Sinopharm","Astra Zeneca", "Moderna", "Pfizer"};

        int umur = Integer.parseInt(JOptionPane.showInputDialog(null, "Input usia\n"
                + "1.0-5\n"
                + "2.6-18\n"
                + "3.18-59\n"
                + "4.>60"));
        int jenisVak = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Jenis Vaksin \n"
                + "1.Sinovac\n"
                + "2.Sinophharm\n"
                + "3.Astra Zeneca\n"
                + "4.Moderna\n"
                + "5.Pfizer"));
        int tahap = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Tahap "));

        vaksinPerJenis(jumlahWarga, jenisVak, jenisVaksin);
        vaksinPerUsia(jumlahWarga, umur, usia);
        vaksinPerTahap(jumlahWarga, tahap);

    }

}
