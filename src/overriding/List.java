/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overriding;

/**
 *
 * @author muhammad
 */
class List extends Lesson{
    public static void main(String[] args) {
        Lesson nama = new Lesson();
        Lesson daftar= new List();
        nama.list();
        daftar.list();
    }
    public void list(){
    System.out.println("Matematika, IPA, IPS");
    }
}
