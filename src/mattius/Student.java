package mattius;
import java.util.UUID;

public class Student {
    private String name;
    private double gpa;
    private String gender;
    private String id;


    public Student(String name, double gpa) {
        UUID uuid = UUID.randomUUID();
        String uuidAsString = uuid.toString();

        this.name = name;
        this.gpa = gpa;
        this.id = uuidAsString;
    }

    public Student(String name, double gpa, String gender) {
        UUID uuid = UUID.randomUUID();
        String uuidAsString = uuid.toString();

        this.name = name;
        this.gpa = gpa;
        this.gender = gender;
        this.id = uuidAsString;
    }
    public String toString() {
        if ( this.gender == "MALE") {
            return "MALE ("+ this.id + ")" + "Name: " + this.name + "\t" + "GPA: " + this.gpa;
        } else {
            return "FEMALE" + this.id + ")" + "Name: " + this.name + "\t" + "GPA: " + this.gpa;
        }

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
    public String getGender() {
        return this.gender;
    }

    public String setGender(String gender) {
        return this.gender = gender;
    }
}