package io.github.jiangdequan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.*;


public class Student {
    private String name;
    private int id;
    private List <String> Courses;
//2
public void Student(String name, int id) {
    this.name=name;
    this.id=id;
    this.Courses = new ArrayList<>();
    }

public Student(String name, int id) {
    this.name = name;
    this.id = id;
    }
//3
public class Main {
    public static void main(String[] args) {
        Map<Integer, Student> studentMap= new HashMap<>();

        Student student1=new Student("Jason ", 2001);
        Student.addCourse("Math");
        Student.addCourse("Science");
        Student.addCourse("History");
        studentMap.put(student1.getId(), student1);

        Student student2=new Student("Ava ", 2002); 
        Student.addCourse("English");
        Student.addCourse("Science");
        Student.addCourse("Art");
        studentMap.put(student1.getId(), student1);


        Student student3=new Student("Mike ", 2003);
        Student.addCourse("Math");
        Student.addCourse("History");
        Student.addCourse("Geography");

        //4
        studentMap.put(student1.getId(), student1);

        //5
        for(Entry<Integer, Student> entry : studentMap.entrySet()) {
            Integer key = entry.getKey();
            Student value = entry.getValue();
            System.out.println(key + ": " + value);
        }
        
        ArrayList<String> allCourses = new ArrayList<>();
        for (Student student : studentMap.values()) {
            allCourses.addAll(student.getCourses());
        }
        //6
        System.out.println("All Courses:");
        for (String course : allCourses) {
            System.out.println(course);
        }
        //7
        Set<String> uniqueCourses = new HashSet<>(allCourses);

        //8
        System.out.println("Unique Courses:");
        for (String course : uniqueCourses) {
            System.out.println(course);
        }

        //9
        Map<String, List<Student>> courseMap = new HashMap<>();
        for (Student student : studentMap.values()) {
            List<String> courses = Student.getCourses();
            for (String course : courses) {
                if (!courseMap.containsKey(course)) {
                    courseMap.put(course, new ArrayList<>());
                }
                courseMap.get(course).add(student);
            }
        }

        //10
        for (Map.Entry<String, List<Student>> entry : courseMap.entrySet()) {
            String course = entry.getKey();
            List<Student> students = entry.getValue();

            System.out.println("Course: " + course);
            System.out.println("Students taking this course:");
            for (Student student : students) {
                System.out.println(student.getName());
            }
            System.out.println();
        }
        //11
        List<String> studentsStartingWithJ = studentMap.values()
                .stream()
                .filter(student -> student.getName().startsWith("J"))
                .map(Student::getName)
                .toList();

        System.out.println("Students with 'J' Names: ");
        studentsStartingWithJ.forEach(System.out::println);
    }
}

public static void addCourse(String string) {
}

public static List<String> getCourses() {
    return null;
}

public static void addCourse(String string, String string2, String string3) {
}
public String getName() {
    return name;
}

public int getId() {
    return id;
}
public List<String> getCourse() {
    return Courses;
}

public void addcourse(String Course) {
    Courses.add(Course);
}
}



