package ProjectDay;

public class PalindromeWithInt {
    public static Boolean isPalindrome(int num) {
        //int lastIndex = name.length() - 1;
        boolean result = true;
        String str = "" + num;
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length()-1 - i)) {
                result = false;
                break;
            }
        }
        return result;
    }
        public static void main (String[]args){
            System.out.println(isPalindrome(2135312));
        }
}
