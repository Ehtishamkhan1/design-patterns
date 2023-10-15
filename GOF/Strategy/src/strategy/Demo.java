/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

/**
 *
 * @author user
 */
class Demo {
    public static void main(String[] args) {
        // Create strategies
        Strategy addStrategy = new OperationAdd();
        Strategy subtractStrategy = new OperationSubtract();
        Strategy multiplyStrategy = new OperationMultiply();
        Strategy powerStrategy = new OperationPower();

        // Create contexts for each strategy
        Context addContext = new Context(addStrategy);
        Context subtractContext = new Context(subtractStrategy);
        Context multiplyContext = new Context(multiplyStrategy);
        Context powerContext = new Context(powerStrategy);

        // Execute strategies
        System.out.println("Add: " + addContext.executeStrategy(3, 5));
        System.out.println("Subtract: " + subtractContext.executeStrategy(10, 4));
        System.out.println("Multiply: " + multiplyContext.executeStrategy(3, 5));
        System.out.println("Power: " + powerContext.executeStrategy(2, 3));

        // Create handlers and set up the chain of responsibility
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        // ... Add more handlers for Multiply, Division, and Power operations

        handler1.setNext(handler2);
        // ... Set next for other handlers in the chain

        // Execute strategies within the range using the chain of responsibility
        handler1.handleRequest(3, 5, 10000);
        handler1.handleRequest(10, 4, 10000);
        handler1.handleRequest(3, 5, 10000);
        handler1.handleRequest(2, 3, 10000);
    }
}