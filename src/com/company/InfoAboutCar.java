package com.company;

public class InfoAboutCar {
    private int yearOfIssue;
    private String model;
    private int price;
    private String color;

    public  InfoAboutCar() {
    }
    public InfoAboutCar(int yearOfIssue, String model, int price, String color) {
        this.yearOfIssue = yearOfIssue;
        this.model = model;
        this.price = price;
        this.color = color;
    }
    public int getYearOfIssue() {
        return yearOfIssue;
    }
    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }
    public String getModel() {
        return model;
    }
    public void setModel (String model) {
        this.model = model;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice (int price) {
        this.price = price;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Info about car -> "+
                "year of issue: " + yearOfIssue + ", "+
                "model: " + model + ", "+
                "price: $ " + price + ", " +
                "color: " + color + ".";
    }
}