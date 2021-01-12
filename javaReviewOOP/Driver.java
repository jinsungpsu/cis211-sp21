/*
Jin An
DTCC
CIS211
1/12/2021
 */

public class Driver {

    public static void main(String[] args) {
        // I'm gonna create 10 "student" objects
        // take the info from the csv

        Student stu1;
        stu1 = new Student();
        // equivalent to Student stu1 = new Student();

        stu1.setName("John");
        stu1.setSemesterStanding("Senior");

        Student stu2 = new Student();
        //stu2.id = 2;
        //id is private, so I need to use setters and getters

        stu2.setId(2);

        System.out.println("Student id: " + stu2.getId());
        System.out.println(stu2);
        // that is equivalent to
        System.out.println(stu2.toString());


        // I want to be able to create a new student object
        // that already has some initial properties

        Student stu3 = new Student("Joe", 3, "Senior");
    }
}
