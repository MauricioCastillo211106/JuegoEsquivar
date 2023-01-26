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
    private ImageView sylass;




    private sylas moveSylass;


    @FXML
    void btnLeftOnMouse(MouseEvent event) {
        moveSylass.setLeftChange();
        moveSylass.setLeft(true);
        System.out.println("Paso izquierda");
    }

    @FXML
    void btnRightOnMouse(MouseEvent event) {

    }

    @Override
    public void update(Observable o, Object arg) {
        personaje move = (personaje) arg;
        sylass.setLayoutX(move.getX());

    }
    }
