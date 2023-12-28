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
class TransferAdmission implements AdmissionDecision {
    @Override
    public boolean makeDecision(int marksInPhysics, int marksInArts) {
        // Implement transfer admission decision logic
        return marksInPhysics >= 65 && marksInArts >= 65;
    }
}