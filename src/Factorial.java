import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Введите число искомого факториала.");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println("Факториал введённого числа составляет "+factor(n));
    }

    public static int factor(int n) {
        if (n==1){
            return 1;
        }
        return n*factor(n-1);
    }
}
