package lecture.interview.Example;

import java.util.Scanner;

public class Phone {

    private String color;

    private String brand;

    private String model;

    private double prices;

    private boolean containCharger;

    private int Warranty;

    private boolean extentWarranty;


    // default phone creating using constructors
    public Phone() {
        color = "Red";
        model = "Galaxy S23 Ultra";
        brand = "Samsung";
        prices = 74999;
    }

    public Phone(String color, String brand, String model, double prices) {
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.prices = prices;

        if (brand.equals("iphone")) {
            containCharger = false;
        } else {
            containCharger = true;
        }

        System.out.println("You want to extent warranty");
        Scanner s = new Scanner(System.in);
        extentWarranty = s.nextBoolean();
//        setExtentWarranty(extentWarranty);
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrices() {
        return prices;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrices(double prices) {
        this.prices = prices;
    }

    public void printPhoneDetails() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Prices : " + prices);
        System.out.println("Color : " + color);
    }

    public void setExtentWarranty() {
        if (extentWarranty) {
            System.out.println("How much by year you want to increase your warranty");
        }
    }

}
