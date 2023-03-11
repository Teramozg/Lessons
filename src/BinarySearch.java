import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[17];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println("Введите искомое число.");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(index(array, 0, 16, n));
    }

    public static int index(int[] array, int start, int finish, int n) {
        int halfIndex = (finish + start) / 2;
        if (n <= array[halfIndex]) {
            if (n == array[halfIndex]) {
                return halfIndex;
            }
            return index(array, 0, halfIndex, n);
        } else {
            start = halfIndex + 1;
            return index(array, start, finish, n);
        }
    }
}
