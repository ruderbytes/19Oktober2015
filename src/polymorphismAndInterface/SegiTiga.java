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
import java.lang.Math;

class SegiTiga implements Poligon {
  // Deklarasi atribut
  private double alas, tinggi;

  // Definisi method
  // Konstruktor
  public SegiTiga(double a, double t) {
    alas = a;
    tinggi = t;
  }

  // Selector
  public double getAlas() {
    return alas;
  }

  public double getTinggi() {
    return tinggi;
  }

  // Definisi method dari kelas induk
  public double Luas() {
    return (alas*tinggi)/2;
  }

  public double Keliling() {
    double d;
    d = (double)Math.sqrt((alas*alas)+(tinggi*tinggi));
    return (alas+tinggi+d);
  }
 
  public String displayInfo() {
    return ( "Segi Tiga"
           + "\no Alas     : " + (float)getAlas()
           + "\no Tinggi   : " + (float)getTinggi()
           + "\no Luas     : " + (float)Luas()
           + "\no Keliling : " + (float)Keliling() );
  }
} 