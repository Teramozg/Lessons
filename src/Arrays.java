public class Arrays {
    public static void main(String[] args) {
        int[] index=new int[4];
        index[0]=1;
        index[1]=3;
        index[2]=0;
        index[3]=2;
        String[] islands=new String[4];
        islands[0]="Bermudas";
        islands[1]="Fiji";
        islands[2]="Azoras";
        islands[3]="Kosumel";
        int x=0;
        int y;
        while(x<4){
            y=index[x];
            System.out.println(islands[y]);
            x++;
        }
    }
}
