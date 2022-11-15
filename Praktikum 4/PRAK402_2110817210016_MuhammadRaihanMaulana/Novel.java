/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRAK402_2110817210016_MuhammadRaihanMaulana;

/**
 *
 * @author DELL INSPIRON
 */
public class Novel extends Buku {
    private String Genre, Sinopsis; 
   
   public Novel(String j, String p, String t, String g, String s){
   this.judul = j;
   this.penulis = p;
   this.tahun = Integer.parseInt(t);
   this.Genre = g;
   this.Sinopsis = s;
   
   }
   public String getNovelDetail(){
        return "\nData yang baru diinputkan adalah \nSebuah Novel bergenre " + Genre + " dengan judul \""+ judul
                +"\". Novel tersebut ditulis oleh "+ penulis + " dan diterbitkan pada tahun "+ tahun
                + " . \nSinopsis : " + Sinopsis.substring(0, 59) + "...";
   }
}