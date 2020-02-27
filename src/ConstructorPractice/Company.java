package ConstructorPractice;

public class Company {
    String name;
    String location;
    String buisnessType;
    int employeeNumber;
    int yearlyBudget;
    public Company(String name,String location,String buisnessType,int employeeNumber, int yearlyBudget){
        this.name=name;
        this.location=location;
        this.buisnessType=buisnessType;
        this.employeeNumber=employeeNumber;
        this.yearlyBudget=yearlyBudget;

    }
    public void displayInfo(){
        System.out.println(name);
        System.out.println(location);
        System.out.println(buisnessType);
        System.out.println(employeeNumber);
        System.out.println(yearlyBudget);
    }

    public static void main(String[] args) {
        Company a= new Company("Walgreens","Deerfield","Pharmacy",500,1000000);
        Company b= new Company("Chase","Chicago","Finance",500,2000000);
        Company c= new Company("Bank of America","Dallas","Finance",400,3000000);
        Company d= new Company("USBANK","Oregon","Finance",300,5000000);
        Company e= new Company("","CVS","Foster",200,2000000);
        a.displayInfo();
        b.displayInfo();

    }
}
