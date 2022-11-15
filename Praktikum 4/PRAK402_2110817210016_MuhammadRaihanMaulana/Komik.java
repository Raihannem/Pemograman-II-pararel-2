/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRAK402_2110817210016_MuhammadRaihanMaulana;

/**
 *
 * @author DELL INSPIRON
 */
public class Komik extends Buku{
    private Integer Volume;
    private String Sinopsis;
    
    public Komik(String j, String p, String t, Integer v, String s){
    this.judul = j;
    this.penulis = s;
    this.tahun = Integer.parseInt(t);
    this.Volume =  v;
    this.Sinopsis = s;
    
    }
    public String getKomikDetail() {
         return "\nData yang baru diinputkan adalah \nSebuah komik dengan judul \""+ judul +
                "\". Komik tersebut dibuat oleh "+ penulis+" \ndan diterbitkan pada tahun "+ tahun +
                ". Sampai saat ini komik tersebut memiliki jumlah volume sebanyak "+ Volume +" buah. . \nSinopsis : " 
                 + Sinopsis.substring(0, 59) + "...";
    }
} 