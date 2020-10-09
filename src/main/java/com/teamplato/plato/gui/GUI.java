/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamplato.plato.gui;

import java.io.IOException;
import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 *
 * @author nicks
 */
public class GUI extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException{

        String resourcePath = "FXML.fxml";
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(resourcePath));
        
        Scene scene = new Scene(fxmlLoader.load());

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
