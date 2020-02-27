package ClassMentoring;

public class Mentoring {
    String str;
    int num;
    public void getKnowledge(){
        System.out.println("this is the first method");
    }
    private String getKnowledge(String str){
        return null;
    }
    protected int getKnowledge(String str,int num){
        return 0;
    }
    public void getKnowledge(int num,String str){
        System.out.println("This is third method");
    }
    Mentoring(String str){
        this.str=str;
    }
    Mentoring(int num,String str){
        this.num=num;
        this.str=str;
    }
    Mentoring(){

    }
}
