package Inheritence3;

public class MethodOberLoading {
    public Number getNumber(Number number){
        System.out.println("Im returning number");
        return 10;
    }
    protected Integer getNumber(Integer number){
        System.out.println("I'm returning Integer");
        return 10;
    }
    Double getNumber(Double number){
        System.out.println("I'm returning Double");
        return 10.0;
    }
    private String getNumber(int number,String name){
        System.out.println("I'm returning String");
        return "10";
    }

    public static void main(String[] args) {
        MethodOberLoading method=new MethodOberLoading();
        method.getNumber(22.5);
        method.getNumber(22);
        method.getNumber(10);
        method.getNumber(10);
        method.getNumber(10,"dff");

    }
}
