package Exception;

public class TryCatchFinally {
    public static void main(String[] args) {
        int[] num = new int[]{5, 15, 25};
        for (int i = 0; i <= num.length; i++) {
            try {
                System.out.println(num[i]);
////                String name=null;
////                System.out.println(num.length);
            } catch (Exception e) {
                System.out.println("You are trying to get " + i + " index");
                System.out.println(e.getMessage());
                return;
            } catch (Throwable e) {

            } finally {
                System.out.println("I am in finally");
            }

        }
        System.out.println("After finally block");
    }
}
