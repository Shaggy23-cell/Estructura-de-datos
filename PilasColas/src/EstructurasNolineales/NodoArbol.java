package EstructurasNolineales;

public class NodoArbol {
    private int valor;
    private NodoArbol nodoIzq;
    private NodoArbol nodoDerecho;
    public NodoArbol(int valor){
        this.valor=valor;
        this.nodoIzq=null;
        this.nodoDerecho=null;

    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NodoArbol getNodoIzq() {
        return nodoIzq;
    }

    public NodoArbol getNodoDerecho() {
        return nodoDerecho;
    }

    public void insertar(int _valor){
        if(_valor< this.valor){

            if(this.nodoIzq ==null){
                this.nodoIzq =new NodoArbol(_valor);
            }else{
                this.nodoIzq.insertar(_valor);
            }
        }else{
            if(this.nodoDerecho ==null){
                this.nodoDerecho = new NodoArbol(_valor);
            }else{
                this.nodoDerecho.insertar(_valor);
            }
        }

    }

}
