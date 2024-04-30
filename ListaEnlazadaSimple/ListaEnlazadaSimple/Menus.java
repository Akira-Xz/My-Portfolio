package ListaEnlazadaSimple;

import java.util.Scanner;

public class Menus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaEnlazada l = new ListaEnlazada();
        int opcion;
        do {
            System.out.println("1.- Insertar nodos");
            System.out.println("2.- Eliminar nodos");
            System.out.println("3.- Buscar nodo");
            System.out.println("4.- Mostrar lista en pantalla");
            System.out.println("5.- Salir del programa");
            System.out.print("\nIngrese una opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    int choice = 0;
                    do {
                        System.out.println("1.- Inserta al inicio de la lista.");
                        System.out.println("2.- Inserta al final de la lista.");
                        System.out.println("3.-Agregar antes de");
                        System.out.println("4.-Agregar despues de");
                        System.out.println("5.-Regresar al menu anterior");
                        System.out.print("\nIngrese una opción: ");
                        choice = sc.nextInt();
                        switch (choice) {
                            case 1:
                                Pelicula peliInicio = new Pelicula();
                                System.out.println("Ingrese el id");
                                peliInicio.setId(sc.nextInt());
                                System.out.println("Ingrese el titulo");
                                peliInicio.setTitulo(sc.next());
                                System.out.println("Ingrese el director");
                                peliInicio.setDirector(sc.next());
                                System.out.println("Ingrese el año");
                                peliInicio.setAnio(sc.nextInt());
                                System.out.println("Ingrese el puntaje");
                                peliInicio.setPuntaje(sc.nextDouble());
                                System.out.println("¿La pelicula cuenta con doblaje?");
                                if (sc.next().equalsIgnoreCase("si")) {
                                    peliInicio.setDoblaje(true);
                                } else {
                                    peliInicio.setDoblaje(false);
                                }
                                System.out.println("Ingrese la clasificacion");
                                peliInicio.setClasificacion(sc.next());

                                l.insertar_inicio(peliInicio);
                                break;
                            case 2:
                                Pelicula peliFinal = new Pelicula();
                                System.out.println("Ingrese el id");
                                peliFinal.setId(sc.nextInt());
                                System.out.println("Ingrese el titulo");
                                peliFinal.setTitulo(sc.next());
                                System.out.println("Ingrese el director");
                                peliFinal.setDirector(sc.next());
                                System.out.println("Ingrese el año");
                                peliFinal.setAnio(sc.nextInt());
                                System.out.println("Ingrese el puntaje");
                                peliFinal.setPuntaje(sc.nextDouble());
                                System.out.println("¿La pelicula cuenta con doblaje?");
                                if (sc.next().equalsIgnoreCase("si")) {
                                    peliFinal.setDoblaje(true);
                                } else {
                                    peliFinal.setDoblaje(false);
                                }
                                System.out.println("Ingrese la clasificacion");
                                peliFinal.setClasificacion(sc.next());
                                l.insertar_final(peliFinal);
                                break;
                            case 3:
                                Pelicula PeliAntesDe = new Pelicula();

                                System.out.println("Ingrese el id: ");
                                PeliAntesDe.setId(sc.nextInt());

                                System.out.println("Ingrese el titulo: ");
                                PeliAntesDe.setTitulo((sc.next()));

                                System.out.println("Ingrese el director ");
                                PeliAntesDe.setDirector(sc.next());

                                System.out.println("Ingrese el año de salida ");
                                PeliAntesDe.setAnio(sc.nextInt());

                                System.out.println("Ingrese el puntaje ");
                                PeliAntesDe.setPuntaje(sc.nextDouble());

                                System.out.println("¿La pelicula cuenta con doblaje? ");
                                if (sc.next().equalsIgnoreCase("si")) {
                                    PeliAntesDe.setDoblaje(true);
                                } else {
                                    PeliAntesDe.setDoblaje(false);
                                }

                                System.out.println("Ingrese la clasificacion de la pelicula ");
                                PeliAntesDe.setClasificacion(sc.next());

                                System.out.println(
                                        "==================== NODO ANTERIOR =================================");

                                System.out.println("Ingrese el ID del nodo anterior");
                                int pocisionAnterior= sc.nextInt();

                                l.agregarNodoAntesDe(PeliAntesDe, pocisionAnterior);
                                break;
                            case 4:
                                Pelicula PeliDespuesDe = new Pelicula();

                                System.out.println("Ingrese el id: ");
                                PeliDespuesDe.setId(sc.nextInt());

                                System.out.println("Ingrese el titulo: ");
                                PeliDespuesDe.setTitulo((sc.next()));

                                System.out.println("Ingrese el director ");
                                PeliDespuesDe.setDirector(sc.next());

                                System.out.println("Ingrese el año de salida ");
                                PeliDespuesDe.setAnio(sc.nextInt());

                                System.out.println("Ingrese el puntaje ");
                                PeliDespuesDe.setPuntaje(sc.nextDouble());

                                System.out.println("¿La pelicula cuenta con doblaje? ");
                                if (sc.next().equalsIgnoreCase("si")) {
                                    PeliDespuesDe.setDoblaje(true);
                                } else {
                                    PeliDespuesDe.setDoblaje(false);
                                }

                                System.out.println("Ingrese la clasificacion de la pelicula ");
                                PeliDespuesDe.setClasificacion(sc.next());

                                System.out.println(
                                        "==================== NODO POSTERIOR =================================");

                                System.out.println("Ingrese el ID del nodo posterior");
                                int posicionPosterior= sc.nextInt();

                                l.agregarNodoAntesDe(PeliDespuesDe, posicionPosterior);
                                break;

                            default:
                                break;
                        }

                    } while (choice != 5);
                    break;
                case 2:
                    // Menu para eliminar nodos
                    int choiceElim = 0;
                    do {
                        System.out.println("1.Eliminar al inicio");
                        System.out.println("2.Eliminar al final");
                        System.out.println("3.Eliminar antes de");
                        System.out.println("4.Eliminar despues de");
                        System.out.println("5.Eliminar con X informacion");
                        System.out.println("6.Regresar al menu principal");
                        choiceElim = sc.nextInt();
                        switch (choiceElim) {
                            case 1:
                                l.eliminar_inicio();
                                break;
                            case 2:
                                l.eliminar_ultimo();
                                break;
                            case 3:
                                System.out.println(
                                        "==================== NODO ANTERIOR =================================");

                                System.out.println("Ingrese el ID del nodo anterior para su eliminacion");
                                int posicionAnterior= sc.nextInt();


                                l.eliminarAntesCiertaInfo(posicionAnterior);
                                break;
                            case 4:
                                System.out.println(
                                        "==================== NODO POSTERIOR =================================");

                                System.out.println("Ingrese el id del nodo posterior para su eliminacion: ");
                                int posicionPosterior = sc.nextInt();


                                l.eliminaDespuesDe(posicionPosterior);
                                break;
                            case 5:
                                System.out.println("Ingrese el id: ");
                                int nodoABuscar = sc.nextInt();

                                l.eliminarNodoConCiertaInfo(nodoABuscar);

                            default:
                                break;

                        }

                    } while (choiceElim != 6);
                    break;
                case 3:
                    // menu para buscar un nodo en particular
                    System.out.println("Ingrese el id: ");
                    int posicionBuscada = sc.nextInt();
                    l.buscarNodo(posicionBuscada);
                case 4:
                    l.recorrido_r();

            }
        } while (opcion != 5);
        sc.close();
    }
}