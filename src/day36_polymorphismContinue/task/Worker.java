package day36_polymorphismContinue.task;

import day33_abstraction.employeeTask.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Worker {
    public static void main(String[] args) {
        Employee[] employees = {
                new Tester("Hamza", 32, 'M', "A01", "QA", 110000),
                new Developers("Lucy", 27, 'F', "A02", "Java Developer", 128000, "Java"),
                new Tester("George", 28, 'M', "A03", "SDET", 120000),
                new Developers("Yulia", 23, 'F', "A04", "Software Developer", 135000, "Python"),
                new Tester("Cihad", 30, 'M', "A05", "SDET", 105000),
                new Developers("Gulistan", 26, 'F', "A06", "Web Developer", 130000, "Python"),
                new Tester("Nora", 28, 'F', "A07", "QE", 120000),
                new Driver("Aaron", 48, 'M', "D1", "Truck Driver", 90000),
                new Driver("Bella", 32, 'F', "D12", "Truck Driver", 95000),
                new Developers("Diana", 29, 'F', "A08", "Front-end Developer", 140000, "C#"),
                new Tester("Tatiana", 25, 'F', "A09", "SDET", 130000),
                new Developers("Alena", 26, 'F', "A10", "Back-end Developer", 150000, "Java"),
                new Tester("Timur", 29, 'M', "A11", "SDET", 115000),
                new Teacher("James", 45, 'M', "B1", "Math Teacher", 75000),
                new Developers("Hasan", 26, 'F', "A12", "Full Stack Developer", 142000, "Java"),
                new Tester("Nataliia", 24, 'F', "A13", "QE", 125000),
                new Developers("Ermek", 26, 'M', "A14", "Full Stack Developer", 142000, "Java"),
                new Tester("Khashayar", 30, 'M', "A15", "SDET", 105000),
                new Teacher("Conor", 35, 'M', "B2", "Physics Teacher", 85000),
        };

        ArrayList<Employee> scrumMembers = new ArrayList<>(Arrays.asList(employees));

        System.out.println(scrumMembers);

        System.out.println("-------------------------");

        ArrayList<Tester> testers = new ArrayList<>();

        for (Employee each : employees) {
            if (each instanceof Tester) {
                testers.add((Tester) each);
            }
        }
        System.out.println(testers);
        System.out.println("------------------------");

        ArrayList<Developers> developers = new ArrayList<>();
        for (Employee each : employees) {
            if (each instanceof Developers) {
                developers.add((Developers) each);
            }
        }
        System.out.println(developers);
        System.out.println("------------------------");
        double maxTesterSalary = testers.get(0).getSalary();
        for (Tester each : testers) {

            if (each.getSalary() > maxTesterSalary) {
                maxTesterSalary = each.getSalary();
            }
        }
        System.out.println("maxTesterSalary = " + maxTesterSalary);
        System.out.println("--------------------------");
        double maxDeveloperSalary = developers.get(0).getSalary();
        for (Developers each : developers) {

            if (each.getSalary() > maxDeveloperSalary) {
                maxDeveloperSalary = each.getSalary();
            }
        }
        System.out.println("maxDeveloperSalary = " + maxDeveloperSalary);
    }


}
