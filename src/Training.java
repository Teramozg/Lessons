public class Training {
    Person p1= new Person();
    Person p2= new Person();
    Person p3= new Person();

    boolean r1=false;
    boolean r2=false;
    boolean r3=false;

    int targetNum=(int)(Math.random()*10);


    public void start() {

        while (true) {
            System.out.println("Угадываемое число " + targetNum);
            p1.guess();
            p2.guess();
            p3.guess();

            if (p1.number == targetNum) {
                r1 = true;
            }
            if (p2.number == targetNum) {
                r2 = true;
            }
            if (p3.number == targetNum) {
                r3 = true;
            }
            if(r1||r2||r3){
                System.out.println("Стоп игра! У нас есть победитель!");
                if(r1){
                    System.out.println("Это игрок номер один.");
                }
                if (r2){
                    System.out.println("Это игрок номер два.");
                }
                if (r3){
                    System.out.println("Это игрок номер три.");
                }
                break;
            }else {
                System.out.println("Никто не угадал, игроки должны попробовать ещё раз.");
                System.out.println();
            }
        }
    }
}

