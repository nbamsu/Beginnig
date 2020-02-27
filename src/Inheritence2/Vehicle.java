package Inheritence2;

public class Vehicle {

        String vehiclename;
        int year;
        public Vehicle(String vehiCleName){
                this.vehiclename=vehiCleName;
                System.out.println("Vehicle one argument constructor");
        }
        public Vehicle(String vehicleName, int year){
                this(vehicleName);
                this.year=year;
                System.out.println("Vehicle two argument constructor");
        }

       public static void main(String []args){
                Vehicle vehicle=new Vehicle("Toyota",2005);
        }


}
