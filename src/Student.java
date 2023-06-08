import java.io.Serializable;

public class Student implements Serializable {

    private int id;
    private String name;
    private String department;
    private transient double cgpa;

    //Class constructor

    public Student(int id, String name, String department, double cgpa) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.cgpa = cgpa;
    }

    //Method to display details of student object
    public void displayStudentDetails(){
        System.out.println("ID: "+ this.id + " Name: " + this.name + " Department: "+ this.department + " CGPA: " + this.cgpa );
    }
}
