public class Car{
    String brand;
    String color;
    String model;
    int year;
    double value;
    Car (String brand, String color, String model, int year, double value){
        this.brand = brand;
        this.color = color;
        this.model = model;
    }
    void honk(){
        System.out.println("beep!");
    }
}

