package ListaEnlazadaSimple;

public class Node {
    private Pelicula dato;
    private Node apuntador;
    public Node(){
        this.dato = null;
    }
    public Node(Pelicula x){
        this.dato = x;
        this.apuntador = null;
    }
    //Metodos get y set
    public Pelicula getDato(){
        return dato;
    }
    public void setDato(Pelicula dato){
        this.dato = dato;
    }
    public Node getApuntador(){
        return apuntador;
    }  
    public void setApuntador(Node apuntador){
        this.apuntador = apuntador;
    }
    //@Override
    public boolean equals(Pelicula d){
        if (this.dato.equals(d)){
            return true;
        }
        return false;
    }
}
