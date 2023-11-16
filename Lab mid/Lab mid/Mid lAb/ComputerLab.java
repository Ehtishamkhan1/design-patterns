/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midlab;

import java.util.List;

/**
 *
 * @author ehtis
 */
class ComputerLab {
    private AllocationStrategy allocationStrategy;
    private ComputerIterator computerIterator;

    public ComputerLab(AllocationStrategy allocationStrategy, ComputerIterator computerIterator) {
        this.allocationStrategy = allocationStrategy;
        this.computerIterator = computerIterator;
    }

    public Tuple<List<Tuple<Student, Computer>>, List<Tuple<Student, Computer>>> allocateComputers(List<Student> students) {
        return allocationStrategy.allocateComputers(students, computerIterator);
    }
}
