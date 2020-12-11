package EstructurasLineales;

public class ListaEnlazada {
    Nodo inicio;
    public ListaEnlazada(){
        inicio=null;
    }
    public void insertar(Cancion cancion){
        Nodo nuevoNodo = new Nodo(cancion);
        if(this.inicio==null){
            this.inicio=nuevoNodo;
        }else{
            Nodo nodoActual=inicio.getSiguiente();
            if(nodoActual ==null){
                if(nodoActual==null){
                    inicio.setSiguiente(nuevoNodo);
                }else{
                    while(nodoActual.getSiguiente()!=null){
                        nodoActual=nodoActual.getSiguiente();
                    }
                    nodoActual.setSiguiente(nuevoNodo);
                }
            }
        }
    }
    public void mostrarElementos(){
        Nodo nodoActual=inicio;
        while(nodoActual.getSiguiente() != null){
            System.out.print(nodoActual.getCanciojn().getNombre()+"");
            System.out.print(nodoActual.getCanciojn().getDuracion()+"");
            System.out.println(nodoActual.getCanciojn().getRuta()+"");
            nodoActual = nodoActual.getSiguiente();
        }

    }
}
