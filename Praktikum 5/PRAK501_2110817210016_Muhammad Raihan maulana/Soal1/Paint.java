/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum5.Soal1;

/**
 *
 * @author DELL INSPIRON
 */
public class Paint {
  private double coverage; 

  public Paint(double c) 
  {
    coverage = c;
  } 
   
  public double amount(Shape s) 
  {
    System.out.println ("Computing amount for " + s);
    return s.area() / coverage;
  } 
}    