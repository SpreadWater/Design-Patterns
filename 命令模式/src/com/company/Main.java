package com.company;

public class Main {

    public static void main(String[] args) {
    // Light is a Receiver[厨师]
	Light light = new LEDLight();
    // Command is an Order[订单]
    LightOnCommand lightOnCommand = new LightOnCommand(light);
    // remoteControl is an Invoker[女接待]
    SimpleRemoteControl remote = new SimpleRemoteControl();
    //[女接待] takeOrder ，接收订单。
    remote.setCommand(lightOnCommand);
    //[订单] orderUp(),Order 调用[厨师]去执行操作
    remote.buttonWasPressed();
    }
}
