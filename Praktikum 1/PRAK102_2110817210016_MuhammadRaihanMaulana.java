/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak101;
import java.util.Scanner;//meambil

/**
 *
 * @author DELL INSPIRON
 */
public class PRAK102_2110817210016_MuhammadRaihanMaulana {

public static void main (String [] args){
    Scanner userInput = new Scanner(System.in); 
    int user= userInput.nextInt(); 
    int angka = 1;
       
        while (angka <= 7){            
            if (user % 2 == 0){  
                int s;
                s =(user / 2)-1;
                System.out.print(" "+s+" ");               
            }
            else {
                System.out.print(user);
            }
        user++;
        angka++;
        }
    }    
}