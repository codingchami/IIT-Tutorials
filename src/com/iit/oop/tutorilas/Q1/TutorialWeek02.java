package com.iit.oop.tutorilas.Q1;

import com.iit.oop.tutorilas.Q2.Circle;

public class TutorialWeek02 {
    public static void main(String[] args) {
        Person p = new Person("Ben","Danny",2);
        p.displayName();
        p.displaySurame();
        p.displayage();

        System.out.println("******************************************************************************************");

        Circle c = new Circle();
        System.out.println(c.getRadius()+"-"+c.getColour()+"-"+c.getArea());

    }
}
