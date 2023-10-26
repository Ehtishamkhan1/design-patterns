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
public class ShapeFactory {
   public Shape getShape(String shapeType, double... parameters) {
      Shape shape = null;

      if (shapeType.equalsIgnoreCase("CIRCLE") && parameters.length == 1) {
         shape = new Circle(parameters[0]);
      } else if (shapeType.equalsIgnoreCase("RECTANGLE") && parameters.length == 2) {
         shape = new Rectangle(parameters[0], parameters[1]);
      } else if (shapeType.equalsIgnoreCase("SQUARE") && parameters.length == 1) {
         shape = new Square(parameters[0]);
      } else if (shapeType.equalsIgnoreCase("TRIANGLE") && parameters.length == 3) {
         shape = new Triangle(parameters[0], parameters[1], parameters[2]);
      }

      return shape;
   }
}


