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
    private Button preparar;

    @FXML
    private Button right;

    @FXML
    private AnchorPane rootScene;

    @FXML
    private ImageView sylas;

    private Circle personaje;

    @FXML
    void btnLeftOnMouse(MouseEvent event) {

    }

    @FXML
    void btnPrepararOnMouse(MouseEvent event) {
        /*personaje= new Circle(27, Color.BLACK);
        personaje.setLayoutX(380);
        personaje.setCenterY(373);
        rootScene.getChildren().add(personaje);*/
    }

    private sylas jugador1;
    @FXML
    void btnRightOnMouse(MouseEvent event) {
        jugador1=new sylas();
        jugador1.setPosicion(new personaje(1,319,297));
        jugador1.addObserver(this);
        new Thread(jugador1).start();
        System.out.printf("paso");
    }


    @Override
    public void update(Observable o, Object arg) {
        personaje pos=(personaje) arg;
        switch (pos.getId()){
            case    1:
                Platform.runLater(()-> sylas.setLayoutX(pos.getX()));
                break;
        }
    }
}