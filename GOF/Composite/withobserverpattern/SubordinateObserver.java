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
class SubordinateObserver implements IObserver {
    private String subordinateName;

    public SubordinateObserver(String subordinateName) {
        this.subordinateName = subordinateName;
    }

    @Override
    public void update(String message) {
        System.out.println("Notification to " + subordinateName + ": " + message);
    }
}
