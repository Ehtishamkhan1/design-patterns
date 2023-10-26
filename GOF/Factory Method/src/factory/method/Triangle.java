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
public class Triangle implements Shape {
   private double side1;
   private double side2;
   private double side3;

   public Triangle(double side1, double side2, double side3) {
      this.side1 = side1;
      this.side2 = side2;
      this.side3 = side3;
   }

   @Override
   public double getArea() {
      // Calculate the area using Heron's formula
      double s = (side1 + side2 + side3) / 2;
      return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
   }

   @Override
   public double getPerimeter() {
      return side1 + side2 + side3;
   }
}

