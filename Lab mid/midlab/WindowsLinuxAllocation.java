/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midlab;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ehtis
 */
class WindowsLinuxAllocation implements AllocationStrategy {
    public Tuple<List<Tuple<Student, Computer>>, List<Tuple<Student, Computer>>> allocateComputers(List<Student> students, ComputerIterator computers) {
        List<Tuple<Student, Computer>> allocation = new ArrayList<>();
        List<Tuple<Student, Computer>> nonAllocation = new ArrayList<>();

        while (computers.hasNext()) {
            Computer computer = computers.next();

            for (Student student : students) {
                if ((computer.getOs().equals("Windows") && student.getSemester() <= 3) ||
                    (computer.getOs().equals("Linux") && student.getSemester() > 3)) {
                    allocation.add(new Tuple<>(student, computer));
                    break;
                }
            }
        }

        for (Student student : students) {
            boolean isAllocated = false;

            for (Tuple<Student, Computer> tuple : allocation) {
                if (tuple.first.equals(student)) {
                    isAllocated = true;
                    break;
                }
            }

            if (!isAllocated) {
                nonAllocation.add(new Tuple<>(student, null));
            }
        }

        return new Tuple<>(allocation, nonAllocation);
    }
}