package com.example.lux.models;


import java.util.Observable;

public class Sylas extends Observable implements Runnable {
    private Personaje pos;
    private boolean status;

    private boolean statusRight = false;


    public void setStatusRight(boolean statusRight){
        this.statusRight=statusRight;
    }
    public void setRigth(){
        pos.setX(pos.getX() -0);
    }

    public Sylas() {
        status = true;
    }

    public void setPosicion(Personaje pos) {
        this.pos = pos;
    }


    @Override
    public void run() {
        while (status){
            setChanged();
            notifyObservers(pos);
            if(statusRight = true){
                pos.setX(pos.getX()+2);
                statusRight=false;
            }
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
