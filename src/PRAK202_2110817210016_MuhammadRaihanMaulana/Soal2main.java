/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRAK202_2110817210016_MuhammadRaihanMaulana;

/**
 *
 * @author DELL INSPIRON
 */
public class Soal2main {
    public static void main(String[]args){
        Mobil mobil1 = new Mobil();
        mobil1.merek = "Toyota Raize";
        mobil1.tahun_keluaran = "2021";
        mobil1.kapasitas = 988; 
        mobil1.harga = 202700000;
        
        mobil1.info();
        mobil1.setPemilik("Kalsel");
        System.out.println("Pemilik Mobil : " + mobil1.getPemilik());
        System.out.println("Pajak Mobil : Rp. " + mobil1.getPajak());
    }
}