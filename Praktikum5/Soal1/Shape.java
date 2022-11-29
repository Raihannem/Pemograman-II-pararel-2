/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum5.Soal1;

/**
 *
 * @author DELL INSPIRON
 */
public abstract class Shape {
  String shapeName;

  public Shape(String name) {
    shapeName = name;
  }
  
  public abstract double area();
  
  public String toString() {
    return shapeName;
  }
}