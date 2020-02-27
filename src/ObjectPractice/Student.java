package ObjectPractice;

public class Student {
    String firstName;
    String lastName;
    int age;
    char gender;
    String nationality;
    int totalPage;


    //public is access modifier
    //void is return type (in java - if you are not returning anything we need use void return type
    // method signature: name of the class method + parameter, its called method signature
   public void read(){

       if (totalPage>=50){
           System.out.println(firstName+" reading");
           totalPage-=50;
       }else{
           System.out.println(firstName+" finish to read whole book");
           totalPage-=totalPage;

       }
   }
    public void study(String day){
        System.out.println("The student is studying "+day);

    }
    public int studyTime(){
       int hour=10;
        System.out.println("Student is studying "+hour+" hours");
        return hour;
    }

    public static void main(String[] args) {
        Student st=new Student();
        //System.out.println(st.firstName); // sysout will be NULL, because we didn't give the object
        st.firstName="Arslan";// If we change places sysout ---> st.firstName  --> print will be Arslan!
        st.lastName="Kabul";
        st.age=30;
        st.gender='M';
        st.nationality="USA";
        System.out.println("The first name is: "+st.firstName);
        System.out.println("The last name is: "+st.lastName);
        System.out.println("The age is: "+st.age);
        System.out.println("The gender is: "+st.gender);
        System.out.println("The nationality is: "+st.nationality);
        st.study("Monday");
        st.study("Thursday");
        st.read();
        int shour=st.studyTime(); //---> The student is studying 10 hours
        System.out.print("The student study "+(shour*60)+" minutes");

        //Create another student and give your information and print them all





    }



    }



