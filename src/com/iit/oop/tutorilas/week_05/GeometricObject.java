package com.iit.oop.tutorilas.week_05;

public abstract class GeometricObject {
    private String colour;
    private boolean filled;

    public GeometricObject() {
    }

    public GeometricObject(String colour, boolean filled) {
        this.setColour(colour);
        this.setFilled(filled);
    }


    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "GeometricObject{" +
                "colour='" + colour + '\'' +
                ", filled=" + filled +
                '}';
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract String getShape();
}
