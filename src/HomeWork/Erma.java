package HomeWork;

public class Erma {
    public static void main(String[] args) {
        String num = "1236321";
        int len = num.length() - 1;
        String temp = "";
        for (int i = 0; i < num.length() / 2; i++) {
            if (num.charAt(i) != num.charAt(num.length() - 1 - i))
                System.out.println(false);
//             else
                System.out.println(true);

//            temp+=num.charAt(i);
//
//        }
//        if (num.equals(temp)){
//            System.out.println(true);
//        }else{
//            System.out.println(false);
//        }

    }

    }}