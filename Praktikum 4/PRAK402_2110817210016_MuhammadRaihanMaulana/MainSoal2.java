/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRAK402_2110817210016_MuhammadRaihanMaulana;
import java.util.Scanner;
/**
 *
 * @author DELL INSPIRON
 */
public class MainSoal2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        
        System.out.println("Pilih buku yang diinginkan:");
        System.out.println("1 = Novel");
        System.out.println("2 = Komik");
        
        System.out.print("Masukan pilihan: ");
        int angka = input.nextInt();
       
        if (angka == 1){
            input.nextLine();
            System.out.print("Judul: ");
            String judul = input.nextLine();            
            System.out.print("penulis: ");
            String penulis = input.nextLine();
           
            System.out.print("Tahun Terbit: ");
            String tahun = input.nextLine();
            
            System.out.print("Genre: ");
            String genre = input.nextLine();
            
            System.out.print("Sinopsis: ");
            String sinopsis = input.nextLine();
            
            Novel a   = new Novel(judul, penulis, tahun , genre, sinopsis);
            System.out.print(a.getNovelDetail());
        }
        else {
            input.nextLine();
            System.out.print("Judul: ");
            String judul = input.nextLine();
            
            System.out.print("penulis: ");
            String penulis = input.nextLine();
            
            System.out.print("Tahun Terbit: ");
            String tahun = input.nextLine();
            
            System.out.print("Volume: ");
            Integer volume = input.nextInt();
            
            System.out.print("Sinopsis: ");
            String sinopsis = input.nextLine();
            
            Komik b = new Komik(judul, penulis, tahun, volume, sinopsis); 
            System.out.print(b.getKomikDetail());
        }   
    }
}