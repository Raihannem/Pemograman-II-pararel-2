/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRAK301_2110817210016_MuhammadRaihanMaulana;
import java.util.LinkedList;
import java.util.Scanner;
/**
 *
 * @author DELL INSPIRON
 */
public class Soal1main {
    public static void main(String[] args) {
        int total = 0;
        Scanner input = new Scanner(System.in);
        LinkedList<Dadu> Dice = new LinkedList<Dadu>();
        int masuk = input.nextInt();
        
        for (int j = 0; j <=masuk; ++j){
            Dice.add(new Dadu());
            Dice.getLast().acakNilai();
        }  
        for (int z = 1; z < Dice.size(); ++z){
            System.out.println("Dadu ke "+ z + " bernilai : " + Dice.get(z).getNilai());
            total += Dice.get(z).getNilai();  
        }
        System.out.println("Total nilai keseluruhan " + total);
    }
}