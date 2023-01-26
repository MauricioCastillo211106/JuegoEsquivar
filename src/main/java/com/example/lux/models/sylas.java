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
        pos.setX(pos.getX() - 0);
    }
    public void setLeft(boolean left) {
        this.left = left;
    }

    public void setRightChange(){ pos.setX(pos.getX() - 0); }
    public void setRight(boolean right) {
        this.right = right;
    }



    public void setPos(personaje pos) {
        this.pos = pos;
    }

    public void setPosicion(personaje pos) {
        this.pos = pos;
    }

    public void moveSylas(){
        status=true;
    }

    @Override
    public void run() {
        while (status){

            setChanged();
            notifyObservers(pos);
            try {
                Thread.sleep(50L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            /*if(pouPos.getPouX() >= 0 || pouPos.getPouX() <= 500 ){*/
            if(left == true){
                if(pos.getX() <= 290){
                    pos.setX(pos.getX() + 10);
                    System.out.println("Derecha");

                }
                left = false;
            }
            else if (right == true){
                if (pos.getX() >= 0){
                    pos.setX(pos.getX() - 10);
                    System.out.println("Izquierda");
                }
                right=false;
            }
    }

}
}
