package com.example.handlers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class Scene1Control implements Initializable {


    public AnchorPane root;
    public Text txt2;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Button btn1 = new Button("Switch scenes");
        root.getChildren().add(btn1);
       btn1.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent actionEvent) {
               txt2.setText("near");
           }
       });

    }
}
