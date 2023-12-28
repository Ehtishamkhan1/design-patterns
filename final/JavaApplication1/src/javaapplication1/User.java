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
class User implements Observer {
    @Override
    public void viewAnnouncement(String announcement) {
        System.out.println("User viewed announcement: " + announcement);
    }
}
