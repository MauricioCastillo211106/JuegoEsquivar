package com.example.lux.models;


import java.util.Observable;

public class sylas extends Observable implements Runnable {
    private personaje pos;
    private boolean status;

    public sylas() {
        status = true;

    }

    public void setPosicion(personaje pos) {
        this.pos = pos;
    }


    @Override
    public void run() {
        while (status){
            pos.setX(pos.getX()+2);
            setChanged();
            notifyObservers(pos);
            try {
                Thread.sleep(30L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
    public void setStatus(boolean status){
        this.status=status;
    }
}
