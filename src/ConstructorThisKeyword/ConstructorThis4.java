package ConstructorThisKeyword;
class Student{
    private String name;
    private int rollNumber;
    public Student(){
        System.out.println("Default constructor");
    }
    public Student(String name){
        this();
        System.out.println("Single parameter constructor called");
    }
    public Student(String name, int rollNumber){
        this(name);
        this.name = name;
        this.rollNumber = rollNumber;
        System.out.println("Two parameter constructor called");
    }
    public String getName(){
        return name;
    }
    public int getRollNumber(){
        return rollNumber;
    }
}
public class ConstructorThis4 {
    public static void main(String args[]) {
        Student obj=new Student("Shreya",202180);
        System.out.println("Name: "+obj.getName());
        System.out.println("Roll Number: "+obj.getRollNumber());
    }
}
