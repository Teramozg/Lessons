package TryingMoreTimes;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Launch {
    public static void main(String[] args) {
        while(true) {
            System.out.println();
            System.out.println("Введите 1 для добавления авто.");
            System.out.println("Введите 2 для отображения инфо по всем авто.");
            System.out.println("Введите 3 для поиска авто по VIN.");
            System.out.println("Введите 4 для добавления и записи авто в файл.");

            CarService carService = new CarService();
            Car car = new Car();
            Scanner scan = new Scanner(System.in);
            int action = scan.nextInt();

            if (action == 1) {
                car=carService.insertCar();
                carService.addCar(car);

            }
            if (action == 2) {
                carService.viewListCar();

            }
            if (action == 3) {
                carService.findCarByVin();
                car.toString();
            }
            if (action == 4) {
                carService.addCarToFile();
            }
        }
    }
}
