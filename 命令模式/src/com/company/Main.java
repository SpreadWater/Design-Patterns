package com.company;

public class Main {

    public static void main(String[] args) {
        // Light is a Receiver[厨师]
        Light light = new LEDLight();
        // Command is an Order[订单] and set a Receiver[厨师]
        Command lightOnCommand = new LightOnCommand(light);
        // remoteControl is an Invoker[女接待]
        SimpleRemoteControl remote = new SimpleRemoteControl();
        //[女接待]Invoker takeOrder / receive Commands.
        remote.setCommand(lightOnCommand);
        //[订单] orderUp(),调用Receiver[厨师]的execute()执行操作
        remote.buttonWasPressed();

        Command lightOffCommand = new LightOffCommand(light);

        remote.setCommand(lightOffCommand);

        remote.buttonWasPressed();
    }
}
