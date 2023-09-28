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
class Book {
    private String name;
    private String Reg;

    public Book(String name, String Reg) {
        this.name = name;
        this.Reg = Reg;
    }

   
    public String getName() {
        return name;
    }

    public String getReg() {
        return Reg;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Reg: " + Reg;
    }
}
