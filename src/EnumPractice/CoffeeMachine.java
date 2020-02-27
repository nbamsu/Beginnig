package EnumPractice;
enum Sizes{
    TALL,GRANDE,VENTI
}
   // To be able to create new class inside a class we need to create innner class without public keyword.
    class Screen{
    int number=1;
    public void printInfo(){
        System.out.println("All info");
    }
    public static class Data{
        public void personInfo(){
            System.out.println("Baha baha, chicago");
        }
    }

    }



public class CoffeeMachine {
    public static void main(String []args){
        //you can not use the new keyword for enum
        Sizes sizes=Sizes.GRANDE;
        switch(sizes){
            case TALL:
                System.out.println("Size is tall");
                break;
            case GRANDE:
                System.out.println("The size is grande");
                break;
            case VENTI:
                System.out.println("small one");
                break;
        }
        Screen sc=new Screen();
        sc.printInfo();
        Screen.Data dt=new Screen.Data();
        dt.personInfo();
        //if inner class static you do not need to use the object from csreen class
        //Example : Data () is static class---> Screen.Data dt=new Screen.Data();

        //If your inner class is not static, you need to use your object from screen class
        // Example : data is not static class --> Screen.Data dt=sc.new Data();
   


    }

}
