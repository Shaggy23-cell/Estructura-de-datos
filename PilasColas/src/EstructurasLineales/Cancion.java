package EstructurasLineales;

public class Cancion {
    private String nombre;
    private String ruta;
    private int duracion;

    public Cancion(String nombre, String ruta, int duracion) {
        this.nombre = nombre;
        this.ruta = ruta;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
