/*
Student id, name, GPA, semester standing
1, John Smith, 3.9, sophomore
 */

public class Student {
    private int id;
    private String name;
    private double gpa;
    private String semesterStanding;

    // a no arg constructor is implied... (only when others don't exist)
    // when other constructors exist, now we need to
    // explicitly define a no arg constructor

    public Student() {

    }

    public Student(String name, int id, String semesterStanding) {
        this.name = name;
        this.id = id;
        this.semesterStanding = semesterStanding;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getSemesterStanding() {
        return semesterStanding;
    }

    public void setSemesterStanding(String semesterStanding) {
        this.semesterStanding = semesterStanding;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                ", semesterStanding='" + semesterStanding + '\'' +
                '}';
    }
}
