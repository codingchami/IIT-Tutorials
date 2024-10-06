package com.iit.oop.week_01_Tut.Q1;

public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(){
        name= null;
        surname = null;
        age = 0;
    }

    public Person(String name,String surname,int age){
        this.name = name;
        this.surname = surname;
        this.age =age;
    }
    public void displayName(){
        System.out.println(name);
    }
    public void displaySurame(){
        System.out.println(surname);
    }
    public void displayage(){
        System.out.println(age);
    }
    public void SetSurname(String s){
        this.surname = s;
    }
    public void setAge(int a){
        this.age = a;
    }
    public String getSurname(){
        return surname;
    }
    public int getAge(){
        return age;
    }
}
