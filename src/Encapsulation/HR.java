package Encapsulation;

import ClassMentoring.Array;

public class HR {
    public static void main(String[] args) {
        Departments departments=new Departments("IT",101);
        Employee employee=new Employee("Sara",100,"SDET",departments);
        int departmentId=employee.getDepartments().getDepartmentId();
        System.out.println(departmentId);
        employee.getDepartments().setDepartmentName("Sales");
        Employee employee1=new Employee("John",95,"Developer",departments);
        Employee employee2=new Employee("Mark",105,"SDET",departments);
        Employee employee3=new Employee("Patel",115,"Product Owner",departments);

        Employee[] allEmployee=new Employee[]{employee1,employee2,employee3,employee};

        for (Employee empl:allEmployee){
            if (empl.getDepartments().getDepartmentId()==101&&empl.getSalary()>=100){
                System.out.println(empl.getName());
            }
        }
        departments.setDepartmentId(1010);
    }
}
