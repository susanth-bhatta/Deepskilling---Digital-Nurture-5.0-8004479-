public class CommandPatternTest {

    public static void main(String[] args) {

        // Receiver
        Light light = new Light();

        // Commands
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        // Invoker
        RemoteControl remote = new RemoteControl();

        // Turn Light ON
        remote.setCommand(lightOn);
        remote.pressButton();

        // Turn Light OFF
        remote.setCommand(lightOff);
        remote.pressButton();
    }
}
