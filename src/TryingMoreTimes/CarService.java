package TryingMoreTimes;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarService {
    private List<Car> carList = new ArrayList<>();

    public Car insertCar() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите вин авто.");
        int vin = scan.nextInt();
        System.out.println("Введите можность авто.");
        int power = scan.nextInt();
        System.out.println("Введите имя владельца.");
        String owner = scan.next();
        System.out.println("Введите страну происхождения авто.");
        String country = scan.next();
        Car car = new Car(vin, power, owner, country);

        return car;
    }

    public void addCar(Car car) {

        carList.add(car);
    }

    public List<Car> getCarList() {

        return carList;
    }

    public void viewListCar() {
        List<Car> listCar=getCarList();
        for (int i = 0; i <listCar.size() ; i++) {
            System.out.println(listCar.get(i));
        }
    }

    public Car findCarByVin() {
        System.out.println("Введите номер ВИН искомого авто.");
        Scanner scan = new Scanner(System.in);
        int vin = scan.nextInt();
        List<Car> carList1 = getCarList();
        Car car = new Car();
        for (int i = 0; i < carList1.size(); i++) {
            car = carList1.get(i);
            car.getVin();
            if (vin == car.getVin()) {
                return car;
            }

        }
        return null;
    }

    public void addCarToFile() {
        try (FileWriter writer = new FileWriter("src/TryingMoreTimes/cars.txt", true)) {
            Car car=insertCar();
            writer.write(car.toString());
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }

}
