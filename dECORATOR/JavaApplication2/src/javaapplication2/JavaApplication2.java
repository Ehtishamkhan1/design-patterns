/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author FA20-BSE-039
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape redCircle = new RedShapeDecorator(new Circle(5.0), 2.0);
        Shape redRectangle = new RedShapeDecorator(new Rectangle(8.0), 3.0);

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
    
}
