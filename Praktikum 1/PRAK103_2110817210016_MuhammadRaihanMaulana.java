/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak101;
import java.util.Scanner;

/**
 *
 * @author DELL INSPIRON
 */
public class PRAK103_2110817210016_MuhammadRaihanMaulana {
public static void main (String [] args){
    
        Scanner userInput = new Scanner(System.in);
        int user = userInput.nextInt();
        int angka = 1;
        
        do {
            if (user % 7 == 0){
                continue;
            }
            if (angka == 5)System.out.print(user);
            else System.out.print(user +",");
            angka++;
            user --;
        }while (angka <=5);
    }   
}   
