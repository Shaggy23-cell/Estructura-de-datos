package sample;

import javafx.beans.property.SimpleStringProperty;

public class Pedido {
    SimpleStringProperty juego;
    SimpleStringProperty cantidadJuego;
    SimpleStringProperty precio;

    public Pedido(String juego, String cantidadJuego,String precio) {
       this.juego=new SimpleStringProperty((juego));
        this.cantidadJuego=new SimpleStringProperty((cantidadJuego));
        this.precio=new SimpleStringProperty((precio));
    }

    public String getPrecio() {
        return precio.get();
    }

    public SimpleStringProperty precioProperty() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio.set(precio);
    }

    public String getJuego() {
        return juego.get();
    }

    public SimpleStringProperty juegoProperty() {
        return juego;
    }

    public void setJuego(String juego) {
        this.juego.set(juego);
    }

    public String getCantidadJuego() {
        return cantidadJuego.get();
    }

    public SimpleStringProperty cantidadJuegoProperty() {
        return cantidadJuego;
    }

    public void setCantidadJuego(String cantidadJuego) {
        this.cantidadJuego.set(cantidadJuego);
    }
}
