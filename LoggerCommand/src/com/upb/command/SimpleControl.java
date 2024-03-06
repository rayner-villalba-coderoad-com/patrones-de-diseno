package com.upb.command;
//Invoker
public class SimpleControl {
    Command command;

    public SimpleControl(Command command) {
        this.command = command;
    }

    public void setCommand(Command newCommand) {
        this.command = newCommand;
    }

    public void execute() {
        command.execute();
    }
}
