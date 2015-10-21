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
class Animal1{

   public void move(){
      System.out.println("Animals can move");
   }
}

class Dog1 extends Animal1{

   public void move(){
      System.out.println("Dogs can walk and run");
   }
   public void bark(){
      System.out.println("Dogs can bark");
   }
}

public class TestDog2{

   public static void main(String args[]){
      Animal1 a = new Animal1(); // Animal reference and object
      Animal1 b = new Dog1(); // Animal reference but Dog object

      a.move();// runs the method in Animal class
      b.move();//Runs the method in Dog class
//      b.bark(); this line will taken error because bark() method doesn't found on Animal Class
   }
}
