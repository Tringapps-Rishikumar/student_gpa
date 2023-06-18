package org.example;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import studentdetails.*;
import studentdetails.Student;
class Studentgpa {
    public static void main(String[] args) {
        Logger lol = Logger.getLogger("gpa");
        String name;
        int age;
        int gpa;
        ArrayList<Student> studentList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
       lol.log(Level.INFO, () ->"no of student:");
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            lol.log(Level.INFO, () ->"Enter the student name,age,gpa:");
            name = sc.next();
            age = sc.nextInt();
            gpa = sc.nextInt();
            Student stu=new Student(name,age,gpa);
            studentList.add(stu);
        }
        sc.close();
        for(Student stud:studentList){
            lol.log(Level.INFO, () ->"Name: " + stud.getName());
            lol.log(Level.INFO, () ->"Age: " + stud.getAge());
            lol.log(Level.INFO, () ->"GPA: " + stud.getGpa());
        }


        studentList.sort(new StockComparator());
        System.out.println("After Sorting ");
        for(Student stud:studentList){
            lol.log(Level.INFO, () ->"Name: " + stud.getName());
            lol.log(Level.INFO, () ->"Age: " + stud.getAge());
            lol.log(Level.INFO, () ->"GPA: " + stud.getGpa());
        }
    }
}
