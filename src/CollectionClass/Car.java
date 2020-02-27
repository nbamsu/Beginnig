package CollectionClass;

public class Car {
    private String model;
    private int year;
    private int horsePower;
    private String brand;

    // if you want to call member of parent class in child class you can use super keyword
    public Car(String model,int year,int horsePower,String brand){
        this.model=model;
        this.year=year;
        this.horsePower=horsePower;
        this.brand=brand;
    }

    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public int getHorsePower(){
        return  horsePower;
    }
    public String getBrand(){
        return brand;
    }
    //This is overRiding of toString method from Object Class  (don't need annotation --> @Override)
    public String toString(){
        return " Brand : "+this.brand+" Model : "+this.model+" Horse Power :"+this.horsePower+" Year : "+this.year;
    }

}
