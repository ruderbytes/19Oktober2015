/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphismAndInterface;

/**
 *
 * @author muhammad
 */
class Lingkaran implements Poligon {
  // Deklarasi atribut
  private double radius;
  private final double PI = 3.14;

  // Definisi method
  // Konstruktor
  public Lingkaran(double r) {
    radius = r;
  }

  // Selector
  public double getRadius() {
    return radius;
  }

  // Definisi method dari kelas induk
  public double Luas() {
    return (PI*radius*radius);
  }

  public double Keliling() {
    return (2*PI*radius);
  }
 
  public String displayInfo() {
    return ( "Lingkaran"
           + "\no Jari-jari: " + (float)getRadius()
           + "\no Luas     : " + (float)Luas()
           + "\no Keliling : " + (float)Keliling() );
  }
}
