/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package withobserverpattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FA20-BSE-039
 */
class BaseEmployee implements IEmployee {
    private String name;
    private int salary;
    private List<IObserver> observers = new ArrayList<>();

    public BaseEmployee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void giveBonus() {
        notifyObservers("Bonus given!");
        System.out.println("Bonus given to " + name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (IObserver observer : observers) {
            observer.update(message);
        }
    }
}
