package SetCollaction;

public class Flowers {
    String name;
    String color;

    public Flowers(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String toString() {

        return "The name of the flower is " + name + " Color is " + color;
    }

    public static int numbers(String str) {
        String str1 = "";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                String nm = "" + str.charAt(i);
                int num = Integer.parseInt(nm);
                sum += num;
            }
        }return sum;
    }
}