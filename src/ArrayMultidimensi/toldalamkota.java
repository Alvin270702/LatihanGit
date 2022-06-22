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
import java.util.Scanner;
public class toldalamkota {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int[] tarif = {10000,20000,15000,12500};
        int pendapatan = 0;
        int[] jumlahKendaraan = new int[4];
        boolean cont =false;
        while(!cont){
            int gol=Integer.parseInt(JOptionPane.showInputDialog(null,"input golongan kendaraan"));
            jumlahKendaraan[gol-1]++;
            int con=JOptionPane.showConfirmDialog(null,"lanjut atau tidak");
            if(con==1||con==2){
                cont=true;
            }
        }
        for(int i=0; i<jumlahKendaraan.length;i++){
            pendapatan+=jumlahKendaraan[i]*tarif[i];
        }
        System.out.println("Total pendapatan : " + pendapatan);
    }
}
