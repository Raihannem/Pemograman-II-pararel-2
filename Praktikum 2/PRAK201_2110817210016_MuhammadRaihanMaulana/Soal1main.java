/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRAK201_2110817210016_MuhammadRaihanMaulana;

/**
 *
 * @author DELL INSPIRON
 */
public class Soal1main {
    public static void main(String[] args) {
        Mangga arumanis = new Mangga("Arumanis", 0.3f, 5000, 13);
        Mangga manalagi = new Mangga("Manalagi", 0.5f, 7500, 17);
        Mangga madu = new Mangga("Mangga Madu", 0.375f, 6500, 12);
        
        arumanis.output();
        System.out.println("");
        manalagi.output();
        System.out.println("");
        madu.output();
    }
}