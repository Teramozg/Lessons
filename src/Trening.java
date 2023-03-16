import java.util.Scanner;

public class Trening {
    public static void main(String[] args) {
            Calculate c = new Calculate();
            while(true) {
                System.out.println();
                System.out.println("Вводите 1 если нужно выполнить сложение");
                System.out.println("Вводите 2 если нужно выполнить вычитание");
                System.out.println("Вводите 3 если нужно выполнить умножение");
                System.out.println("Вводите 4 если нужно выполнить деление");
                System.out.println("Вводите 5 если нужно вычислить факториал");

                Scanner scan = new Scanner(System.in);
                int action = scan.nextInt();
                if (action == 1) {
                    c.sum();
                } else if (action == 2) {
                    c.minus();
                } else if (action == 3) {
                    c.multiply();
                } else if (action == 4) {
                    c.divide();
                } else if(action==5) {
                    System.out.println(c.factorial(5));
                }

            }
    }
}
