package Inheritence3;

public class HR extends Company{
    public HR(String name){
    super(name);
    }
    @Override
    Boolean isHiring(){
        return true;
    }
    public String progress(){
        return "HR is working hard to complete";
    }

}
