package Encapsulation;

public class Employee {
    private String name;
    private int salary;
    private String position;
    private Departments departments;

public Employee(String name,int salary, String position, Departments departments){
    this.name=name;
    this.salary=salary;
    this.departments=departments;
    this.position=position;
}

    public Departments getDepartments() {
        return departments;
    }


    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    public void setDepartments(Departments departments) {
        this.departments = departments;
    }

}
