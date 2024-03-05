package com.upb.command;

public class StereoOnCommand implements Command{
    Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
       stereo.on();
       // you can execute different functions inside execute method
       stereo.setCD();
       stereo.setVolume(20);
    }
}
