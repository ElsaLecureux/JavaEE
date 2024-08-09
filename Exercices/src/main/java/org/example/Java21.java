package org.example;

public class Java21 {
    public static class Employee{
        int salary;
        public void work(){
            System.out.println("working as an employee!");
        }
        public int getSalary(int salary){
           return this.salary = salary;
        }
    }
    public static class HRManager extends Employee{
        @Override
        public void work(){
            System.out.println("Managing employees");
        }
        public void addEmployee(){
            System.out.println("Adding new employee!");
        }
    }
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.work();
        System.out.println("Employee salary: " + employee.getSalary(40000));

        HRManager HRManager = new HRManager();
        HRManager.work();
        System.out.println("Manager salary: " + HRManager.getSalary(70000));;
        HRManager.addEmployee();
    }
}
