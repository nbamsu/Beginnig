package AccessModifier;

public class ModifierPractice {
    private int studentNumber=50;
    protected String name="Techtorial";

    public void sum(int num){
        num=studentNumber;
        printOut();
    }
    public void printOut(){
        System.out.println("Private Method");
    }
}
