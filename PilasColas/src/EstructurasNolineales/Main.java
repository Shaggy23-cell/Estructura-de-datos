package EstructurasNolineales;

public class Main {
    public static void main(String[] args) {
Arbol arbol=new Arbol();
        arbol.insertar(57);
        arbol.insertar(30);
        arbol.insertar(60);
        arbol.insertar(12);
        arbol.insertar(56);
        arbol.insertar(7);
        arbol.insertar(8);
        arbol.insertar(61);
        System.out.println("INORDEN: ");
        arbol.dispararInorden();
        System.out.println("");
        System.out.println("POSTORDEN: ");
        arbol.dispararPosorden();
        System.out.println("");
        System.out.println("PREORDEN: ");
        arbol.dispararPreorden();
        System.out.println("");
    }
}
