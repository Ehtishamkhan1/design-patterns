/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package withobserverpattern;

/**
 *
 * @author FA20-BSE-039
 */
interface ISubject {
    void addObserver(IObserver observer);

    void removeObserver(IObserver observer);

    void notifyObservers(String message);
}

