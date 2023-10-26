/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.method;

/**
 *
 * @author FA20-BSE-039
 */
public class Square implements Shape {
   private double side;

   public Square(double side) {
      this.side = side;
   }

   @Override
   public double getArea() {
      return side * side;
   }

   @Override
   public double getPerimeter() {
      return 4 * side;
   }
}

