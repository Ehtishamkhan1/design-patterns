/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Updated;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FA20-BSE-039
 */
class Director extends BaseEmployee {
    private List<IEmployee> subordinates = new ArrayList<>();

    public Director(String name, int salary) {
        super(name, salary);
    }

    public void addSubordinate(IEmployee subordinate) {
        subordinates.add(subordinate);
    }

    @Override
    public void giveBonus() {
        System.out.println("Bonus given to Director: " + getName());

        for (IEmployee subordinate : subordinates) {
            subordinate.giveBonus();
        }
    }

   
}

