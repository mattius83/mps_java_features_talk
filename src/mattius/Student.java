package mattius;
import java.util.UUID;

public class Student {
    private String name;
    private double gpa;
    private String id;


    public Student(String name, double gpa) {
        UUID uuid = UUID.randomUUID();
        String uuidAsString = uuid.toString();

        this.name = name;
        this.gpa = gpa;
        this.id = uuidAsString;
    }
    public String toString() {
        return "("+ this.id + ")" + "Name: " + this.name + "\t" + "GPA: " + this.gpa;
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