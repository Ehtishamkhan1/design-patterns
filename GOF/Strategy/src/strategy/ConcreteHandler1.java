/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

/**
 *
 * @author user
 */
class ConcreteHandler1 implements Handler {
    private Handler nextHandler;

    @Override
    public void setNext(Handler next) {
        this.nextHandler = next;
    }

    @Override
    public void handleRequest(int num1, int num2, int range) {
        if (num1 >= 0 && num1 <= 100) {
            System.out.println("Add: " + num1 + " + " + num2 + " = " + (num1 + num2));
        } else {
            nextHandler.handleRequest(num1, num2, range);
        }
    }
}
