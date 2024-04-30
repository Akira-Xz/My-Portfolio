package ListaEnlazadaSimple;

import java.util.Scanner;

public class ListaEnlazada {
    private Node pivote;
    public boolean listaVacia(){
        if(pivote == null){
            return true;
        }
        return false;
    }
    public boolean estaLlena(){
        if(pivote == null){
            return false;
        }
        return true;
    }

    public void crear(Pelicula dato) {
        Node q = new Node();
        q.setDato(dato);
        q.setApuntador(null);
        this.pivote = q;
    }

    public void insertar_inicio(Pelicula dato) {
        if (pivote == null) {
            crear(dato);
        } else {
            Node q = new Node();
            q.setDato(dato);
            q.setApuntador(this.pivote);
            this.pivote = q;
        }

    }

    public void insertar_final(Pelicula dato) {
        if (pivote == null) {
            crear(dato);
        } else {
            Node q = this.pivote;
            while (q.getApuntador() != null) {
                q = q.getApuntador();
            }
            Node x = new Node();
            x.setDato(dato);
            x.setApuntador(null);
            q.setApuntador(x);
        }
    }

    public Node buscarNodo(int id){
        Node t = this.pivote;
        while ( t!=null && !t.equals(id) ) {
            t = t.getApuntador();
        }
        return t;
    }
    

    public boolean agregarNodoAntesDe(Pelicula dato, int id) {
        Node nb = buscarNodo(id);
        Node nab = null, t;
        if (nb != null) {
            t = this.pivote;
            while (t != null && t.getApuntador() != nb)
                t = t.getApuntador();
            nab = t;
            if (nab != null) {
                Node nuevo = new Node();
                nuevo.setDato(dato);
                nuevo.setApuntador(nb);
                nab.setApuntador(nuevo);
                return true;
            } else {
                insertar_inicio(dato);
                return true;
            }
        }
        return false;
    }

    public boolean agregarDespuesDe(Pelicula dato, int id) {
        Node nb = buscarNodo(id);
        Node ndb = null, t;
        if (pivote != null) {
            t = this.pivote;
            while (t != null && t.getApuntador() != nb) {
                t = t.getApuntador();
            }
            ndb = t;
            if (ndb != null) {
                Node nuevo = new Node();
                nuevo.setDato(dato);
                nuevo.setApuntador(ndb);
                ndb.setApuntador(nuevo);
                return true;
            }
        }
        return false;
    }

    public boolean eliminar_inicio() {
        if (pivote != null) {
            Node q = pivote;
            this.pivote = q.getApuntador();
            q.setDato(null);
            q.setApuntador(null);
            return true;
        }
        return false;
    }

    public boolean eliminar_ultimo() {
        Node t = null;
        if (pivote != null) {
            Node q = this.pivote;

            if (pivote.getApuntador() == null) {
                this.pivote = null;
            } else {
                while (q.getApuntador() != null) {
                    t = q;
                    q = q.getApuntador();
                }
                t.setApuntador(null);
            }
            q.setDato(null);
            q.setApuntador(null);
            q = null;
            return true;
        }
        return false;
    }

    public boolean eliminarNodoConCiertaInfo(int dato) {
        Node t = null;
        if (pivote != null) {
            Node q = this.pivote;
            while (q.getApuntador() != null && q.getDato().equals(dato)) {
                t = q;
                q = q.getApuntador();
            }
            if (q.getApuntador() != null) {
                t.setApuntador(q.getApuntador());
                q.setApuntador(null);
                q.setDato(null);
                q = null;
                return true;
            }
        }
        return false;
    }

    public boolean eliminarAntesCiertaInfo(int id) {
        Node t = null, r = null;
        boolean flag = false;
        if (pivote.getDato().getId() == id) {
            return false;
        } else {
            Node q = this.pivote;
            t = this.pivote;
            flag = true;
            while (q.getDato().equals(id) && flag == true) {
                if (q.getApuntador() != null) {
                    r = t;
                    t = q;
                    q = q.getApuntador();
                } else {
                    flag = false;
                }
            }
            if (flag == false) {
                return false;
            } else {
                if (pivote.getApuntador() == q) {
                    pivote = q;
                } else {
                    r = q.getApuntador();
                }
                t.setDato(null);
                t.setApuntador(null);
                t = null;
                return true;

            }
        }
    }

    public boolean eliminaDespuesDe(int dato) {
        if (pivote == null) {
            return false;
        } else {
            Node q = pivote;

            while (q != null && !q.getDato().equals(dato)) {
                q = q.getApuntador();
            }

            if (q != null && q.getApuntador() != null) {
                Node nodoABorrar = q.getApuntador();
                q.setApuntador(nodoABorrar.getApuntador());
                nodoABorrar.setDato(null);
                nodoABorrar.setApuntador(null);
                return true;
            } else {
                return false;
            }
        }
    }

    // Forma iterativa
    public void recorridoIterativo() {
        Node q = this.pivote;
        while (q != null) {
            System.out.println(q.getDato());
            q = q.getApuntador();
        }
    }

    // Forma recursiva
    private void recorridoRecursivo(Node q) {
        if (q != null) {
            System.out.println(q.getDato());
            System.out.println("ID: " + q.getDato().getId());
            System.out.println("Titulo: " + q.getDato().getTitulo());
            System.out.println("Director: " + q.getDato().getDirector());
            System.out.println("Año: " + q.getDato().getAnio());
            System.out.println("Puntaje: " + q.getDato().getPuntaje());
            System.out.println("Doblaje: " + q.getDato().isDoblaje());
            System.out.println("Clasficacion: " + q.getDato().getClasificacion());

            recorridoRecursivo(q.getApuntador());
        }
    }

    public void recorrido_r() {
        recorridoRecursivo(this.pivote);
    }

   
}
