package org.example;
import java.util.ArrayList;
import java.util.Scanner;

import studentdetails.*;
import studentdetails.Student;
class Studentgpa {
    public static void main(String[] args) {
        String name;
        int age;
        int gpa;
        ArrayList<Student> studentList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("no of student:");
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            System.out.println("Enter the student name,age,gpa:");
            name = sc.next();
            age = sc.nextInt();
            gpa = sc.nextInt();
            Student stu=new Student(name,age,gpa);
            studentList.add(stu);
        }
        sc.close();
        for(Student stud:studentList){
            System.out.println("Name: " + stud.getName());
            System.out.println("Age: " + stud.getAge());
            System.out.println("GPA: " + stud.getGpa());
        }


        studentList.sort(new StockComparator());
        System.out.println("After Sorting ");
        for(Student stud:studentList){
            System.out.println("Name: " + stud.getName());
            System.out.println("Age: " + stud.getAge());
            System.out.println("GPA: " + stud.getGpa());
        }
    }
}
