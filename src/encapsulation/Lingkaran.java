/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author muhammad
 */
public class Lingkaran {

      private double jariJari;

      public void setJariJari(double jari) {

            this.jariJari = jari;  

      }

      //method untuk menampilkan Diameter

      public void showDiameter() {

            double Diameter = this.jariJari * 2;

            System.out.println("Diameter = "+ Diameter+" what for?"+this.jariJari);

      }

      //method untuk menampilkan keliling

      public void showKeliling() {

            double Keliling = Math.PI * this.jariJari *this.jariJari;

            System.out.println("Keliling Lingkaran= "+ Keliling);

      }

      //method untuk menampilkan Luas

      public void showLuas() {

            double Luas = 2 * Math.PI * this.jariJari * this.jariJari;

            System.out.println("Luas Lingkaran = "+ Luas);

      }

}