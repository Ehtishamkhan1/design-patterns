/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author FA20-BSE-039
 */

public class WarningLogger extends AbstractLogger {
    public WarningLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {		
        System.out.println("Warning Console::Logger: " + message);
    }
}
