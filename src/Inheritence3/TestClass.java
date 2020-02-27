package Inheritence3;

public class TestClass {
    public static void main(String[] args) {
        HR hr= new HR("Google");
        System.out.println(hr.isHiring());
        System.out.println(hr.companyName);
        ITDepartment it=new ITDepartment("Google");
        System.out.println(it.progress());

    }
}
