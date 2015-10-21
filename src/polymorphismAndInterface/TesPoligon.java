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
// Program utama
class TesPoligon {
  public static void main(String args[]) {
    // Deklarasi array
    Poligon p[] = new Poligon[4];

    SegiEmpat se = new SegiEmpat(17,8);
    SegiTiga sg =  new SegiTiga(21,4);
    Lingkaran lg = new Lingkaran (10);
    Lingkaran lh =  new Lingkaran (7);
  
    //bentuk polimorfisme
    p[0] = se;
    p[1] = sg;
    p[2] = lg;
    p[3] = lh;
      System.out.println("apa ini? "+p.length);
    
    Lingkaran x = new Lingkaran(8);
  
    // Display informasi
    for (int i=0; i < p.length; i++) {
      System.out.println("\n"+p[i].displayInfo());
    }
  }
}
