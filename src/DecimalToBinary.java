import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {
        System.out.println("Введите число, которое нужно преобразовать.");
        double pi = Math.PI;
        Scanner scanner = new Scanner(System.in);
        int dec = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        while (dec > 0) {
            sb.append(dec % 2);
            dec = dec / 2;
        }
        System.out.println("Число в двоичном представлении:  " + sb.reverse());


    }

}
