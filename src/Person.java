public class Person {
    public int number;

    public void guess(){
        number=(int)(Math.random()*10);
        System.out.println("Я думаю, что это число "+ number);
    }
}
