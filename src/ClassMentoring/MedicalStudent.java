package ClassMentoring;

public class MedicalStudent extends ApplicantInfo{
    String majorName="Doctor";
    int tuition=50000;

    public void medStudent(ApplicantInfo applicantInfo){
        System.out.println(applicantInfo+" "+majorName+" "+tuition);
    }

    public static void main(String[] args) {

        ApplicantInfo applicantInfo=new ApplicantInfo("Ariet","Stamov","2001",120);
        MedicalStudent med=new MedicalStudent();
        applicantInfo.DOB="1991";
        System.out.println(applicantInfo);
        med.addApplicant(applicantInfo);
        for(Object var:med.list){
            System.out.println(var);
        }
    }
}
