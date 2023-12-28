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
public class Demo {
    public static void main(String[] args) {
        // Create instances of observers
        
        User user = new User();
        Student student = new Student();
        Parent parent = new Parent();
        Teacher teacher = new Teacher();
        Administration administration = new Administration();

        // Add observers to the AdmissionSystem
        
        AdmissionSystem admissionSystem = AdmissionSystem.getInstance();
        admissionSystem.addObserver(user);
        admissionSystem.addObserver(student);
        admissionSystem.addObserver(parent);
        admissionSystem.addObserver(teacher);
        admissionSystem.addObserver(administration);

        // Make an announcement
        
        admissionSystem.makeAnnouncement("Admission is now open!");

        // Student applies for admission using the RegularAdmission strategy
        
        student.applyForAdmission(65, 70, new RegularAdmission());
    
    }
}
