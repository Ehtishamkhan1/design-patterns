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


public class DatabaseLogger extends AbstractLogger {
    public DatabaseLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {		
        System.out.println("Database::Logger: " + message);
    }
}

