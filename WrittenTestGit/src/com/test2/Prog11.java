package com.test2;

abstract class MotorVehicle 
{
    protected String modelName;
    protected String modelNumber;
    protected double modelPrice;

    public MotorVehicle(String modelName, String modelNumber, double modelPrice)
    {
        this.modelName = modelName;
        this.modelNumber = modelNumber;
        this.modelPrice = modelPrice;
    }

    public abstract void display();
}

class Car extends MotorVehicle 
{
    private double discountRate;

    public Car(String modelName, String modelNumber, double modelPrice, double discountRate) 
    {
        super(modelName, modelNumber, modelPrice);
        this.discountRate = discountRate;
    }

    public void setDiscountRate(double discountRate) 
    {
        this.discountRate = discountRate;
    }
    
    public double getDiscountRate() 
    {
        return discountRate;
    }

    public double calculateDiscount() 
    {
    	double discount = modelPrice * discountRate / 100.0;
        return discount;
    }

    @Override
    public void display() 
    {
        System.out.println("Car Name: " + modelName);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Model Price: " + modelPrice+" Rs.");
        System.out.println("Discount Rate: " + discountRate + "%");
    }
}


public class Prog11 
{
    public static void main(String[] args) 
    {
        Car car = new Car("Hyundai Verna", "ABC2008", 950000, 10);
        car.display();

        double discountAmount = car.calculateDiscount();
        System.out.println("Discount Amount: " + discountAmount+" Rs.");
    }
}
