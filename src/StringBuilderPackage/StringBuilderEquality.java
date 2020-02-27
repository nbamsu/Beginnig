package StringBuilderPackage;

public class StringBuilderEquality {

    public static void main(String[] args) {
        StringBuilder sName = new StringBuilder();
        StringBuilder sName1 = new StringBuilder();
        StringBuilder sName2 = sName.append("Techtorial");
        System.out.println(sName == sName1);
        System.out.println(sName == sName2);

        StringBuilder sName3 = new StringBuilder("Tech");
        StringBuilder sName4 = new StringBuilder("Tech");
        sName3.equals(sName4);
        System.out.println(sName3.equals(sName4));
        //car car=new car("Toyota);
        //car car1=new Car("Toyota")
        // == where they are pointing same object
        //car.equals(car1); --> where they are pointing same object
        // .equals() method int String is coming from String Class
        StringBuilder stringBuilder= new StringBuilder("GAMDKJDHO2UY658HFE7KN12BL39KGAE");
        //create one method that will take StringBuilder value.
        //from this StringBuilder, it will print only letters between D to G
        //GDDE
        searchLetter(stringBuilder);

    }
    public static void searchLetter(StringBuilder stringBuilder){
        for(int i=0;i<stringBuilder.length();i++){
            char ch=stringBuilder.charAt(i);
            if (ch>='D'&&ch<='G'){
                System.out.print(ch);
            }

        }
    }
}
