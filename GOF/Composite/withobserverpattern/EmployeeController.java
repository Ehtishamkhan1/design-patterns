/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package withobserverpattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FA20-BSE-039
 */
class EmployeeController {
    private List<IEmployee> employees = new ArrayList<>();

    public void addEmployee(IEmployee employee) {
        employees.add(employee);
    }

    public void generateOrganogram() {
        System.out.println("Organogram:");

        for (IEmployee employee : employees) {
            System.out.println("- " + employee.getName());
        }
    }

    public List<IEmployee> getEmployees() {
        return employees;
    }
}

