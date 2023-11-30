/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package withobserverpattern;

/**
 *
 * @author FA20-BSE-039
 */
public class EmployeeDemo {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Alice", 50000, "Ph.D.", "Full-time");
        Doo doo = new Doo("Bob", 30000, "Senior Doo");
        HOD hod = new HOD("Charlie", 80000, "Engineering");
        Director director = new Director("David", 100000);

        hod.addSubordinate(teacher);
        hod.addSubordinate(doo);
        director.addSubordinate(hod);

        EmployeeController controller = new EmployeeController();
        controller.addEmployee(teacher);
        controller.addEmployee(doo);
        controller.addEmployee(hod);
        controller.addEmployee(director);

        controller.generateOrganogram();

        for (IEmployee employee : controller.getEmployees()) {
            employee.giveBonus();
        }
    }
}
