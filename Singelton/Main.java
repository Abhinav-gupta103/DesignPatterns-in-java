package Singelton;

public class Main {
    public static void main(String[] args) {
        Singelton singeltonInstance = Singelton.getInstance();
        singeltonInstance.showMessage();
    }
}
