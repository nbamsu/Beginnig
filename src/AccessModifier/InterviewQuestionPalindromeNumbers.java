package AccessModifier;

public class InterviewQuestionPalindromeNumbers {


    public static boolean str(String name) {
        String empty="";
        for (int i=name.length()-1;i>=0;i--){
            empty+=name.charAt(i);
        if(name.equalsIgnoreCase(empty))  {
            return true;
        }
        }
        return false;

    }
    public static boolean isNumberPalindrome(int number) {
        String wod = "" + number;
        String empty = "";
        for (int i = wod.length() - 1; i >= 0; i--) {
            empty += wod.charAt(i);
            if (wod.equalsIgnoreCase(empty)) {
                return true;
            }

        }return false;
//    public static boolean isPalindrome(int num){
//        boolean isPalindrome = true;
//    String str = String.valueOf(num);
//
//    for(int i=0; i<str.length();i++){
//        if(str.charAt(i) != str.charAt(str.length()-1-i)){
//            isPalindrome = false;
//            break;
//        }
//    }
//    return isPalindrome;
//    }


    }
    public static boolean isNumberPalindrome2(int num2){
        int original=num2;
        int reversedNum=0;
        while(num2>0){
           int digit= num2%10;
           num2=num2/10;
           reversedNum=reversedNum*10+digit;
          // reversedNum*=10;
        }
        if(reversedNum==original){
            return true;

    }
        System.out.println(reversedNum);
        return false;
    }

        public static void main(String[] args) {
            String str2="Radar";
            System.out.println(str(str2));
            isNumberPalindrome2( 91018);


    }
}