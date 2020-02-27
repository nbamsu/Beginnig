package ProjectDay;

public class PalindromeWithString {
    //Write the method will take one String parameter and it will return true if the given String is palindrome.
    public static Boolean isPalindrome(String name) {
        //int lastIndex = name.length() - 1;
        boolean result = true;
        for (int i = 0; i < name.length()/2; i++) {
            if (name.charAt(i) != name.charAt(name.length()-1 - i)) {
                result = false;
                break;
            }
        }
        return result;
    }
        public static void main (String[]args){
            System.out.println(isPalindrome("2442"));
        }
}
