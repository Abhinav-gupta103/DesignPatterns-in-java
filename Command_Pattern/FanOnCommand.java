package Command_Pattern;

// Step 2:-  Concrete Commands for each operation
public class FanOnCommand implements Command {
    public Fan fan;

    public FanOnCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        this.fan.turnOn();
    }

}
