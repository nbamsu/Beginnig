package SwitchPractice;

public class NestedSwitchPractice {
    public static void main(String[] args) {
        char ch='a';
        int number=5;
        String animalName="Dog";
        final String animalCat="cat";
        switch (ch){
            case 'a':
                switch (number){
                    case 5:
                        System.out.println(""+ch+5);
                        break;
                    case 10:
                        System.out.println(""+ch+10);
                        break;
                }
                break;
            case 'b':
                switch (animalName){
                    case "Dog":
                        System.out.println("You animal kind is Dog");
                        break;
                    case animalCat:
                        System.out.println("You animal kind is Cat");
                        break;
                }
                break;
        }
    }
}
