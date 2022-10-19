/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRAK201_2110817210016_MuhammadRaihanMaulana;

/**
 *
 * @author DELL INSPIRON
 */
public class Mangga {
    float berat;
    int harga, jumlah_beli;
    String nama;
    
    public Mangga (String nama, float berat, int harga,int jumlah_beli){
        this.nama = nama;
        this.berat = berat;
        this.harga = harga;
        this.jumlah_beli = jumlah_beli;
    }
    
    public void output (){
            System.out.println("Nama Mangga : " + nama);
            System.out.println("Berat : " + berat + " Kg");
            System.out.println("Jumlah Beli : " + jumlah_beli);
            System.out.println("Total Berat : " + berat*jumlah_beli + " Kg");
            System.out.println("Total Harga : Rp. " + harga*jumlah_beli);
    }
}