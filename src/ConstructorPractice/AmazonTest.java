package ConstructorPractice;

public class AmazonTest {
    public static void main(String[] args) {
       // Amazon.navigate("https://www.Amazon.com");
       Amazon.navigate(TestData.URL);
        // Amazon.logIn("");
        Amazon.logIn(TestData.userName,TestData.password);
        Amazon.search(TestData.item);
    }

}
