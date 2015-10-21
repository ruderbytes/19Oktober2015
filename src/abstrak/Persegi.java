/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstrak;

/**
 *
 * @author muhammad
 */
class Persegi extends BangunDatar{
 
  int sisi;
  public Persegi(int s){
   this.sisi = s;
  }
 
  public int hitungLuas() {
    //method ini harus diberi implementasi
    int luas = sisi*sisi;
    return luas;
  }
 
public static void main(String[] args){
 Persegi p = new Persegi(5);
//     System.out.println("apa ini? "+p.hitungLuas());
int luas = p.hitungLuas();
System.out.println(luas);

}
 
}
