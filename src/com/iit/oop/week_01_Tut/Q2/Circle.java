package com.iit.oop.week_01_Tut.Q2;

public class Circle {
    private double radius;
    private String colour;

    public Circle(){
        radius = 1;
        colour = "Blue";
    }

    public Circle(double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public void setColour(String colour){
        this.colour = colour;
    }

    public double getRadius(){
        return radius;
    }
    public String getColour(){
        return colour;
    }
    public double getArea(){
        return radius*radius*3.14;
    }
}
