package Encapsulation;

public class Departments {
    private String departmentName;
    private int departmentId;

    public Departments(String departmentName, int departmentId) {
        this.departmentName = departmentName;
        this.departmentId = departmentId;
    }
    public String getDepartmentName() {
        return departmentName;
    }
    public int getDepartmentId() {
        return departmentId;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }


}
