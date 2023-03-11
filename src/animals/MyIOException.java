package animals;

public class MyIOException extends Exception {
    public String getMessage(){

        return "Проверьте параметры ввода.";
    }
}
