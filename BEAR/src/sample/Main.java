package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
public static Stage stage;
    @Override
    public void start(Stage primaryStage) throws Exception{
        stage= primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("BEAR");
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.getIcons().add(new Image("./sample/img/icono2.png"));
        primaryStage.show();
        Alert alert =new Alert(Alert.AlertType.CONFIRMATION);
        alert.setHeaderText("Consejo");
        alert.setContentText(" Usuario: usuario1 \n Contraseña 123 ");
        alert.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
