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
public class tolantarkota {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] jumlahKendaraan = new int[4][5];
        String[] asal = {"AAA", "BBB", "CCC", "DDD"};
        int[][] harga = {
            {12500, 21500, 27000, 34000, 41000},
            {9500, 15500, 19000, 24000, 29000},
            {8000, 14000, 17500, 22000, 25500},
            {7000, 13000, 15500, 19500, 23500},};
        int pendapatan = 0;
        int lanjut = 1;

        while (lanjut != 0) {
            System.out.println("input asal");
            int asl = sc.nextInt();
            System.out.println("input golongan");
            int gol = sc.nextInt();
            System.out.println("lanjut(1)/tidak(0)");
            lanjut = sc.nextInt();
            jumlahKendaraan[asl - 1][gol - 1]++;
        }
        System.out.println(" Asal Kendaraan\t|" + " Golongan1\t|" + " Golongan2\t|" + " Golongan3\t|" + " Golongan4\t|" + " Golongan5\t|");
        for (int i = 0; i < harga.length; i++) {
            System.out.print(asal[i] + "\t\t|" + "");
            for (int j = 0; j < harga[0].length; j++) {
                System.out.print(jumlahKendaraan[i][j] + "\t\t|" );
            }
            System.out.println("");
        }

        int totalPerAsal = 0;
        int[] totalPerGol = new int[5];

        System.out.println("");
        System.out.println(" Asal Kendaraan\t|" + " Golongan1\t|" + " Golongan2\t|" + " Golongan3\t|" + " Golongan4\t|" + " Golongan5\t|" + "Total harga/asal");
        for (int i = 0; i < harga.length; i++) {
            System.out.print(asal[i] + "\t\t|" + "");
            for (int j = 0; j < harga[0].length; j++) {
                System.out.print(jumlahKendaraan[i][j] * harga[i][j] + "\t\t|" + "");
                totalPerAsal += jumlahKendaraan[i][j] * harga[i][j];
                pendapatan += jumlahKendaraan[i][j] * harga[i][j];
            }
            System.out.print(totalPerAsal + " ");
            System.out.println("");
            totalPerAsal = 0;
        }
        for (int j = 0; j < harga[0].length; j++) {
            for (int k = 0; k < harga.length; k++) {
                totalPerGol[j] += jumlahKendaraan[k][j] * harga[k][j];
            }
        }

        System.out.print("Total Harga/Gol\t|");
        for (int j = 0; j < totalPerGol.length; j++) {
            System.out.print(totalPerGol[j] + "\t\t|");
        }
        System.out.println(pendapatan);

        System.out.println("Total Pendapatan : " + pendapatan);
    }
}
