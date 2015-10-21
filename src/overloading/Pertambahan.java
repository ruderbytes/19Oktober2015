/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author muhammad
 * Overloading adalah method dengan nama yang sama dengan method lain 
 * pada suatu class tetapi dengan parameter yang berbeda. 
 * Tujuan dibuatnya overloading yaitu memudahkan penggunaan 
 * method dengan fungsi yang hampir sama.
 */
class Pertambahan{
 public void tambah1(){
  int a=5, b=10;
  System.out.println("Hasil Pertambahann dari metod tambah1 ke-1 = "+(a+b));
 }
 //Metod tambah1 di overloading dengan 2 parameter (int x, int y)
 public void tambah1(int x, int y){
  System.out.println("Hasil Pertambahann dari metod tambah1 ke-2 = "+(x+y));
 }
 public static void main(String [] args){
  Pertambahan pp;
  pp = new Pertambahan();
  pp.tambah1();//memanggil metod tambah1 ke-1
  pp.tambah1(5,5);//memanggil metod tambah1 ke-2
 }
}