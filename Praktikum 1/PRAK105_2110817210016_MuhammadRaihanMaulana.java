/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak101;
import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author DELL INSPIRON
 */
public class PRAK105_2110817210016_MuhammadRaihanMaulana {
public static void main (String [] args){
        Scanner userInput = new Scanner(System.in).useLocale(Locale.US);
        final float phi = 3.14f;
        Float tinggi, jari_jari, volume;
        
        System.out.print("Masukan Jari-Jari\t: ");
        jari_jari = userInput.nextFloat();
        
        System.out.print("Masukan Tinggi\t\t: ");
        tinggi = userInput.nextFloat();
        
        volume = phi * jari_jari * jari_jari * tinggi;
        
        System.out.println("=======================");
        System.out.println("Volume tabung dengan jari-jari "+jari_jari+"cm dan \n"
                + "tinggi "+tinggi+"cm adalah "+volume+"m3");
    }    
}
