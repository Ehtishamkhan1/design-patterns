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
class Student implements Observer {
    @Override
    public void viewAnnouncement(String announcement) {
        System.out.println("Student viewed announcement: " + announcement);
    }

    void applyForAdmission(int marksInPhysics, int marksInArts, AdmissionDecision decision) {
        boolean admissionResult = decision.makeDecision(marksInPhysics, marksInArts);
        System.out.println("Admission result: " + admissionResult);
    }

    void setStudentName(String studentName) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}