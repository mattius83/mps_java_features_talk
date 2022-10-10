package mattius;

public class Student {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }
    public String toString() {
        return "Name: " + this.name + "\t" + "GPA: " + this.gpa;
    }
    public double getGpa() {
        return this.gpa;
    }
    public void setGpa(double val) {
        this.gpa = val;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String n) {
        this.name = n;
    }
}