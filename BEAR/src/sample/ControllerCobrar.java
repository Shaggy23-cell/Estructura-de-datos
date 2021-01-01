package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;


import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class ControllerCobrar {
    @FXML ComboBox comboJuego;
    @FXML TableView tabla;
    @FXML TextField txtCantidad,txtNombre;
    @FXML Label nombrePedido;


    LinkedList<String> listaJuegos=new LinkedList<>();
    TableColumn columnJuego=new TableColumn("Juego");
    TableColumn columnCantJuego=new TableColumn("Cantidad");
    TableColumn columnPrecio=new TableColumn("Precio");
    ObservableList<Pedido> listaPedidos= FXCollections.observableArrayList();
    Queue<itemPedido> cola= new LinkedList<>();

    @FXML protected void initialize(){
        columnJuego.setCellValueFactory(new PropertyValueFactory<Pedido,String>("juego"));
        columnCantJuego.setCellValueFactory(new PropertyValueFactory<Pedido,String>("cantidadJuego"));
        columnPrecio.setCellValueFactory(new PropertyValueFactory<Pedido,String>("precio"));

        tabla.getColumns().addAll(columnJuego,columnCantJuego,columnPrecio);
        tabla.setItems(listaPedidos);
        listaJuegos.add("Borderlands 3");
        listaJuegos.add("TOMBRAIDER");
        listaJuegos.add("DOOM");
        listaJuegos.add("Call of Duty");
        listaJuegos.add("Farcry 3");
        listaJuegos.add("NBA-2K16");
        listaJuegos.add("GTA Sanandreas");
        listaJuegos.add("Mortal Kombat 9");
        for(int x=0;x<listaJuegos.size();x++) comboJuego.getItems().add(listaJuegos.get(x));


    }
    public void añadirCarro(ActionEvent event){
        if(comboJuego.getSelectionModel().isEmpty()||txtCantidad.equals("")||txtNombre.equals("")){
            Alert alert= new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setContentText("Favor de llenar los espacios vacios");
            alert.show();
        }else{
            String j=comboJuego.getSelectionModel().getSelectedItem().toString();
            String cj=txtCantidad.getText();
            int p;
            String pre;

            if(comboJuego.getSelectionModel().isSelected(0)){
               int can =Integer.parseInt(txtCantidad.getText());
                p=900*can;
                pre=Integer.toString(p);
                listaPedidos.add(new Pedido(j,cj,pre));
            }else if(comboJuego.getSelectionModel().isSelected(1)){
                int can =Integer.parseInt(txtCantidad.getText());
                p=1189*can;
                pre=Integer.toString(p);
                listaPedidos.add(new Pedido(j,cj,pre));
            }else if(comboJuego.getSelectionModel().isSelected(2)){
                int can =Integer.parseInt(txtCantidad.getText());
                p=800*can;
                pre=Integer.toString(p);
                listaPedidos.add(new Pedido(j,cj,pre));
            }else if(comboJuego.getSelectionModel().isSelected(3)){
                int can =Integer.parseInt(txtCantidad.getText());
                p=899*can;
                pre=Integer.toString(p);
                listaPedidos.add(new Pedido(j,cj,pre));
            }else if(comboJuego.getSelectionModel().isSelected(4)){
                int can =Integer.parseInt(txtCantidad.getText());
                p=300*can;
                pre=Integer.toString(p);
                listaPedidos.add(new Pedido(j,cj,pre));
            }else if(comboJuego.getSelectionModel().isSelected(5)){
                int can =Integer.parseInt(txtCantidad.getText());
                p=400*can;
                pre=Integer.toString(p);
                listaPedidos.add(new Pedido(j,cj,pre));
            }
            else if(comboJuego.getSelectionModel().isSelected(6)){
                int can =Integer.parseInt(txtCantidad.getText());
                p=160*can;
                pre=Integer.toString(p);
                listaPedidos.add(new Pedido(j,cj,pre));
            }else if(comboJuego.getSelectionModel().isSelected(7)){
                int can =Integer.parseInt(txtCantidad.getText());
                p=749*can;
                pre=Integer.toString(p);
                listaPedidos.add(new Pedido(j,cj,pre));
            }

        }
    }
public void guardarCompra(ActionEvent event){
    if(comboJuego.getSelectionModel().isEmpty()||txtCantidad.equals(null)||txtNombre.equals(null)){
        Alert alert= new Alert(Alert.AlertType.ERROR);
        alert.setTitle("ERROR");
        alert.setContentText("Favor de llenar los espacios vacios");
        alert.show();
    }else{
        String[][] items=new String[listaPedidos.size()][2];
        for(int x=0;x<items.length;x++){
            items[x][0]=listaPedidos.get(x).juegoProperty().toString();
            items[x][1]=listaPedidos.get(x).getCantidadJuego();
        }
        itemPedido pedido=new itemPedido(items,txtNombre.getText());
        cola.add(pedido);
        listaPedidos.clear();
        txtNombre.setText("");
        txtCantidad.setText("");
        comboJuego.getSelectionModel().clearSelection();
    }
}
public void finalizar(){
        if(cola.isEmpty()){
            Alert alert= new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Alerta");
            alert.setContentText("Ya no hay mas compras por realizar");
            alert.show();
        }else{
            itemPedido pedido=cola.poll();
            String[][] datos=pedido.getDatos();
            String a="";
            String b="";
            for(int x=0; x<datos.length;x++){
                 a=datos[x][0]+"\n cantidad comprada: "+datos[x][1]+"\n"+a;
            }
            Alert alert= new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Ticket");
            alert.setHeaderText("Gracias por su preferencia"+" "+pedido.getNombre());
            alert.setContentText(a);
            alert.show();

        }
}
    public void ivBor(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("PantallaBorderlands.fxml"));
            Scene scene=new Scene(root);
            Main.stage.setScene(scene);
            Main.stage.setMaximized(false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void tomb(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("PantallaTomraider.fxml"));
            Scene scene=new Scene(root);
            Main.stage.setScene(scene);
            Main.stage.setMaximized(false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void doom(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("PantallaDoom.fxml"));
            Scene scene=new Scene(root);
            Main.stage.setScene(scene);
            Main.stage.setMaximized(false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void call(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("PantallaCallofDuty.fxml"));
            Scene scene=new Scene(root);
            Main.stage.setScene(scene);
            Main.stage.setMaximized(false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void fray(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("PantallaFarCry.fxml"));
            Scene scene=new Scene(root);
            Main.stage.setScene(scene);
            Main.stage.setMaximized(false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void nba(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("PantallaNBA.fxml"));
            Scene scene=new Scene(root);
            Main.stage.setScene(scene);
            Main.stage.setMaximized(false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void gta(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("PantallaGTA.fxml"));
            Scene scene=new Scene(root);
            Main.stage.setScene(scene);
            Main.stage.setMaximized(false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void mtk(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("PantallaMTK.fxml"));
            Scene scene=new Scene(root);
            Main.stage.setScene(scene);
            Main.stage.setMaximized(false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
