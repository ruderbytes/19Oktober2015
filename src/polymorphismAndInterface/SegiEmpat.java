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
class SegiEmpat implements Poligon {
  // Deklarasi atribut
  private double panjang, lebar;

  // Definisi method
  // Konstruktor
  public SegiEmpat(double p, double l) {
    panjang = p;
    lebar = l;
  }

  // Selector
  public double getPanjang() {
    return panjang;
  }

  public double getLebar() {
    return lebar;
  }

  // Definisi method dari kelas induk
  public double Luas() {
    return (panjang*lebar);
  }

  public double Keliling() {
    return (2*(panjang+lebar));
  }

  public String displayInfo() {
    return ( "Segi Empat"
           + "\no Panjang  : " + (float)getPanjang()
           + "\no Lebar    : " + (float)getLebar()
           + "\no Luas     : " + (float)Luas()
           + "\no Keliling : " + (float)Keliling() );
  }
}
