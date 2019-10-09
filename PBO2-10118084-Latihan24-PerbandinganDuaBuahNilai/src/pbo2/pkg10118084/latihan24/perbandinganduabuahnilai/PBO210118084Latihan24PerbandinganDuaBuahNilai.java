/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan24.perbandinganduabuahnilai;

import java.util.Scanner;

/**
 *
 * @author Freza
*Nama  : Divi Adiffia Freza Alana
*Kelas : PBO2
*Nim   : 10118084
*Deskripsi Program : Program ini berisi program untuk Perbandingan dua buah nilai

 */
public class PBO210118084Latihan24PerbandinganDuaBuahNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b;
        Scanner Scanner = new Scanner (System.in);
        System.out.println("=====Program====");
        System.out.print("masukan nilai pertama :");
        a=Scanner.nextInt();
        System.out.print("masukan nilai pertama :");
        b=Scanner.nextInt();
        
        if (a<b){
            System.out.println(+a+" lebih kecil dari "+b);
        }
        else{
            System.out.println(+a+" lebih besar dari "+b);
        }
    }
    
}
