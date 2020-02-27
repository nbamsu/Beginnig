package Inheritence3;

public class Company {
    String companyName;
    public Company(){
        super();
    }
    public Company(String name){
        this();
        this.companyName=name;// this. its optional, we can skip keyword this.
    }
    Boolean isHiring(){
        return false;
    }
    protected Object progress(){
        return "in the middle of the project";
    }

}
