package com.upb.facade;

public class SmartHomeFacade {
    //Step 1 Declare as attribute all class dependencies
    Lighting lighting;
    MusicSystem musicSystem;
    ClimateControl climateControl;

    //Step 2 Send all dependencies as parameters in the constructor
    public SmartHomeFacade(Lighting lighting, MusicSystem musicSystem, ClimateControl climateControl) {
        this.lighting = lighting;
        this.musicSystem = musicSystem;
        this.climateControl = climateControl;
    }

    //Step 3 declare simple functions
    public void startEveningRouting() {
        lighting.on();
        musicSystem.playMusic();
        climateControl.setTemperature(22);
    }

    public void endEveningRoutine() {
        lighting.off();
        musicSystem.stopMusic();
    }

}
