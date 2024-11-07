package com.iit.oop.tutorilas.Exception_handling;

public class Main{
    public static void main(String args[]) {
        try {
            int myArray[] = new int[5];
// trying to access element 5
            System.out.println(myArray[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The element " + e.getMessage() + " does not exist!");
        }
    }
}

