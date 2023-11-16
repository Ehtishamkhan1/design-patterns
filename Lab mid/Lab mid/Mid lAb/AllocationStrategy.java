/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package midlab;

import java.util.List;

/**
 *
 * @author ehtis
 */
interface AllocationStrategy {
    Tuple<List<Tuple<Student, Computer>>, List<Tuple<Student, Computer>>> allocateComputers(List<Student> students, ComputerIterator computers);
}

