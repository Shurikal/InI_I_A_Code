package design_patterns.facade.facade;

import design_patterns.facade.subsystem.*;

public class HomeCinemaFacade {
    private Amplifier amplifier;
    private CDPlayer cdPlayer;
    private DVDPlayer dvdPlayer;
    private Lights lights;
    private PopcornPopper popcornPopper;
    private Tuner tuner;
    private TV tv;

    public HomeCinemaFacade(){
        amplifier = new Amplifier();
        cdPlayer = new CDPlayer();
        dvdPlayer = new DVDPlayer();
        lights = new Lights();
        popcornPopper = new PopcornPopper();
        tuner = new Tuner();
        tv = new TV();
    }

    public void watchMovie(String title){
        tv.on();
        amplifier.on();
        dvdPlayer.on();
        dvdPlayer.play(title);
        lights.off();
    }

    public void endMovie(){
        dvdPlayer.stop();
        lights.on();
    }
}
