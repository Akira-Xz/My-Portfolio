package Colas;
import ListaEnlazadaSimple.Pelicula;
import ListaEnlazadaSimple.ListaEnlazada;
public class Colas extends ListaEnlazada{
    public void push(Pelicula dato) {
        insertar_inicio(dato);
     }
 
     public boolean pop( ) {
         return eliminar_ultimo();
     }
 
     public boolean full(){
         return estaLlena();
     }
 
     public boolean empty(){
         return listaVacia();
     }
}
