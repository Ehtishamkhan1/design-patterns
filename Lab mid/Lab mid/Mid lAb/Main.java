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
public class Main {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Alice", "101", "Computer Science", 5),
                new Student("Bob", "202", "Electrical Engineering", 3)
        );

        List<Computer> computers = List.of(
                new Computer(1, "Linux", List.of("gcc", "vim")),
                new Computer(2, "Linux", List.of("gcc", "vim")),
                new Computer(3, "Windows", List.of("Visual Studio", "Notepad++")),
                new Computer(4, "Windows", List.of("Visual Studio", "Notepad++"))
        );

        ComputerIterator computerIterator = new ComputerIteratorImpl(computers);

        AllocationStrategy allocationStrategy = new LinuxAllocation();
        ComputerLab lab = new ComputerLab(allocationStrategy, computerIterator);
        Tuple<List<Tuple<Student, Computer>>, List<Tuple<Student, Computer>>> result = lab.allocateComputers(new ArrayList<>(students));

        System.out.println("Allocated Computers:");
        for (Tuple<Student, Computer> allocation : result.first) {
            System.out.println(allocation.first.name + " - Computer " + allocation.second.number);
        }

        System.out.println("\nNon-Allocated Students:");
        for (Tuple<Student, Computer> nonAllocation : result.second) {
            System.out.println(nonAllocation.first.name);
        }
    }
}
