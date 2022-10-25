/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumInheritance;

import java.util.Date;

/**
 *
 * 
 */
public class TestManager {

    public static class Employee {

        private static final double BASE_SALARY = 15000.00;
        private String Name = " ";
        private double Salary = 0.0;

        private Date birthDate;

        public Employee() {
        }

        public Employee(String name, double salary, Date Dob) {
            this.Name = name;
            this.Salary = salary;
            this.birthDate = Dob;
        }

        public Employee(String name, double salary) {
            this(name, salary, null);
        }

        public Employee(String name, Date Dob) {
            this(name, BASE_SALARY, Dob);
        }

        public Employee(String name) {
            this(name, BASE_SALARY);
        }

        public String GetName() {
            return Name;
        }

        public double GetSalary() {
            return Salary;
        }
    }

    static class Manager extends Employee {

        private String departement;

        public Manager(String name, double salary, String dept) {
            super(name, salary);
            departement = dept;
        }

        public Manager(String n, String dept) {
            super(n);
            departement = dept;
        }

        public Manager(String dept) {
            super();
            departement = dept;
        }

        public String GetDept() {
            return departement;
        }
    }

    public static void main(String[] args) {
        Manager Utama = new Manager("John", 5000000, "Financial");
        System.out.println("Name :" + Utama.GetName());
        System.out.println("Salary :" + Utama.GetSalary());
        System.out.println("Departement :" + Utama.GetDept());

        Utama = new Manager("Michael", "Accounting");
        System.out.println("Name: " + Utama.GetName());
        System.out.println("Salary : " + Utama.GetSalary());
        System.out.println("Departement :" + Utama.GetDept());
    }
}
