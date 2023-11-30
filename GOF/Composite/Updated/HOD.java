/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Updated;

/**
 *
 * @author FA20-BSE-039
 */
import java.util.ArrayList;
import java.util.List;

class HOD extends BaseEmployee {
    private List<IEmployee> subordinates = new ArrayList<>();
    private String department;

    public HOD(String name, int salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public void addSubordinate(IEmployee subordinate) {
        subordinates.add(subordinate);
    }

    @Override
    public void giveBonus() {
        System.out.println("Bonus given to HOD: " + getName());

        for (IEmployee subordinate : subordinates) {
            subordinate.giveBonus();
        }
    }

    
}
