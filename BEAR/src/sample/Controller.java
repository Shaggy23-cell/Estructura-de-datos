package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.io.IOException;

public class Controller {
    @FXML TextField txtUsuario;
    @FXML PasswordField txtPassword;

    public void login(ActionEvent event){
       ingresar();


    }
public void enter(KeyEvent event){
     if(event.getCode()== KeyCode.ENTER){
         ingresar();

     }

}
public void ingresar(){
    String u=txtUsuario.getText();
    String p=txtPassword.getText();
    if(u.equals("usuario1")&&p.equals("123")){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("PantallaCobrar.fxml"));
            Scene scene=new Scene(root);
            Main.stage.setScene(scene);
            Main.stage.setMaximized(false);
            Alert alert =new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText("Consejo");
            alert.setContentText(" Cliquea en las imagenes de la biblioteca para una pequeña descripcion del juego ");
            alert.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }else{
        Alert alert =new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText("BEAR");
        alert.setContentText("Datos invalidos ");
        alert.show();
    }
}
}
