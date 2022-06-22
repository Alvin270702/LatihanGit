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

public class Pemilu {

    public static void print(int[] _pilihan) {
        for (int i = 0; i < _pilihan.length; i++) {
            System.out.println("Perolehan suara paslon ke " + (i + 1) + " = " + _pilihan[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input jumlah pemilih");
        int jumlah = sc.nextInt();
        System.out.println("input jumlah paslon : ");
        int[] pilihan = new int[sc.nextInt()];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("masukkan pilihan paslon ke " + (i + 1));
            ++pilihan[sc.nextInt() - 1];
        }
        int max = pilihan[0];
        int nomor = 1;
        for (int j = 0; j < pilihan.length; j++) {
            if (pilihan[j] > max) {
                max = pilihan[j];
                nomor = j + 1;
            } 
        }
        print(pilihan);
        System.out.println("Pemenang adalah paslon nomor urut " + nomor + " dengan perolehan suara sebanyak : " + max);

    }
}
