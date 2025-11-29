package DesignPattern;

interface commandPattern {
    void execute();
}

class LighOnCommand implements commandPattern{
    Light light;

    public LighOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}

class LightOffCommand implements commandPattern{
    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}

class Light{
    void on(){
        System.out.println("Light is ON");
    }

    void off(){
        System.out.println("Light is OFF");
    }
}

class RemoteControl{
    commandPattern slot;

    public void setCommand(commandPattern command){
        this.slot = command;
    }

    public void pressButton(){
        slot.execute();
    }
}

public class command {
    public static void main(String[] args) {
        Light light = new Light();

        commandPattern lightOn = new LighOnCommand(light);
        commandPattern lightOff = new LightOffCommand(light);

        RemoteControl remote = new RemoteControl();

        // Turn the light ON
        remote.setCommand(lightOn);
        remote.pressButton();

        // Turn the light OFF
        remote.setCommand(lightOff);
        remote.pressButton();
    }
}