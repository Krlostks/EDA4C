public class Nodo {
    private int dato;
    private Nodo apuntador;
    public Nodo (int valor){
        this.dato = valor;
        this.apuntador=null;
    }
    public int getDato() {
        return dato;
    }
    public void setDato(int dato) {
        this.dato = dato;
    }
    //regresa al nodo que esta apuntando
    public Nodo getApuntador() {
        return apuntador;
    }
    //MOdificar a donde apunta el nodo
    public void setApuntador(Nodo otroNodo) {
        this.apuntador = otroNodo;
    }
    
}
