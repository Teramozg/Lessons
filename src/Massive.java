import java.util.Arrays;

public class Massive {
    public static void main(String[] args) {
        int[] index = {8, 3, -6, 9, -7, 2, 5};
        int min=Integer.MAX_VALUE;
        int indexMinElement;
        for (int i = 0; i < index.length; i++) {
            min=index[i];
            indexMinElement = i;
            for (int j = i; j < index.length; j++) {
                if (index[j] < min) {
                    min = index[j];
                    indexMinElement = j;
                }
            }
            int temp;
            temp = index[i];
            index[i] = min;
            index[indexMinElement] = temp;
        }
        for (int i = 0; i < index.length; i++) {
            System.out.print (index[i]+ "  ");
        }
//        Arrays.sort(index);
//        for (int i = 0; i <index.length; i++) {
//            System.out.print(index[i]+ "  ");
//        }
        int maxValue = Integer.MAX_VALUE;
        maxValue+=10;
        System.out.println(maxValue);
    }
}




