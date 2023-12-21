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
public class AndExpression implements Expression {
    
    private Expression expr1;
    private Expression expr2;

    public AndExpression(Expression expr1, Expression expr2) { 
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {		
        return expr1.interpret(context) && expr2.interpret(context);
    }
}