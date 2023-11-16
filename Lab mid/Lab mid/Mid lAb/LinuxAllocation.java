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
class LinuxAllocation implements AllocationStrategy {
    @Override
    public Tuple<List<Tuple<Student, Computer>>, List<Tuple<Student, Computer>>> allocateComputers(List<Student> students, ComputerIterator computers) {
        List<Tuple<Student, Computer>> linuxList = new ArrayList<>();
        List<Tuple<Student, Computer>> windowsList = new ArrayList<>();

        while (students.size() != 0 && computers.hasNext()) {
            Student student = students.remove(0);
            Computer computer = computers.next();

            if (Integer.parseInt(student.reg) % 2 != 0 && computer.os.equalsIgnoreCase("Linux")) {
                linuxList.add(new Tuple<>(student, computer));
            } else if (Integer.parseInt(student.reg) % 2 == 0 && computer.os.equalsIgnoreCase("Windows")) {
                windowsList.add(new Tuple<>(student, computer));
            } else {
               
            }
        }

        List<Tuple<Student, Computer>> nonAllocatedStudents = new ArrayList<>();
        
       
        for (Student student : students) {
            nonAllocatedStudents.add(new Tuple<>(student, null));
        }

        return new Tuple<>(linuxList, windowsList);
    }
}
