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
public class Circle implements Shape {
    private double price;

    public Circle(double price) {
        this.price = price;
    }

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }

    @Override
    public double getPrice() {
        return price;
    }
}