package EstructurasLineales;

public class Nodo {
    private Cancion Canciojn;
    private Nodo siguiente;

    public Nodo(Cancion canciojn) {
        this.Canciojn = canciojn;
    }

    public Cancion getCanciojn() {
        return Canciojn;
    }

    public void setCanciojn(Cancion canciojn) {
        this.Canciojn = canciojn;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
