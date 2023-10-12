/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

/**
 *
 * @author FA20-BSE-039
 */
public class IteratorPatternDemo {

   public static void main(String[] args) {
      StudentRepository studentRepository = new StudentRepository();

      // Iterate through students and print their names which start with "Muhammad"
      studentRepository.printStudentsWithNameStartingFrom("Muhammad");

      // Print all students
      studentRepository.printAllStudents();
   }
}