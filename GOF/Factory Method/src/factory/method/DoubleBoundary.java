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
public class DoubleBoundary implements Shape {
   private Shape shape;

   public DoubleBoundary(Shape shape) {
      this.shape = shape;
   }

   @Override
   public double getArea() {
      return 2 * shape.getArea();
   }

   @Override
   public double getPerimeter() {
      return 2 * shape.getPerimeter();
   }
}

