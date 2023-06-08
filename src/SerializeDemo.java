import java.io.*;

//Class attempts to serialize Student class
public class SerializeDemo {

//Public method to serialize object
    public static void serializeObject(Object obj){


        FileOutputStream fileOutputStream;
        ObjectOutputStream objectOutputStream;

        {
            try {
                //FileInput Stream accepting the location of the document serialized object will be kept
                fileOutputStream = new FileOutputStream("C:\\Users\\Akinbobola Oluwaseyi\\Documents\\SerializedObject.txt");

                //ObjectOutputStream to write object to specified location
                objectOutputStream = new ObjectOutputStream(fileOutputStream);

                //Writing to the file location specified in the string
                objectOutputStream.writeObject(obj);

                //closing the streams
                objectOutputStream.close();
                fileOutputStream.close();

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Serialization of object is complete.");
    }

}
