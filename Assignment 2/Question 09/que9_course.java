package assignment2;

import java.util.Scanner;

class Course {
    private String courseName;
    private String duration;

    public Course(String courseName, String duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return courseName + " (" + duration + ")";
    }
}

class Student {
    protected String name;
    protected Course enrolledCourse;

    public Student(String name, Course enrolledCourse) {
        this.name = name;
        this.enrolledCourse = enrolledCourse;
    }

    @Override
    public String toString() {
        return "Student: " + name +
                " Course: " + enrolledCourse;
    }
}

class PremiumStudent extends Student {
    private int discount;

    public PremiumStudent(String name, Course enrolledCourse, int discount) {
        super(name, enrolledCourse);
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Premium Student: " + name +
                " Course: " + enrolledCourse +
                " Discount: " + discount + "%";
    }
}

public class que9_course {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Course input
        String[] courseData = sc.nextLine().split(",");

        String courseName = courseData[0].trim();
        String duration = courseData[1].trim();

        Course course = new Course(courseName, duration);

        // Normal student
        String[] studentData = sc.nextLine().split(",");

        String studentName = studentData[0].trim();

        Student student = new Student(studentName, course);

        // Premium student
        String[] premiumData = sc.nextLine().split(",");

        String premiumName = premiumData[0].trim();
        int discount = Integer.parseInt(premiumData[2].trim());

        PremiumStudent premiumStudent =
                new PremiumStudent(premiumName, course, discount);

        System.out.println(student);
        System.out.println(premiumStudent);

        sc.close();
    }
}