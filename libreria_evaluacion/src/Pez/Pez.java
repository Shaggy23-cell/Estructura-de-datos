package Pez;

public class Pez {
   String tipo_Pez;
   int por_Nacimiento;

    public Pez(String tipo_Pez, int por_Nacimiento) {
        this.tipo_Pez = tipo_Pez;
        this.por_Nacimiento = por_Nacimiento;
    }

    public String getTipo_Pez() {
        return tipo_Pez;
    }

    public void setTipo_Pez(String tipo_Pez) {
        this.tipo_Pez = tipo_Pez;
    }

    public int getPor_Nacimiento() {
        return por_Nacimiento;
    }

    public void setPor_Nacimiento(int por_Nacimiento) {
        this.por_Nacimiento = por_Nacimiento;
    }

     public int nacimientos_año() {
        int numCrias=(por_Nacimiento*2)-10;
        return numCrias;
    }
}
