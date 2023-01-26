package com.example.lux.controllers;
import com.example.lux.models.Personaje;
import com.example.lux.models.Sylas;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

import java.util.Observable;
import java.util.Observer;


public class HelloController implements Observer {



    @FXML
    private Button left;

    @FXML
    private Button right;

    @FXML
    private AnchorPane rootScene;

    @FXML
    private ImageView sylass;




    private sylas moveSylass;


    @FXML
    void btnLeftOnMouse(MouseEvent event) {
        moveSylass.setLeftChange();
        moveSylass.setLeft(true);
        System.out.println("Paso izquierda");
    }

<<<<<<< HEAD
    private Sylas jugador1;
    @FXML
    void btnRightOnMouse(MouseEvent event) {
        jugador1=new Sylas();
        jugador1.setPosicion(new Personaje(1,319,297));
        jugador1.addObserver(this);
        new Thread(jugador1).start();
        System.out.printf("paso");
    }
=======
    @FXML
    void btnRightOnMouse(MouseEvent event) {
>>>>>>> 14420d344eacec7cd95eb8e724130d14215b0060

    }

    @Override
    public void update(Observable o, Object arg) {
<<<<<<< HEAD
        Personaje pos=(Personaje) arg;
        switch (pos.getId()){
            case    1:
                Platform.runLater(()-> sylas.setLayoutX(pos.getX()));
                break;
        }
=======
        personaje move = (personaje) arg;
        sylass.setLayoutX(move.getX());

    }
>>>>>>> 14420d344eacec7cd95eb8e724130d14215b0060
    }
