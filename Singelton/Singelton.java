package Singelton;

public class Singelton {

    // 1. Create a private staic instance of the Singelton class (lazy
    // initialization).
    private static Singelton instance;

    // 2. Make the constructor private so that it cannot be instantiated from
    // outside the class.
    private Singelton() {

    }

    // 3. Provide a public static method that returns the singelton instance.
    // 4. to make this class thread safe meke this function synchronized
    public static Singelton getInstance() {
        if (instance == null) {
            instance = new Singelton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singelton");
    }
}
