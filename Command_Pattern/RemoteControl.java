package Command_Pattern;

// Step 4:- The Invoker (Remote Control) Class which will trigger commands
public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
