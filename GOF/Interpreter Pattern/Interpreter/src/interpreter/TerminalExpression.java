/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

/**
 *
 * @author FA20-BSE-039
 */
public class TerminalExpression implements Expression {
    
    private String data;

    public TerminalExpression(String data) {
        this.data = data; 
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}