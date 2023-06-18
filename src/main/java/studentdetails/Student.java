package studentdetails;

import java.util.logging.Logger;

public class Student {
    String name;
    int age;
    int gpa;

    Logger lol = Logger.getLogger("gpa");
    public Student(String name, int age, int gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    public String getName(){
        return name;
    }
    public String getAge(){
        return Integer.toString(age);
    }
    public String getGpa(){
        return Integer.toString(gpa);
    }
}
