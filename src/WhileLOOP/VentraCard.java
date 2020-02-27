package WhileLOOP;

public class VentraCard {
    public static void main(String[] args) {
        int ride=2;
        int deposit=30;
        int totalUsage=0;
        while(deposit>=ride){
           totalUsage++;
           deposit=deposit-ride;

        }
        System.out.println(totalUsage);

    }
}
