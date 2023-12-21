/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author ehtis
 */
import java.util.concurrent.Callable;

public class SubTask implements Callable<Integer> {
    private final int[] array;

    public SubTask(int[] array) {
        this.array = array;
    }

    @Override
    public Integer call() {
        // Simulate processing - compute the sum of elements in the array
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }
}

