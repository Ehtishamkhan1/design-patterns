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
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Subject subject = new Subject();

        BinaryObserver binaryObserver = new BinaryObserver(subject);
        OctalObserver octalObserver = new OctalObserver(subject);
        HexaObserver hexaObserver = new HexaObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);

        
        subject.detach(binaryObserver);
        System.out.println("Second state change with OctalObserver: 10");
        subject.setState(10);

        
     
        subject.detach(octalObserver);
        System.out.println("Third state change with HexaObserver: 7");
        subject.setState(7);
        
    }
    
}