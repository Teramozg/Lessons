package animals;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CatService {
    private OwnerService ownerService = new OwnerService();

    public List<Cat> getAllListCats() {
        List<Cat> catsList = new ArrayList<>();
        File file = new File("src/animals/cats.txt");
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
                String gender = split[2];
                int idOwner = Integer.parseInt(split[3]);
                Owner ownerById = ownerService.getOwnerById(idOwner);
                Cat cat = new Cat(id, name, gender, ownerById);
                catsList.add(cat);
                line = reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return catsList;
    }

    public Cat findCatByID(int id) throws MyException {
        List<Cat> allCatsList = getAllListCats();
        Cat cat = new Cat();
        for (int i = 0; i < allCatsList.size(); i++) {
            cat = allCatsList.get(i);
            cat.getId();
            if (id == cat.getId()) {
                return cat;
            }
        }
        throw new MyException();

    }

    public void addCatToFile() {


        Scanner scan = new Scanner(System.in);
        int id = getMaxIdCat() + 1;
        System.out.println("Введите имя кота");
        String name = scan.next();

        System.out.println("Введите пол кота");
        String male = scan.next();

        System.out.println("Введите имя хозяина кота");
        String own = scan.next();

        int OwId = ownerService.getMaxIdOwner() + 1;
        Owner owner = new Owner(OwId, own);
        try (FileWriter ownerWriter = new FileWriter("src/animals/owner.txt", true)) {

            ownerWriter.write(owner.getId() + "," + owner.getName());
            ownerWriter.append('\n');
            ownerWriter.flush();
        } catch (IOException ex) {
            System.out.println("Привет из кэтча.");
        }

        try (FileWriter writer = new FileWriter("src/animals/cats.txt", true)) {
            Cat cat = new Cat(id, name, male, owner);
            writer.write(cat.getId() + "," + cat.getName() + "," + cat.getGender() + "," + owner.getId());
            writer.append('\n');
            writer.flush();
        } catch (IOException e) {

            System.out.println(e.getMessage());
        }

    }

    private int getMaxIdCat() {

        List<Cat> allListCats = getAllListCats();
        int max = 0;
        for (Cat cat : allListCats) {
            if (cat.getId() > max) {
                max = cat.getId();
            }
        }
        return max;
    }
// TODO: 07.03.2023 "причесать приложение" create,read, update, delete.CRUD

    public Cat delCat(int catId) {
        List<Cat> listCat = getAllListCats();
        Iterator<Cat> catIterator = listCat.iterator();//создаем итератор
        while (catIterator.hasNext()) {//до тех пор, пока в списке есть элементы

            Cat nextCat = catIterator.next();//получаем следующий элемент
            if (nextCat.getId()==catId) {
                catIterator.remove();//удаляем кота с нужным именем
            }
        }
        try {
            FileOutputStream fos = new FileOutputStream("src/animals/cats.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(catIterator);

            oos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}

