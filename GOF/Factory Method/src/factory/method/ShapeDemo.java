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
public class ShapeDemo {
   public static void main(String[] args) {
      DoubleBoundaryFactory doubleBoundaryFactory = new DoubleBoundaryFactory();

      // Get an object of Circle with double boundary and call its methods.
      Shape shape1 = doubleBoundaryFactory.getShape("CIRCLE", 5.0);
      System.out.println("Circle - Double Boundary Area: " + shape1.getArea());
      System.out.println("Circle - Double Boundary Perimeter: " + shape1.getPerimeter());

      // Get an object of Rectangle with double boundary and call its methods.
      Shape shape2 = doubleBoundaryFactory.getShape("RECTANGLE", 4.0, 6.0);
      System.out.println("Rectangle - Double Boundary Area: " + shape2.getArea());
      System.out.println("Rectangle - Double Boundary Perimeter: " + shape2.getPerimeter());

      // Get an object of Square with double boundary and call its methods.
      Shape shape3 = doubleBoundaryFactory.getShape("SQUARE", 3.0);
      System.out.println("Square - Double Boundary Area: " + shape3.getArea());
      System.out.println("Square - Double Boundary Perimeter: " + shape3.getPerimeter());

      // Get an object of Triangle with double boundary and call its methods.
      Shape shape4 = doubleBoundaryFactory.getShape("TRIANGLE", 3.0, 4.0, 5.0);
      System.out.println("Triangle - Double Boundary Area: " + shape4.getArea());
      System.out.println("Triangle - Double Boundary Perimeter: " + shape4.getPerimeter());
   }
}

