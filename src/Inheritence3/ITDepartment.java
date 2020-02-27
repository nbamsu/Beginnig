package Inheritence3;

public class ITDepartment extends Company{
    public ITDepartment(String name){
        super(name);
    }
    @Override
    public Boolean isHiring(){
        return true;
    }
    public void SDET(){
        System.out.println("SDET test.");
    }
}
