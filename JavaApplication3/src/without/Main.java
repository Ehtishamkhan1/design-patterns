/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package without;

/**
 *
 * @author FA20-BSE-039
 */

class Book {

private String title;
    private String author;

    public Book(String name, String writer) {
        this.title = name;
        this.author = writer;
    }

   
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

   
}


public class Main {
     public static void main(String[] args) {
     
     Book b1= new Book("Data Science","Zeeshan");
     Book b2= new Book ("power bi", "Zeeshan");
     
     System.out.println(b1.getTitle()+""+b1.getAuthor());
     
     
     }
}
