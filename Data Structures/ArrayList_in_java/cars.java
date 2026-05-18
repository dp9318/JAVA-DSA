

public class cars {
    String brand;
    String model;
    int year;

    cars(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    @Override
    public String toString(){
        return brand + ", " + model + ", " + year; 
    }
}
