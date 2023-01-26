package com.example.lux.controllers;
import com.example.lux.models.personaje;
import com.example.lux.models.sylas;
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
    private ImageView sylas;


    private sylas moveSylass;

    @FXML
    void btnPrepararOnMouse(MouseEvent event) {
        moveSylass = new sylas();
        moveSylass.setPos(new personaje(1,319,297));
        moveSylass.addObserver(this);
        Thread hilo1 = new Thread(moveSylass);
        hilo1.start();
        System.out.println("pasooo");

    }

    @FXML
    void btnLeftOnMouse(MouseEvent event) {
        moveSylass.setLeftChange();
        moveSylass.setLeft(true);
        //System.out.println("Hola");
    }

    @FXML
    void btnRightOnMouse(MouseEvent event) {
        moveSylass.setRightChange();
        moveSylass.setRight(true);
      //  System.out.println("pasooo");
    }

    @Override
    public void update(Observable o, Object arg) {
        personaje move = (personaje) arg;
        sylas.setLayoutX(move.getX());

    }
}
