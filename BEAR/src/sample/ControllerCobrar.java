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
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class ControllerCobrar {
    @FXML ComboBox comboJuego;
    @FXML TableView tabla;
    @FXML TextField txtCantidad,txtNombre;
    @FXML Label nombrePedido,cantidadJ;
    @FXML ComboBox comboBusqueda,comboBusquedaP;
    @FXML ImageView lupa;



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
comboBusquedaP.setVisible(false);
lupa.setVisible(false);

    }

    public void cancelar(){
        listaPedidos.clear();
        txtNombre.setText("");
        txtCantidad.setText("");
        txtNombre.setEditable(true);
        comboJuego.getSelectionModel().clearSelection();


    }
    public void añadirCarro(ActionEvent event){
        if(comboJuego.getSelectionModel().isEmpty()||txtCantidad.equals("")||txtNombre.equals("")){
            Alert alert= new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setContentText("Favor de llenar los espacios vacios");
            alert.show();
        }else if(txtCantidad.getText().equals("0")) {
            Alert alert= new Alert(Alert.AlertType.WARNING);
            alert.setTitle("ERROR");
            alert.setContentText("Si no vas a comprar nada largate de aqui");
            alert.show();

        }else {
            String j = comboJuego.getSelectionModel().getSelectedItem().toString();
            String cj = txtCantidad.getText();
            int p;
            String pre;

            if (comboJuego.getSelectionModel().isSelected(0)) {
                int can = Integer.parseInt(txtCantidad.getText());
                p = 900 * can;
                pre = Integer.toString(p);

                String juego;
                int r=0;
                for(int x=0; x<1;x++) {
                    juego = j;
                    for (int i = 0; i < listaPedidos.size(); i++) {
                        if (juego == listaPedidos.get(i).getJuego()) {
                            int can1, can2, suma,nPrecio;
                            String suma2,precioNew;
                            can1 = Integer.parseInt(listaPedidos.get(i).getCantidadJuego());
                            can2 = Integer.parseInt(txtCantidad.getText());
                            suma = can1 + can2;
                            suma2 = Integer.toString(suma);
                            nPrecio=suma*900;
                            precioNew=Integer.toString(nPrecio);
                            listaPedidos.get(i).setPrecio(precioNew);
                            listaPedidos.get(i).setCantidadJuego(suma2);
                            i = comboBusqueda.getItems().size();
                            r = 1;
                        }
                    }
                    if (r == 0) {
                        listaPedidos.add(new Pedido(j, cj, pre));
                    }
                }

            } else if (comboJuego.getSelectionModel().isSelected(1)) {
                int can = Integer.parseInt(txtCantidad.getText());
                p = 1189 * can;
                pre = Integer.toString(p);
                String juego;
                int r=0;
                for(int x=0; x<1;x++) {
                    juego = j;
                    for (int i = 0; i < listaPedidos.size(); i++) {
                        if (juego == listaPedidos.get(i).getJuego()) {
                            int can1, can2, suma,nPrecio;
                            String suma2,precioNew;
                            can1 = Integer.parseInt(listaPedidos.get(i).getCantidadJuego());
                            can2 = Integer.parseInt(txtCantidad.getText());
                            suma = can1 + can2;
                            suma2 = Integer.toString(suma);
                            nPrecio=suma*1189;
                            precioNew=Integer.toString(nPrecio);
                            listaPedidos.get(i).setPrecio(precioNew);
                            listaPedidos.get(i).setCantidadJuego(suma2);
                            i = comboBusqueda.getItems().size();
                            r = 1;
                        }
                    }
                    if (r == 0) {
                        listaPedidos.add(new Pedido(j, cj, pre));
                    }
                }
            } else if (comboJuego.getSelectionModel().isSelected(2)) {
                int can = Integer.parseInt(txtCantidad.getText());
                p = 800 * can;
                pre = Integer.toString(p);
                String juego;
                int r=0;
                for(int x=0; x<1;x++) {
                    juego = j;
                    for (int i = 0; i < listaPedidos.size(); i++) {
                        if (juego == listaPedidos.get(i).getJuego()) {
                            int can1, can2, suma,nPrecio;
                            String suma2,precioNew;
                            can1 = Integer.parseInt(listaPedidos.get(i).getCantidadJuego());
                            can2 = Integer.parseInt(txtCantidad.getText());
                            suma = can1 + can2;
                            suma2 = Integer.toString(suma);
                            nPrecio=suma*800;
                            precioNew=Integer.toString(nPrecio);
                            listaPedidos.get(i).setPrecio(precioNew);
                            listaPedidos.get(i).setCantidadJuego(suma2);
                            i = comboBusqueda.getItems().size();
                            r = 1;
                        }
                    }
                    if (r == 0) {
                        listaPedidos.add(new Pedido(j, cj, pre));
                    }
                }
            } else if (comboJuego.getSelectionModel().isSelected(3)) {
                int can = Integer.parseInt(txtCantidad.getText());
                p = 899 * can;
                pre = Integer.toString(p);
                String juego;
                int r=0;
                for(int x=0; x<1;x++) {
                    juego = j;
                    for (int i = 0; i < listaPedidos.size(); i++) {
                        if (juego == listaPedidos.get(i).getJuego()) {
                            int can1, can2, suma,nPrecio;
                            String suma2,precioNew;
                            can1 = Integer.parseInt(listaPedidos.get(i).getCantidadJuego());
                            can2 = Integer.parseInt(txtCantidad.getText());
                            suma = can1 + can2;
                            suma2 = Integer.toString(suma);
                            nPrecio=suma*899;
                            precioNew=Integer.toString(nPrecio);
                            listaPedidos.get(i).setPrecio(precioNew);
                            listaPedidos.get(i).setCantidadJuego(suma2);
                            i = comboBusqueda.getItems().size();
                            r = 1;
                        }
                    }
                    if (r == 0) {
                        listaPedidos.add(new Pedido(j, cj, pre));
                    }
                }
            } else if (comboJuego.getSelectionModel().isSelected(4)) {
                int can = Integer.parseInt(txtCantidad.getText());
                p = 300 * can;
                pre = Integer.toString(p);
                String juego;
                int r=0;
                for(int x=0; x<1;x++) {
                    juego = j;
                    for (int i = 0; i < listaPedidos.size(); i++) {
                        if (juego == listaPedidos.get(i).getJuego()) {
                            int can1, can2, suma,nPrecio;
                            String suma2,precioNew;
                            can1 = Integer.parseInt(listaPedidos.get(i).getCantidadJuego());
                            can2 = Integer.parseInt(txtCantidad.getText());
                            suma = can1 + can2;
                            suma2 = Integer.toString(suma);
                            nPrecio=suma*300;
                            precioNew=Integer.toString(nPrecio);
                            listaPedidos.get(i).setPrecio(precioNew);
                            listaPedidos.get(i).setCantidadJuego(suma2);
                            i = comboBusqueda.getItems().size();
                            r = 1;
                        }
                    }
                    if (r == 0) {
                        listaPedidos.add(new Pedido(j, cj, pre));
                    }
                }
            } else if (comboJuego.getSelectionModel().isSelected(5)) {
                int can = Integer.parseInt(txtCantidad.getText());
                p = 400 * can;
                pre = Integer.toString(p);
                String juego;
                int r=0;
                for(int x=0; x<1;x++) {
                    juego = j;
                    for (int i = 0; i < listaPedidos.size(); i++) {
                        if (juego == listaPedidos.get(i).getJuego()) {
                            int can1, can2, suma,nPrecio;
                            String suma2,precioNew;
                            can1 = Integer.parseInt(listaPedidos.get(i).getCantidadJuego());
                            can2 = Integer.parseInt(txtCantidad.getText());
                            suma = can1 + can2;
                            suma2 = Integer.toString(suma);
                            nPrecio=suma*400;
                            precioNew=Integer.toString(nPrecio);
                            listaPedidos.get(i).setPrecio(precioNew);
                            listaPedidos.get(i).setCantidadJuego(suma2);
                            i = comboBusqueda.getItems().size();
                            r = 1;
                        }
                    }
                    if (r == 0) {
                        listaPedidos.add(new Pedido(j, cj, pre));
                    }
                }
            } else if (comboJuego.getSelectionModel().isSelected(6)) {
                int can = Integer.parseInt(txtCantidad.getText());
                p = 160 * can;
                pre = Integer.toString(p);

                String juego;
                int r=0;
                for(int x=0; x<1;x++) {
                    juego = j;
                    for (int i = 0; i < listaPedidos.size(); i++) {
                        if (juego == listaPedidos.get(i).getJuego()) {
                            int can1, can2, suma,nPrecio;
                            String suma2,precioNew;
                            can1 = Integer.parseInt(listaPedidos.get(i).getCantidadJuego());
                            can2 = Integer.parseInt(txtCantidad.getText());
                            suma = can1 + can2;
                            suma2 = Integer.toString(suma);
                            nPrecio=suma*160;
                            precioNew=Integer.toString(nPrecio);
                            listaPedidos.get(i).setPrecio(precioNew);
                            listaPedidos.get(i).setCantidadJuego(suma2);
                            i = comboBusqueda.getItems().size();
                            r = 1;
                        }
                    }
                    if (r == 0) {
                        listaPedidos.add(new Pedido(j, cj, pre));
                    }
                }


            } else if (comboJuego.getSelectionModel().isSelected(7)) {
                int can = Integer.parseInt(txtCantidad.getText());
                p = 749 * can;
                pre = Integer.toString(p);

                String juego;
                int r=0;
                for(int x=0; x<1;x++) {
                    juego = j;
                    for (int i = 0; i < listaPedidos.size(); i++) {
                        if (juego == listaPedidos.get(i).getJuego()) {
                            int can1, can2, suma,nPrecio;
                            String suma2,precioNew;
                            can1 = Integer.parseInt(listaPedidos.get(i).getCantidadJuego());
                            can2 = Integer.parseInt(txtCantidad.getText());
                            suma = can1 + can2;
                            suma2 = Integer.toString(suma);
                            nPrecio=suma*749;
                            precioNew=Integer.toString(nPrecio);
                            listaPedidos.get(i).setPrecio(precioNew);
                            listaPedidos.get(i).setCantidadJuego(suma2);
                            i = comboBusqueda.getItems().size();
                            r = 1;
                        }
                    }
                    if (r == 0) {
                        listaPedidos.add(new Pedido(j, cj, pre));
                    }
                }








            }

            txtNombre.setEditable(false);


            if (comboBusqueda.getItems().isEmpty()) {
                comboBusqueda.getItems().add(j);

            } else{
               String juego;
               int r=0;
                for(int x=0; x<1;x++){
                    juego=j;
                    for(int i=0;i<comboBusqueda.getItems().size();i++){
                        if(juego==comboBusqueda.getItems().get(i)){
                          i=comboBusqueda.getItems().size();
                          r=1;
                        }
                    }
                    if(r==0){
                        comboBusqueda.getItems().add(j);

                    }else{

                    }

                }



            }


        }

        comboBusquedaP.getItems().clear();
        for(int x=0;x<listaPedidos.size();x++) {
            String n=listaPedidos.get(x).getCantidadJuego();
            comboBusquedaP.getItems().add(n);
        }




    }
