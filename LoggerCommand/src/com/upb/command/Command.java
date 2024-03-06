package com.upb.command;

public abstract class Command {
    public void execute() {
        this.run();
        this.log();
    }

    abstract void run();
    abstract void log();
}
