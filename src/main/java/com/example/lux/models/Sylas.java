package com.example.lux.models;


import java.util.Observable;

public class Sylas extends Observable implements Runnable {
    private Personaje pos;
    private boolean status;
    private boolean left= false;
    private boolean right = false;


    private boolean statusRight = false;


    public void setStatusRight(boolean statusRight){
        this.statusRight=statusRight;
    }
    public void setRigth(){
        pos.setX(pos.getX() -0);
    }

<<<<<<< HEAD:src/main/java/com/example/lux/models/Sylas.java
    public Sylas() {
        status = true;
    }

    public void setPosicion(Personaje pos) {
=======
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
>>>>>>> 14420d344eacec7cd95eb8e724130d14215b0060:src/main/java/com/example/lux/models/sylas.java
        this.pos = pos;
    }

    public void moveSylas(){
        status=true;
    }

    @Override
    public void run() {
        while (status){
<<<<<<< HEAD:src/main/java/com/example/lux/models/Sylas.java
=======

>>>>>>> 14420d344eacec7cd95eb8e724130d14215b0060:src/main/java/com/example/lux/models/sylas.java
            setChanged();
            notifyObservers(pos);
            if(statusRight = true){
                pos.setX(pos.getX()+2);
                statusRight=false;
            }
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
