import java.io.*;

//Class attempts to deserialize serialized Student class
public class DeserializeDemo {

    //Method to De-serialize object
    public static Object deserializeObject() throws FileNotFoundException {
        FileInputStream fileInputStream;
        ObjectInputStream objectInputStream;
        Object obj; //the newly deserialized object
        //Locating the file from which object will be de-serialized
        try{
            fileInputStream = new FileInputStream("C:\\Users\\Akinbobola Oluwaseyi\\Documents\\SerializedObject.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);

            //Writing the object
             obj = (Object) objectInputStream.readObject();



        }
     catch (FileNotFoundException e) {
        throw new RuntimeException(e);
    } catch (IOException e) {
        throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Object de-serialization is complete.");

        //Return the object created to its caller
        return obj;
    }
}
