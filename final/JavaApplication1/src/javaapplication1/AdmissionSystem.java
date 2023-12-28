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
class AdmissionSystem {
    private static AdmissionSystem instance = new AdmissionSystem();
    private AnnouncementSubject announcementSubject;

    private AdmissionSystem() {
        announcementSubject = new AnnouncementSubject();
    }

    public static AdmissionSystem getInstance() {
        return instance;
    }

    public void makeAnnouncement(String announcement) {
        announcementSubject.notifyObservers(announcement);
    }

    public void addObserver(Observer observer) {
        announcementSubject.registerObserver(observer);
    }

    public void removeObserver(Observer observer) {
        announcementSubject.removeObserver(observer);
    }
}
