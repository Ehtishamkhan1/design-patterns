/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FA20-BSE-039
 */
class AnnouncementSubject {
    private List<Observer> observers = new ArrayList<>();

    void registerObserver(Observer observer) {
        observers.add(observer);
    }

    void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    void notifyObservers(String announcement) {
        for (Observer observer : observers) {
            observer.viewAnnouncement(announcement);
        }
    }
}
