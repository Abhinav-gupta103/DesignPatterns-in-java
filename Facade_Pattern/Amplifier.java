package Facade_Pattern;

// Subsystem Classes
public class Amplifier {
    public int level = 30;

    public void on() {
        System.out.println("Amplifier is on.");
    }

    public void increaseVolume() {
        if (this.level <= 100)
            this.level++;
        System.out.println("Amplifier volume set to " + this.level);
    }

    public void decreaseVolume() {
        if (this.level >= 0)
            this.level--;
        System.out.println("Amplifier volume set to " + this.level);
    }

    public void off() {
        System.out.println("Amplifier is off.");
    }
}
