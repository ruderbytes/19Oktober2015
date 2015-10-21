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
public class UjiLingkaran{

      public static void main(String[] args) {

            double jari = 7; //memasukkan nilai jari-jari

            //menampilkan nilai dan mencetak teks “Jari-jari”

            System.out.println("Jari – jari\t: "+jari);

            //membuat objek circle dari kelas Lingkaran

            Lingkaran circle = new Lingkaran();

            //memanggil setJarijari, showDiameter, showKeliling Lingkaran, showLuas

            //melalui objek circle dari kelas Lingkaran

            circle.setJariJari(jari);

            circle.showDiameter();

circle.showKeliling();

            circle.showLuas();

      }

}