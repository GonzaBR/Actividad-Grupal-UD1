package Controller;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;


import javafx.stage.Stage;
 
public class Main extends Application {
 
    @Override
    public void start(Stage primaryStage) {
 
        try {
	    System.out.println("Proyecto javaFx para realizar la suma de dos numeros");
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("/View/SumaVista.fxml"));
            // Cargo la ventana
            Pane ventana = (Pane) loader.load();
 
            // Cargo el scene
            Scene scene = new Scene(ventana);
 
            // Seteo la scene y la muestro
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
 
    public static void main(String[] args) {
        launch(args);
    }
 
}