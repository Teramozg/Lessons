package animals;

import com.sun.xml.internal.ws.policy.PolicyMapUtil;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AnimalsMain {
    public static void main(String[] args) throws MyException, MyIOException {
        CatService catService = new CatService();

        while (true) {
            System.out.println();
            System.out.println("Вводите 1 если нужно вывести инфо всех котов");
            System.out.println("Вводите 2 если нужно найти кота по ID ");
            System.out.println("Вводите 3 если нужно записать кота в файл. ");
            System.out.println("Введите 4, если хотите удалить кота.");

            Scanner scan = new Scanner(System.in);
            int action = 0;
            try {
                action = scan.nextInt();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            if (action == 1) {
                List<Cat> allListCats = catService.getAllListCats();
                for (int i = 0; i < allListCats.size(); i++) {
                    System.out.println(allListCats.get(i));
                }
            } else if (action == 2) {
                System.out.println("Введите номер искомого кота.");
                int search=0;
                try{search= scan.nextInt();
                }catch(Exception c){
                    System.out.println(c.getMessage());
                }
                try {
                    System.out.println(catService.findCatByID(search));
                } catch (MyException e) {
                    System.out.println(e.getMessage());
                }

            } else if (action == 3) {
                catService.addCatToFile();

            } else if (action==4) {
                System.out.println("Введите Ид удаляемого кота.");
                int catId= scan.nextInt();
                catService.delCat(catId);
            }

        }
    }
}
