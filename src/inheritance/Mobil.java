/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author muhammad
 */
public class Mobil {
    String nama;
    String warna;
    String merek;
    int roda;
    String bergerak;
    String rem;
    String klakson;
    
    public void bergerak(){
    this.bergerak="kedepan / kebelakang, belok kanan / kiri";
        System.out.println("Mobil "+this.nama+" bergerak "+this.bergerak);
    }
    
    public void aksi(){
    this.klakson="Tin!!! tin!!!";
    this.rem="Citttt!!!";
        System.out.println("Suara klakson "+this.klakson+" kalau nge rem "+this.rem);
    }
    
}
