class Car {
    private String brand;
    private String model;
    private int year;
    private double price;
    private String color;
    private double mileage;
    private boolean isRegistered;

    public Car() {
        this.brand = "Perodua";
        this.model = "Bezza";
        this.year = 2024;
        this.price = 45000.0;
        this.color = "White";
        this.mileage = 0.0;
        this.isRegistered = true;
    }

    public Car(String brand, String model, int year, double price, String color, double mileage, boolean isRegistered) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.mileage = mileage;
        this.isRegistered = isRegistered;
    }

    public String getBrand() { 
        return brand;
        }
    public String getModel() { 
        return model; 
        }
    public int getYear() { 
        return year; 
        }
    public double getPrice() { 
        return price; 
        }
    public String getColor() { 
        return color; 
        }
    public double getMileage() { 
        return mileage; 
        }
    public boolean isRegistered() { 
        return isRegistered; 
        }

    public void setBrand(String brand) { 
        this.brand = brand; 
        }
    public void setModel(String model) { 
        this.model = model; 
        }
    public void setYear(int year) { 
        this.year = year; 
        }
    public void setPrice(double price) { 
        this.price = price; 
        }
    public void setColor(String color) { 
        this.color = color; 
        }
    public void setMileage(double mileage) { 
        this.mileage = mileage; 
        }
    public void setRegistered(boolean registered) { 
        isRegistered = registered; 
        }

    public void startEngine() {
        System.out.println(brand + " " + model + " engine is starting...");
    }

    public String getCarInfo() {
        return "Brand: " + brand + " \nModel: " + model + 
               "\nYear: " + year + "\nPrice: RM" + price + 
               "\nColor: " + color + "\nMileage: " + mileage + "km" +
               "\nRegistered: " + isRegistered;
    }

    public int calculateAge(int currentYear) {
        return currentYear - year;
    }
}

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car(); 
        Car car2 = new Car("Proton", "Persona", 2024, 85000.0, "Grey", 1500.0, true); 

        System.out.println("=Car 1 Info=");
        System.out.println(car1.getCarInfo());
        car1.startEngine();
        System.out.println();

        car1.setColor("Silver");
        car1.setPrice(46000.0);
        System.out.println("Updated Car 1 Color: " + car1.getColor());
        System.out.println("Updated Car 1 Price: RM" + car1.getPrice());
        System.out.println();

        System.out.println("=Car 2 Info=");
        System.out.println(car2.getCarInfo());
        System.out.println("Car 2 Age: " + car2.calculateAge(2026) + " years old.");
        System.out.println();

        System.out.println("=Price Check=");
        if (car2.getPrice() > 70000.0) {
            System.out.println(car2.getBrand() + " " + car2.getModel() + " is in the Premium price tier.");
        } else {
            System.out.println(car2.getBrand() + " " + car2.getModel() + " is in the Budget price tier.");
        }
        System.out.println();

        System.out.println("=Mileage=");
        car1.startEngine();
        for (int i = 1; i <= 3; i++) {
            car1.setMileage(car1.getMileage() + 100.0); 
            System.out.println("Trip " + i + " completed. Current mileage: " + car1.getMileage() + "km");
        }
        System.out.println();

        System.out.println("=Brand Check");
        String brandToCheck = car1.getBrand();
        switch (brandToCheck) {
            case "Perodua":
                System.out.println("Perodua: Popular local Malaysian compact car brand.");
                break;
            case "Proton":
                System.out.println("Proton: Malaysia's first national car maker.");
                break;
            default:
                System.out.println("Foreign / Other Brand.");
                break;
        }
    }
}