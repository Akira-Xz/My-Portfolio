
//import java.util.Objects;
package ListaEnlazadaSimple;

public class Pelicula implements Comparable<Pelicula> {
    private int id;
    private String titulo;
    private String director;
    private int anio;
    private Double puntaje;
    private boolean doblaje;
    private String clasificacion;

    public Pelicula() {
        this.id = 0;
        this.titulo = "";
        this.director = "";
        this.anio = 0;
        this.puntaje = 0.0;
        this.doblaje = false;
        this.clasificacion = "";
    }

    // Constructor para titulo y anio
    public Pelicula(String titulo, int anio) {
        this.titulo = titulo;
        this.anio = anio;
    }

    // Constructor para los demas atributos
    public Pelicula(String titulo, String director, int anio, double puntaje, boolean doblaje, String clasificacion,
            int id) {
        this.titulo = titulo;
        this.director = director;
        this.anio = anio;
        this.puntaje = puntaje;
        this.doblaje = doblaje;
        this.clasificacion = clasificacion;
        this.id = id;
    }

    // Metodos get y set
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }

    public boolean isDoblaje() {
        return doblaje;
    }

    public void setDoblaje(boolean doblaje) {
        this.doblaje = doblaje;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Pelicula otraPelicula) {
        return 0;
    }

    // @Override
    public boolean equals(Pelicula obj) {
        if (this.id != obj.getId()) {
            if (this.titulo.equals(obj.getTitulo())) {
                if (this.director.equals(obj.getDirector())) {
                    if (this.anio == obj.getAnio()) {
                        if (this.puntaje == obj.getPuntaje()) {
                            if (this.doblaje == obj.isDoblaje()) {
                                if (this.clasificacion == obj.getClasificacion()) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

}
