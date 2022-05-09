package com.company.interfaces;

public class Nicecar {
    private Engine engine;
    private Media musicplayer = new CDplayer();
    public Nicecar(){
        engine = new powerengine();
    }
    public Nicecar(Engine engine){
        this.engine = engine;
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void startMusic(){
        musicplayer.start();
    }
    public void stopMusic(){
        musicplayer.stop();
    }
    public void upgradeEngine(){
        this.engine = new Electricengine();
    }
}
