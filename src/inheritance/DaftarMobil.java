/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author muhammad
 * Inheritance atau pewarisan dari class induk{untuk mewariskan sifatnya menggunakan keyword extends}
 * Keyword extends yang digunakan bila terjadi pewarisan, 
 * kelas yang mewariskan method dan attributenya disebut kelas super, 
 * sedangkan yang diwariskan disebut subkelas.
 */
public class DaftarMobil extends Mobil{
    public static void main(String[] args) {
        Mobil list1 = new Mobil();
        list1.nama = "Ferrari Enzo";
        list1.warna = "Merah";
        list1.merek = "Ferrari";
        list1.roda = 4;
        System.out.println("Daftar Mobil");
        System.out.println("----------------------");
        System.out.println("");
        System.out.println("Nama :"+list1.nama);
        System.out.println("Warna :"+list1.warna);
        System.out.println("Merk :"+list1.merek);
        System.out.println("Jumlah Roda :"+list1.roda);
        System.out.println("");
        System.out.println("Sepesifikasi:");
        list1.aksi();
        list1.bergerak();
    }
}
