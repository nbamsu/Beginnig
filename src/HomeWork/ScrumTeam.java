package HomeWork;

public class ScrumTeam {
    String TeamName;
    String ProjectName;
    public ScrumTeam(String TeamName,String ProjectName){
        this.TeamName=TeamName;
        this.ProjectName=ProjectName;
    }
    public void progress(){
        System.out.println("Very good progress");
    }
    public boolean work(){
        return true;
    }
    public void sprintNumber(){
        System.out.println("First sprint");
    }
}
