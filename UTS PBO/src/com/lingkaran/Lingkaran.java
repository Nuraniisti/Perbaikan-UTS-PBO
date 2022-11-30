/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lingkaran;
import com.bangundatar.BangunDatar;
/**
 *
 * @author ACER
 */
public class Lingkaran implements BangunDatar {
    private int jari;
    public Lingkaran (int jari){
        this.jari = jari;
    }

    @Override
    public double luas() {
       return (Math.PI*jari*jari)/2;
    }

}
