package Exception;

public class ExceptionExample {
    // Unchecked - runTime Exception
    public static int ConvertToInt(String number){
        int result;
        try {
            result = Integer.parseInt(number);// NumberFormatException
            return result;
        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Finally block of convertToInt method");
        }
        return -1;
        }

    public static void main(String[] args) {
        String []number={"10A","5","1A"};
        int []intNum=new int[number.length];
        for (int i=0;i<=number.length;i++){
            try{
            intNum[i]=ConvertToInt(number[i]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
                return;//System.exit(0);
    }finally{
                System.out.println("Finally block");
            }
        }
    }
}
