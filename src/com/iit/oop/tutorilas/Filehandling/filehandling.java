package com.iit.oop.tutorilas.Filehandling;

import java.io.File;
import java.util.Scanner;

class Student{
    private String id;
    private String name;
    private double mark;

    public Student() {
    }

    public Student(String id, String name, double mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
}

class StudentManagement{
    File file = new File("");
    Scanner input = new Scanner(System.in);
    public void addStudent() {
        System.out.print("Enter Student ID: ");
        String id = input.nextLine();

        System.out.print("Enter Student Name: ");
        String name = input.nextLine();

        System.out.print("Enter Student Mark: ");
        double mark = input.nextDouble();
        input.nextLine(); // consume newline

        Student student = new Student(id, name, mark);
        writeStudentToFile(student);
        System.out.println("Student added successfully.");
    }
}

private void writeStudentToFile(Student student) {
//    try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
//        writer.write(student.toString());
//        writer.newLine();
//    } catch (IOException e) {
//        System.out.println("An error occurred while writing to the file: " + e.getMessage());
//    }
}

public class filehandling {
    public static void main(String[] args) {
        StudentManagement s1 = new StudentManagement();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("\nStudent Management Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = input.nextInt();
            input.nextLine(); // consume newline

            switch (choice) {
                case 1:
//                    addStudent();
                    break;
                case 2:
//                    viewAllStudents();
                    break;
                case 3:
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }


    }


}
