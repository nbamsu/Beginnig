package lambdaIntro;

public class LambdaHomework {
    /*
    1. () -> System.out.println("bye");
2. (String name) -> name.length();
3. s -> System.out.println("Let's go to "+s);
4. (String lastName, int age) -> {
	System.out.println("Last name "+lastName+" age: "+age);
}
5. public interface customInterface{
	int getPrice(String product);
}
6. (key, value) -> System.out.println("Key: "+key+", value: "+value);
You will need to create corresponding interfaces for lambda expressions.
For task #5 create correct lambda expression
     */
    public static void main(String[] args) {

        Empty lama=()-> System.out.println("buy");
    Empty2 lama2=(String name)->name.length();
    Empty3 lama3=s-> System.out.println("Let's go to "+s);

    }
}
