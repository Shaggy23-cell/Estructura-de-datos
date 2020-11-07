package sample;


        import Pez.Pez;
        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.scene.control.Alert;
        import javafx.scene.control.ComboBox;
        import javafx.scene.control.ListView;
        import javafx.scene.control.TextField;


public class Controller {
    @FXML
    ComboBox cbbTipo_pez;
    @FXML
    TextField txtCantidad;
    @FXML
    ListView listResultado;


String[][] arregloPez2=new String[10][2];

    public void setCbbTipo_pez(){
        cbbTipo_pez.getItems().clear();
        cbbTipo_pez.getItems().addAll("Trucha",
               "Carpa");
    }
int cont=0;
    public void insertar1(ActionEvent event){
            String pez=txtCantidad.getText();
            String tipo=cbbTipo_pez.getSelectionModel().getSelectedItem().toString();
            if(txtCantidad.getText().equals("")|cbbTipo_pez.getSelectionModel().isEmpty()){
                txtCantidad.setText("");
                cbbTipo_pez.getSelectionModel().clearSelection();
                Alert error=new Alert(Alert.AlertType.ERROR);
               error.setTitle("Advertencia");
               error.setContentText("Porfavor llenar los espacios requeridos)");
               error.show();
            } else if(Integer.parseInt(txtCantidad.getText())<0){
                txtCantidad.setText("");
                cbbTipo_pez.getSelectionModel().clearSelection();
                Alert error=new Alert(Alert.AlertType.ERROR);
                error.setTitle("Advertencia");
                error.setContentText("Escriba un valor superior a 0");
               error.show();
           }
            else{
            txtCantidad.setText("");
            cbbTipo_pez.getSelectionModel().clearSelection();
            arregloPez2[cont][0]=tipo;
            arregloPez2[cont][1]=pez;

            System.out.println("["+arregloPez2[cont][0]+","+arregloPez2[cont][1]+"]");
            cont++;
        }



    }
    int cont2=0;
    public void procesar(ActionEvent event) {
        int cantidad =Integer.parseInt(arregloPez2[cont2][1]);
        String tip=arregloPez2[cont2][0];
    cont2++;
        Pez pecesAlanio = new Pez(tip,cantidad);
         int anio= pecesAlanio.nacimientos_año();

        listResultado.getItems().add("Pescado "+tip+" nacen "+cantidad+" por cria "+" y por año "+anio);

    }




}
