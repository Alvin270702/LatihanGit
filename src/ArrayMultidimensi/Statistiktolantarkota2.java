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
public class Statistiktolantarkota2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //array [3][5][5]
        int[][][] tol = {
            {{101, 21, 3,10,11}, {4, 5, 6,10,11}, {128, 11, 13,10,11}, {121, 11, 13,15,75}, {162, 11, 137,10,11}
            },
            {{71, 82, 93,10,11}, {101, 11, 122,10,11}, {60, 70, 80,10,11}, {122, 11, 13,10,11}, {129, 121, 137,10,11}
            },
            {{72, 83, 94,10,11}, {30, 11, 12,10,11}, {150, 100, 300,10,11}, {12, 119, 113,10,11}, {12, 11, 137,10,11}
            },
            
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
    static void tolAsaltujuan(int[][][] _tol, int _asal, int _tujuan) {
        int jumlahKendaraan = 0;
        for (int i = 0; i < _tol.length; i++) {
            jumlahKendaraan += _tol[i][_asal - 1][_tujuan - 1];
        }
        System.out.println("Kendaraan dari asal " + _asal + " tujuan " + _tujuan + ", sejumlah " + jumlahKendaraan);

    }
    static void tolAsalGol(int[][][] _tol, int _asal, int _gol) {
        int jumlahKendaraan = 0;
        for (int i = 0; i < _tol[0][0].length; i++) {
            jumlahKendaraan += _tol[_gol - 1][_asal - 1][i];
        }
        System.out.println("Kendaraan dari asal " + _asal + " gol " + _gol + ", sejumlah " + jumlahKendaraan);

    }
    static void tolGol(int[][][] _tol, int _gol) {
        int jumlahKendaraan = 0;
        for(int i=0 ;i<_tol[0].length;i++){
            for(int j=0;j<_tol[0][0].length;j++){
            jumlahKendaraan+=_tol[_gol-1][i][j];
        }
        }
        System.out.println("Kendaraan gol = " + _gol + " sejumlah " + jumlahKendaraan);

    }
    static void print(int[][][] _tol, int _asal, int _tujuan, int _gol) {
        int jumlahPerAsal = 0;
        int[][] jumlahperGol = new int[5][3];
        int jumlahKendaraan = 0;
        System.out.println("\n\n");
        for (int i = 0; i < _tol.length; i++) {
            System.out.println("\nJumlah Kendaraan Golongan " + (i + 1));
            System.out.println("=================================");
            System.out.println(" Asal Kendaraan\t" + "\t|Tujuan1 " + "Tujuan2 " + "Tujuan3 " + "Tujuan4 " + "Tujuan5 " + "   Total kendaraan/asal");
            for (int j = 0; j < _tol[0][0].length; j++) {
                System.out.print(" Asal " + (j + 1) + "\t\t\t|");
                for (int k = 0; k < _tol[0].length; k++) {
                    jumlahPerAsal += _tol[i][j][k];
                    System.out.print(" " + _tol[i][j][k] + " \t|");
                    jumlahperGol[j][i] += _tol[i][k][j];
                    jumlahKendaraan += _tol[i][k][j];
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

}
