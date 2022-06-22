/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayMultidimensi;

import java.util.Scanner;

/**
 *
 * @author uSeR
 */
public class Statistikmhs {

    public static void mhsPerProdi(int[][][] _jumlahMahasiswa, String[] _Prodi, int prodi) {
        int jumlahMahasiswa = 0;
        for (int i = 0; i < _jumlahMahasiswa.length; i++) {
            for (int k = 0; k < _jumlahMahasiswa[0][0].length; k++) {
                jumlahMahasiswa += _jumlahMahasiswa[i][prodi - 1][k];
            }
        }
        System.out.println("Jumlah Mahasiswa prodi " + _Prodi[prodi - 1] + " adalah : " + jumlahMahasiswa);
    }

    public static void mhsPerAngkatanPerJK(int[][][] _jumlahMahasiswa, String[] _jk, int _angkatan, int _jK) {
        int jumlahMahasiswa = 0;
        for (int k = 0; k < _jumlahMahasiswa[0].length; k++) {
            jumlahMahasiswa += _jumlahMahasiswa[_angkatan - 1][k][_jK];

        }
        System.out.println("Jumlah Mahasiswa angkatan " + (_angkatan) + " dengan jenis kelamin " + _jk[_jK] + " sejumlah : " + jumlahMahasiswa);
    }

    public static void mhsPerProdiPerJK(int[][][] _jumlahMahasiswa, String[] _Prodi, int prodi, int _jK, String[] _jk) {
        int jumlahMahasiswa = 0;

        for (int k = 0; k < _jumlahMahasiswa.length; k++) {
            jumlahMahasiswa += _jumlahMahasiswa[k][prodi - 1][_jK];

        }
        System.out.println("Jumlah Mahasiswa Prodi " + _Prodi[prodi - 1] + " dengan jenis kelamin " + _jk[_jK] + " sejumlah : " + jumlahMahasiswa);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] Prodi = {"IF", "SCM", "OLB", "SI", "DKV"};
        String[] jk = {"Pria", "Wanita"};

        int[][][] jumlahMahasiswa = {
            //[10][5][2]
            {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}},
            {{11, 12}, {13, 14}, {15, 16}, {17, 18}, {19, 20}},
            {{21, 22}, {23, 24}, {25, 26}, {27, 28}, {29, 30}},
            {{31, 32}, {33, 34}, {35, 36}, {37, 38}, {39, 40}},
            {{41, 42}, {43, 44}, {45, 46}, {47, 48}, {49, 50}},
            {{51, 52}, {53, 54}, {55, 56}, {57, 58}, {59, 60}},
            {{61, 62}, {63, 64}, {65, 66}, {67, 68}, {69, 70}},
            {{71, 72}, {73, 74}, {75, 76}, {77, 78}, {79, 80}},
            {{81, 82}, {83, 84}, {85, 86}, {87, 88}, {89, 90}},
            {{91, 92}, {93, 94}, {95, 96}, {97, 98}, {99, 100}}
        };
        System.out.println("input prodi ");
        int prodi = sc.nextInt();
        System.out.println("input angkatan");
        int angkatan = sc.nextInt();
        System.out.println("input jenis kelamin pria (0)/ wanita(1)");
        int jK = sc.nextInt();

        mhsPerProdi(jumlahMahasiswa, Prodi, prodi);
        mhsPerAngkatanPerJK(jumlahMahasiswa, jk, angkatan, jK);
        mhsPerProdiPerJK(jumlahMahasiswa, Prodi, prodi, jK, jk);
    }
}
