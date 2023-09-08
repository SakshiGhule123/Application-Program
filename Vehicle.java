package com.java.demo.intro;

class Vehicle 
{
    private String make;
    private String model;
    private int year;
    private String fuelType;

    public Vehicle(String make, String model, int year, String fuelType)
    {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getFuelType() {
        return fuelType;
    }

    
    public double calculateFuelEfficiency() {
       
        return 0.0;
    }

    
    public double calculateDistanceTraveled(double time, double speed) {
        
        return time * speed;
    }

    
    public double getMaximumSpeed() {
       
        return 0.0;
    }
    
    public int calculateMaxSpeed() {
       
        return 0;
    }
}

class Truck extends Vehicle {
	
    public Truck(String make, String model, int year, String fuelType)
    {
        super(make, model, year, fuelType);
    }

    
    public double calculateFuelEfficiency() 
    {
       
        return 8.0; 
    }

    @Override
    public int calculateMaxSpeed() 
    {
        
        return 70; 
    }
}

class Car extends Vehicle 
{
    public Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public double calculateFuelEfficiency() {
        
        return 25.0; 
    }

    @Override
    public int calculateMaxSpeed() {
        
        return 120; 
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public double calculateFuelEfficiency() {
       
        return 50.0;
    }

    @Override
    public int calculateMaxSpeed() {
        
        return 150; 
    }
}
public class ShowRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck obj1 = new Truck("Ford", "F-150", 2023, "Diesel");
        Car obj2 = new Car("Toyota", "Camry", 2023, "Gasoline");
        Motorcycle obj3 = new Motorcycle("Harley-Davidson", "Sportster", 2023, "Gasoline");
        
        System.out.println(obj1.calculateDistanceTraveled(60, 5));
        System.out.println( obj1.calculateFuelEfficiency());
        System.out.println(obj1.calculateMaxSpeed());
        System.out.println(obj1.getModel());
        
        System.out.println(obj2.calculateDistanceTraveled(60, 5));
        System.out.println( obj2.calculateFuelEfficiency());
        System.out.println(obj2.calculateMaxSpeed());
        System.out.println(obj2.getModel());
        
	}

}
