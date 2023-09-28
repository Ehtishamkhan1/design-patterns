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
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape, double decorationPrice) {
        super(decoratedShape, decorationPrice);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        computeCost();
    }

    private void computeCost() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
