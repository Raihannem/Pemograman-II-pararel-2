/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum5.Soal1;

/**
 *
 * @author DELL INSPIRON
 */
public class Rectangle extends Shape {
     private double length;
  private double width;
  
  public Rectangle(double l, double w) 
  {
    super("Rectangle"); 
    length = l;
    width = w;
  } 

  public double area() 
  {
    return length * width;
  }

  public String toString() 
  {
    return super.toString() + " of length " + length + " and width " + width;
  }
}