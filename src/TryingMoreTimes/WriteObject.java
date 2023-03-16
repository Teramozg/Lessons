package TryingMoreTimes;

import java.io.*;

public class WriteObject {
    public static void main(String[] args) {

        Person[] people={new Person(1, "Bob"),new Person(2, "Billi"), new Person(3,"Timmy")};

        try {
            FileOutputStream fos = new FileOutputStream("src/TryingMoreTimes/people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(people);

            oos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
