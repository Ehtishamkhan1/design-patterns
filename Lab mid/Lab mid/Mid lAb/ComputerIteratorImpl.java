/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midlab;

import java.util.List;
import java.util.NoSuchElementException;

/**
 *
 * @author ehtis
 */
class ComputerIteratorImpl implements ComputerIterator {
    private List<Computer> computers;
    private int index;

    public ComputerIteratorImpl(List<Computer> computers) {
        this.computers = computers;
        this.index = 0;
    }

    public boolean hasNext() {
        return index < computers.size();
    }

    public Computer next() {
        if (this.hasNext()) {
            return computers.get(index++);
        } else {
            throw new NoSuchElementException("No more computers available in the iterator.");
        }
    }
}