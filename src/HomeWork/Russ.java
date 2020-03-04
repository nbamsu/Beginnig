package HomeWork;

public class Russ {
    public String leapYear(int yaer){
        if (yaer%4==0){
            if (yaer%100==0){
                if (yaer%400==0){
                    return "leap year first ";
                }
                return "Not leap year second";
            }
            return "leap year third";
        }else{
            return "not leap year fourth";
        }

    }

    public static void main(String[] args) {
        Russ rus=new Russ();
        System.out.println(rus.leapYear(2021));
    }
}
