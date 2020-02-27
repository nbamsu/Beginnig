package ClassMentoring;

import java.util.ArrayList;

public class ApplicantInfo {
    String firstName;
    String lastName;
    String DOB;
    int score;
    ArrayList list=new ArrayList();

    public ApplicantInfo(String firstName,String lastName,String DOB,int score){
        this.firstName=firstName;
        this.lastName=lastName;
        this.DOB=DOB;
        this.score=score;
    }
    ApplicantInfo(){

    }
    public ArrayList addApplicant(ApplicantInfo applicantInfo){
        list.add(applicantInfo);
        return list;
    }
    public String toString(){
        return firstName+" "+lastName+" "+" "+" "+DOB+" "+score;
    }

}
