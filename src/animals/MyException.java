package animals;

public class MyException extends  Exception{
    @Override
    public String getMessage() {
        return "отсутствует кот.";
    }
}
