package Command_Pattern;

// Step 2:-  Concrete Commands for each operation
public class FanOffCommand implements Command {
    public Fan fan;

    public FanOffCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        this.fan.turnOff();
    }
}