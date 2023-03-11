package animals;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class OwnerService {
    public Owner getOwnerById(int ownerId) {
        List<Owner> listOwner=getAllOwner();
        for (Owner owner:listOwner) {
            if (ownerId == owner.getId()) {
                return owner;
        }
        }
        return null;
    }
    public int getMaxIdOwner(){

        List<Owner> ownerList =getAllOwner();
        int max=0;
        for (Owner owner:ownerList ) {
            if(owner.getId()>max){
                max=owner.getId();
            }
        }
        return max;
    }
    private List<Owner> getAllOwner(){
        List<Owner> listOwner = new ArrayList<>();
        File file = new File("src/animals/owner.txt");
        FileReader fr = null;
        try {
            fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("Не найден файл");
        }
        BufferedReader reader = new BufferedReader(fr);
        String line = null;
        try {
            line = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        while (line != null) {
            try {
                String[] split = line.split(",");
                int id = Integer.parseInt(split[0]);
                String name = split[1];
                Owner owner = new Owner(id, name);
                listOwner.add(owner);
                line = reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return listOwner;
    }
}