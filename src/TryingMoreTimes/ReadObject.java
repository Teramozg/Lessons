package TryingMoreTimes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis=new FileInputStream("src/TryingMoreTimes/people.bin");
            ObjectInputStream ois=new ObjectInputStream(fis);

            Person[] people=(Person[])ois.readObject();
            System.out.println(Arrays.toString(people));

           ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
