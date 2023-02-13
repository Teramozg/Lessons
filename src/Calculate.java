import java.util.Scanner;

public class Calculate {
    public void sum(){
        System.out.println("Введите первое слагаемое.");
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        System.out.println("Введите второе слагаемое.");
        int b=scanner.nextInt();
        System.out.println("Сумма равна "+ (a+b));

    }
    public void minus(){
        System.out.println("Введите первое вычитаемое.");
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        System.out.println("Введите второе вычитаемое.");
        int b=scanner.nextInt();
        System.out.println("Разность равна "+ (a-b));

    }
    public void multiply(){
        System.out.println("Введите первый множитель.");
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        System.out.println("Введите второй множитель.");
        int b=scanner.nextInt();
        System.out.println("Произведение равно "+ (a*b));

    }
    public void divide(){
        System.out.println("Введите делимое.");
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        System.out.println("Введите делитель.");
        int b=scanner.nextInt();
        System.out.println("Частное равно "+ (a/b));

    }

}