public void guardarCompra(ActionEvent event){
    if(comboJuego.getSelectionModel().isEmpty()||txtCantidad.equals(null)||txtNombre.equals(null)){
        Alert alert= new Alert(Alert.AlertType.ERROR);
        alert.setTitle("ERROR");
        alert.setContentText("Favor de llenar los espacios vacios");
        alert.show();
    }else{
        txtNombre.setEditable(true);
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
        comboBusqueda.getItems().clear();
        comboBusquedaP.getItems().clear();
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
    public void ordenAcendente(ActionEvent event){



        if (listaPedidos.isEmpty()){
            Alert alerta= new Alert(Alert.AlertType.WARNING);
            alerta.setTitle("Advertencia");
            alerta.setContentText("Aun no hay datos a ordenar");
            alerta.show();
        }else if(listaPedidos.size()==1){
            System.out.println(listaPedidos.size());

        }
        comboBusquedaP.setVisible(true);
        lupa.setVisible(true);
        int pos;
        String juego,juegoCantidad,precio;

        for (int x=0;x<listaPedidos.size();x++){
            pos=x;

            juego=listaPedidos.get(x).getJuego();
            juegoCantidad=listaPedidos.get(x).getCantidadJuego();
            precio=listaPedidos.get(x).getPrecio();


            while((pos>0) && Integer.parseInt(listaPedidos.get(pos-1).getCantidadJuego())>Integer.parseInt(juegoCantidad)){
                listaPedidos.get(pos).setCantidadJuego(listaPedidos.get(pos-1).getCantidadJuego());
                listaPedidos.get(pos).setPrecio(listaPedidos.get(pos-1).getPrecio());
                listaPedidos.get(pos).setJuego(listaPedidos.get(pos-1).getJuego());
                pos--;
            }

            listaPedidos.get(pos).setJuego(juego);
            listaPedidos.get(pos).setCantidadJuego(juegoCantidad);
            listaPedidos.get(pos).setPrecio(precio);

        }

}

    public void ordenDecreciente(ActionEvent event) {

        if (listaPedidos.isEmpty()){
            Alert alerta= new Alert(Alert.AlertType.WARNING);
            alerta.setTitle("Advertencia");
            alerta.setContentText("Aun no hay datos a ordenar");
            alerta.show();
        }else if(listaPedidos.size()==1){
            System.out.println(listaPedidos.size());

        }


        Pedido auxiliar;
        for(int x=0; x<listaPedidos.size()-1;x++){
            for(int i=x;i<listaPedidos.size();i++){
                if(Integer.parseInt(listaPedidos.get(x).getCantidadJuego())<Integer.parseInt(listaPedidos.get(i).getCantidadJuego())){
                    auxiliar=listaPedidos.get(x);
                    listaPedidos.set(x,listaPedidos.get(i));
                    listaPedidos.set(i,auxiliar);


                }

            }


        }

        }


    public void buscarCan(){
if(comboBusqueda.getSelectionModel().isEmpty()){
    Alert alerta= new Alert(Alert.AlertType.WARNING);
    alerta.setTitle("Advertencia");
    alerta.setContentText("Seleccione el juego que desea buscar");
    alerta.show();
}else{
    String juegoBuscar;

    juegoBuscar =comboBusqueda.getSelectionModel().getSelectedItem().toString();
    for (int i = 0; i < listaPedidos.size(); i++) {
        if (juegoBuscar == listaPedidos.get(i).getJuego()) {

            cantidadJ.setText("$"+listaPedidos.get(i).getPrecio());
            i = listaPedidos.size();
        }
    }
}



    }
    public void buscarPrecio(){
        if(comboBusquedaP.getSelectionModel().isEmpty()){
            Alert alerta= new Alert(Alert.AlertType.WARNING);
            alerta.setTitle("Advertencia");
            alerta.setContentText("Seleccione el juego que desea buscar");
            alerta.show();
        }else{
           int inicio=1;
           int fin=listaPedidos.size();
          String n=comboBusquedaP.getSelectionModel().getSelectedItem().toString();
          int numeroBuscado=Integer.parseInt(n);
          int posicion=0;
          int resultado=0;

          if(listaPedidos.size()==1){
              cantidadJ.setText(listaPedidos.get(0).getJuego());
          }else{
              while(inicio<=fin){
                  posicion=(inicio+fin)/2;
                  if (Integer.parseInt(listaPedidos.get(posicion).getCantidadJuego())==numeroBuscado){
                      resultado=posicion;
                      break;
                  }else if(Integer.parseInt(listaPedidos.get(posicion).getCantidadJuego())<numeroBuscado){
                      inicio=posicion+1;
                  }else{
                      fin=posicion-1;
                  }
              }

              cantidadJ.setText(listaPedidos.get(resultado).getJuego());
          }


            }


        }









}