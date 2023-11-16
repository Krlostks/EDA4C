public class listaLigada {
    private Nodo head;
    private Nodo tail;
     private int lenght;

     public listaLigada(){
        // Constructor
        head = null;
        tail = null;
        lenght = 0;
    }

    public boolean isEmpty(){
        return this.lenght == 0;
    }

    public int getLeng(){
        return this.lenght;
    }
    public void add(int valor) {
        Nodo nodo = new Nodo(valor);

        if (isEmpty()) {
            //lalista esta vacia 
            //nodo es el primer nodo de la lista
            head = nodo;
            tail =nodo;
            this.lenght++;
        }else{
            //Ya hay nodos en la lista y se agrega el nuevo nodo al final
            Nodo actual = tail;
            tail =nodo;
            actual.setApuntador(nodo);
            this.lenght++;        
        }
    }
    public void printList(){
        Nodo actual = head;
        while (actual != null) {
            System.out.println(actual.getDato());
            actual = actual.getApuntador();
        }
    }
}
