/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main;
import com.persegipanjang.PersegiPanjang;
import com.lingkaran.Lingkaran;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Panjang Persegi Panjang : ");
        int panjang = input.nextInt();
        System.out.print("Masukkan Lebar Persegi Panjang : ");
        int lebar = input.nextInt();
        System.out.print("Masukkan Jari-jari Persegi Panjang : ");
        int jari = input.nextInt();
        
        PersegiPanjang PersegiPanjang = new PersegiPanjang(panjang, lebar);
        Lingkaran Lingkaran = new Lingkaran(jari);
        System.out.print("Luas Daerah Yang Diarsir Adalah : "+PersegiPanjang.luas()+ "cm -"+Lingkaran.luas()+ "cm =" + (PersegiPanjang.luas()- Lingkaran.luas())+ "cm");
        
    }
}
