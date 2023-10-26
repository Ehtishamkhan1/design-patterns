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
public class Circle implements Shape {
   private double radius;

   public Circle(double radius) {
      this.radius = radius;
   }

   @Override
   public double getArea() {
      return Math.PI * radius * radius;
   }

   @Override
   public double getPerimeter() {
      return 2 * Math.PI * radius;
   }
}
