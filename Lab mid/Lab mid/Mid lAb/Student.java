/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midlab;

/**
 *
 * @author ehtis
 */
class Student {
    String name;
    String reg;
    String description;
    int semester;

    public Student(String name, String reg, String description, int semester) {
        this.name = name;
        this.reg = reg;
        this.description = description;
        this.semester = semester;
    }

    int getSemester() {
        return semester;
    }
}

