/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creator;

/**
 *
 * @author FA20-BSE-039
 */
public class Main {
    public static void main(String[] args) {
      
        Book book1 = BookFactory.createBook("Data Science", "Zeeshan Usmani");
        Book book2 = BookFactory.createBook("Power Bi", "Zeeshan Usman");

      
        System.out.println(book1);
        System.out.println(book2);
    }
}
