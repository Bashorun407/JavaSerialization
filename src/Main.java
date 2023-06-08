import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Hello world!");

        Student student = new Student(113, "Babajide", "Computer Engineering", 4.8);

        //Calling method to serialize student object
        SerializeDemo.serializeObject(student);

        //Calling method to de-serialize student object 'written' in SerializeObject.txt text file in Documents
        //directory of this device

      Student newStudent =  (Student) DeserializeDemo.deserializeObject();

      //to display newStudent infomation
        newStudent.displayStudentDetails();
    }
}