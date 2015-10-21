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
 public class Kelinci extends Hewan {
    public void setName(){
      System.out.println("Nama hewan adalah \"KELINCI\"");
    }
     
    public void setMakanan(){
      System.out.println("Makanan kelinci adalah \"WORTEL\"");
    }
     
     public void setWarna(){
      System.out.println("Warna kelinci \"PUTIH\"");
    }
     
    public static void main(String[] args){
      Kelinci k = new Kelinci();
      k.setName();
      k.setMakanan();
      k.setWarna();
    }
 }
