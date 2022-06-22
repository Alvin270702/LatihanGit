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
import java.util.Scanner;

public class StatistikTol {

    static void tolAsaltujuan(int[][][] _tol, int _asal, int _tujuan) {
        int jumlahKendaraan = 0;
        for (int i = 0; i < _tol[0][0].length; i++) {
            jumlahKendaraan += _tol[_asal - 1][_tujuan - 1][i];
        }
        System.out.println("Kendaraan dari asal " + _asal + " tujuan " + _tujuan + ", sejumlah " + jumlahKendaraan);

    }

    static void tolAsalGol(int[][][] _tol, int _asal, int _gol) {
        int jumlahKendaraan = 0;
        for (int i = 0; i < _tol[0].length; i++) {
            jumlahKendaraan += _tol[_asal - 1][i][_gol - 1];
        }
        System.out.println("Kendaraan dari asal " + _asal + " gol " + _gol + ", sejumlah " + jumlahKendaraan);

    }

    static void tolGol(int[][][] _tol, int _gol) {
        int jumlahKendaraan = 0;
        for (int[][] _tol1 : _tol) {
            for (int k = 0; k < _tol[0].length; k++) {
                jumlahKendaraan += _tol1[k][_gol - 1];
            }
        }

        System.out.println("Kendaraan gol = " + _gol + " sejumlah " + jumlahKendaraan);

    }

    static void print(int[][][] _tol, int _asal, int _tujuan, int _gol) {
        int jumlahPerAsal = 0;
        int[][] jumlahperGol = new int[5][3];
        int jumlahKendaraan = 0;
        System.out.println("\n\n");
        for (int i = 0; i < _tol[0][0].length; i++) {
            System.out.println("\nJumlah Kendaraan Golongan " + (i + 1));
            System.out.println("=================================");
            System.out.println(" Asal Kendaraan\t" + "\t|Tujuan1 " + "Tujuan2 " + "Tujuan3 " + "Tujuan4 " + "Tujuan5 " + "   Total kendaraan/asal");
            for (int j = 0; j < _tol[0].length; j++) {
                System.out.print(" Asal " + (j + 1) + "\t\t\t|");
                for (int k = 0; k < _tol.length; k++) {
                    jumlahPerAsal += _tol[j][k][i];
                    System.out.print(" " + _tol[j][k][i] + " \t|");
                    jumlahperGol[j][i] += _tol[k][j][i];
                    jumlahKendaraan += _tol[k][j][i];
                }

                System.out.print("\t    " + jumlahPerAsal + "");
                jumlahPerAsal = 0;
                if (j == 4) {
                    System.out.print("\nJumlah kendaraan/gol \t| ");
                   
                        for (int[] jumlahperGol1 : jumlahperGol) {
                            System.out.print("" + jumlahperGol1[i] + "\t| ");
                        }
                    
                    System.out.println("\t    " + jumlahKendaraan);
                }
                System.out.println();

            }
            jumlahKendaraan=0;

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][][] tol = {
            {{101, 21, 3}, {4, 5, 6}, {128, 11, 13}, {121, 11, 13}, {162, 11, 137}},
            {{71, 82, 93}, {101, 11, 122}, {60, 70, 80}, {122, 11, 13}, {129, 121, 137}},
            {{72, 83, 94}, {30, 11, 12}, {150, 100, 300}, {12, 119, 113}, {12, 11, 137}},
            {{102, 8, 9}, {10, 11, 8}, {150, 100, 300}, {12, 200, 13}, {12, 11, 136}},
            {{75, 8, 8}, {10, 45, 12}, {150, 100, 300}, {12, 117, 13}, {200, 130, 135}}
        };

        System.out.println("input asal");
        int asal = sc.nextInt();
        System.out.println("input tujuan");
        int tujuan = sc.nextInt();
        System.out.println("input gol");
        int gol = sc.nextInt();

        tolAsaltujuan(tol, asal, tujuan);
        tolAsalGol(tol, asal, gol);
        tolGol(tol, gol);
        print(tol, asal, tujuan, gol);
    }
}
