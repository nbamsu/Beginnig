package Exception;

public class MultiCatchExceptions {
    public static void main(String[] args) {
        String number ="";
        try {
            int intNum = Integer.parseInt(number);
        }catch (NumberFormatException es){
            System.out.println(es.getMessage());
            System.out.println(es.getStackTrace());
        }finally{
            System.out.println("Fuck everything, I'm printing this sheet ");
        }

    }
}
