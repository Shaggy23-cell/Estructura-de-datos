package EstructurasLineales;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        ListaEnlazada listaEnlazada= new ListaEnlazada();
        listaEnlazada.insertar(new Cancion("Navidad","/navidad.mp3",65));
        listaEnlazada.insertar(new Cancion("Navidad2","/navidad.mp3",65));
        listaEnlazada.insertar(new Cancion("Navidad3","/navidad.mp3",65));
        listaEnlazada.mostrarElementos();
        LinkedList<Cancion> listaJava=new LinkedList<>();
        listaJava.add(new Cancion("asdsad","asadas",12));
        listaJava.add(new Cancion("asdsad2","asadas",12));
        listaJava.add(new Cancion("asdsad3","asadas",12));
        for(int x=0;x<listaJava.size();x++){
        Cancion c=listaJava.get(x);
        System.out.println(c.getNombre());
}


        /*Stack<Usuario> pila=new Stack<>();
        Stack<Integer> pila2=new Stack<>();
        Queue<Usuario> cola=new LinkedList<>();
        pila.add(new Usuario("yo","calle tal","123123123123"));
        pila.add(new Usuario("tu","calle tal","123123123123"));
        pila.add(new Usuario("el","calle tal","123123123123"));
        Usuario cachar =pila.pop();
        System.out.println(cachar.getNombre());
        cachar=pila.pop();
        System.out.println(cachar.getNombre());
        pila.pop();
       if(pila.isEmpty()) System.out.println("Esta vacia");
       pila2.add(1);
       pila2.add(2);
       pila2.add(3);
        cola.add(new Usuario("yo","calle tal","123123123123"));
        cola.add(new Usuario("tu","calle tal","123123123123"));
        cola.add(new Usuario("el","calle tal","123123123123"));
        Usuario usr=cola.poll();
        System.out.println(usr.getNombre());
        cola.clear();
        pila.clear();
        Usuario cachar2=cola.peek();
        System.out.println(cachar2.getNombre());
*/


    }
}
