/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRAK401_2110817210016_MuhammadRaihanMaulana;

/**
 *
 * @author DELL INSPIRON
 */
public class Buku {
    private String judul, penulis;
    private Integer tahun;
    
    public Buku(String j, String p, Integer t){
    this.judul = j;
    this.penulis = p;
    this.tahun = t;
    
    }

    public void display(){
        System.out.println("==========================");
        System.out.println("Detail Buku: ");
        System.out.println("Judul adalah " + judul);
        System.out.println("Penulis adalah " + penulis);
        System.out.println("Tahun Terbit adalah " + tahun);
    }
}