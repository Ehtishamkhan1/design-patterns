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
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;
    private double decorationPrice;

    public ShapeDecorator(Shape decoratedShape, double decorationPrice) {
        this.decoratedShape = decoratedShape;
        this.decorationPrice = decorationPrice;
    }

    public void draw() {
        decoratedShape.draw();
        computeCost();
    }

    private void computeCost() {
        double totalCost = decoratedShape.getPrice() + decorationPrice;
        System.out.println("Total Cost: $" + totalCost);
    }

    @Override
    public double getPrice() {
        return decoratedShape.getPrice() + decorationPrice;
    }
}