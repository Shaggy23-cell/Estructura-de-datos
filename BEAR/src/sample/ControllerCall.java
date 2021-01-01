package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;
public class ControllerCall {
    public void atras4(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("PantallaCobrar.fxml"));
            Scene scene=new Scene(root);
            Main.stage.setScene(scene);
            Main.stage.setMaximized(false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
