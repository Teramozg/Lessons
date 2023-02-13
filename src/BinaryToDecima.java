import java.util.Scanner;

public class BinaryToDecima {
    public static void main(String[] args) {
        System.out.println("Введите число в двоичной системе исчисления.");
        Scanner scan = new Scanner(System.in);
       long input = scan.nextInt();
       int step=1;
       int decima=0;
       while(input>0){
            long temp=(input%10)*step;
            input=input/10;
            step=step*2;
           decima=decima+(int)temp;
       }
        System.out.println(decima);
    }
}
