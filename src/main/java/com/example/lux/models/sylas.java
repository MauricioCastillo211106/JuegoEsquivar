package com.example.lux.models;


import java.util.Observable;

public class sylas extends Observable implements Runnable {
    private personaje pos;
    private boolean status;
    private boolean left= false;
    private boolean right = false;


    public sylas() {
        status = true;
    }

    public void setStatus(boolean status) {this.status = status;}

    public void setLeftChange(){
        pos.setX(pos.getX() + 0);
    }
    public void setLeft(boolean left) {
        this.left = left;
    }

    public void setRightChange(){ pos.setX(pos.getX() + 0); }
    public void setRight(boolean right) {
        this.right = right;
    }



    public void setPos(personaje pos) {
        this.pos = pos;
    }

    public void setPosicion(personaje pos) {
        this.pos = pos;
    }



    @Override
    public void run() {
        while (status){

            setChanged();
            notifyObservers(pos);
            //System.out.println("paso aquiiiiiii");
            try {
                Thread.sleep(50L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(right == true){
                if (pos.getX() <= 630){
                    pos.setX(pos.getX() + 10);
                    //System.out.println("Derecha");
                }
                right= false;
            }
            else if (left == true){
                if (pos.getX() >= 0){
                    pos.setX(pos.getX() - 10);
                    //System.out.println("Izquierda");
                }
                left=false;
            }

    }

}
}
