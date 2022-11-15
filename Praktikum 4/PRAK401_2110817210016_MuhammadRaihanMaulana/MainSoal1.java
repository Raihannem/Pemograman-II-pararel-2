/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRAK401_2110817210016_MuhammadRaihanMaulana;
import java.util.Scanner;
/**
 *
 * @author DELL INSPIRON
 */
public class MainSoal1 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);   
        
        System.out.print("Judul : ");
        String judul = input.nextLine();
        
        System.out.print("Penulis : ");
        String penulis = input.nextLine();
        
        System.out.print("Tahun Terbit : ");
        Integer tahun = input.nextInt();
        
        Buku book = new Buku (judul, penulis, tahun);
        book.display();       
    }
}