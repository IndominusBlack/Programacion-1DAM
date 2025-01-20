import java.util.Scanner;

public class Menu {

    public static String separador() {
        return "------------------------------------------------------------------------";
    }

    public static void menuPrincipal() {
        System.out.println("Programa GESTISIMAL: (Selecciona un número del 1 al 7)");
        System.out.println("=========================================================================");
        System.out.println("");
        System.out.println("1. Listado");
        System.out.println("2. Alta");
        System.out.println("3. Baja");
        System.out.println("4. Modificación");
        System.out.println("5. Entrada de mercancía");
        System.out.println("6. Salida de mercancía");
        System.out.println("7. Salir");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Articulo[] articulo = new Articulo[100];
        int numArticulos = 0;
        boolean salir = false;

        while (!salir) {
            menuPrincipal();
            System.out.print("Introduce una opción: ");
            int menu = sc.nextInt();
            sc.nextLine();
            System.out.println(separador());

            switch (menu) {
                case 1: // Listado
                    System.out.println("\nListado de artículos:");
                    for (int i = 0; i < numArticulos; i++) {
                        System.out.println(articulo[i]);
                    }
                    break;

                case 2: // Alta
                    System.out.println("Has decidido dar de alta un artículo. Define sus atributos:");
                    System.out.print("Código: ");
                    int cod = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Descripción: ");
                    String desc = sc.nextLine();
                    System.out.print("Precio de compra: ");
                    int com = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Precio de venta: ");
                    int ven = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Stock: ");
                    int sto = sc.nextInt();
                    sc.nextLine();

                    articulo[numArticulos] = new Articulo(cod, desc, com, ven, sto);
                    numArticulos++;
                    System.out.println("Artículo añadido correctamente.");
                    break;

                case 3: // Baja
                    System.out.print("Introduce el código del artículo a eliminar: ");
                    int codigoEliminar = sc.nextInt();
                    boolean encontrado = false;

                    for (int i = 0; i < numArticulos; i++) {
                        if (articulo[i].getCodigo() == codigoEliminar) {
                            for (int j = i; j < numArticulos - 1; j++) {
                                articulo[j] = articulo[j + 1];
                            }
                            articulo[numArticulos - 1] = null;
                            numArticulos--;
                            encontrado = true;
                            System.out.println("Artículo eliminado correctamente.");
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("No se encontró un artículo con ese código.");
                    }
                    break;

                case 4: // Modificación
                    System.out.print("Introduce el código del artículo a modificar: ");
                    int codigoModificar = sc.nextInt();
                    sc.nextLine();
                    encontrado = false;

                    for (int i = 0; i < numArticulos; i++) {
                        if (articulo[i].getCodigo() == codigoModificar) {
                            System.out.println("Introduce los nuevos valores (deja en blanco para no cambiar):");
                            System.out.print("Descripción: ");
                            String nuevaDescripcion = sc.nextLine();
                            if (!nuevaDescripcion.isEmpty()) {
                                articulo[i].setDescripcion(nuevaDescripcion);
                            }

                            System.out.print("Precio de compra: ");
                            String nuevaCompra = sc.nextLine();
                            if (!nuevaCompra.isEmpty()) {
                                articulo[i].setCompra(Integer.parseInt(nuevaCompra));
                            }

                            System.out.print("Precio de venta: ");
                            String nuevaVenta = sc.nextLine();
                            if (!nuevaVenta.isEmpty()) {
                                articulo[i].setVenta(Integer.parseInt(nuevaVenta));
                            }

                            System.out.print("Stock: ");
                            String nuevoStock = sc.nextLine();
                            if (!nuevoStock.isEmpty()) {
                                articulo[i].setStock(Integer.parseInt(nuevoStock));
                            }

                            encontrado = true;
                            System.out.println("Artículo modificado correctamente.");
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("No se encontró un artículo con ese código.");
                    }
                    break;

                case 5: // Entrada de mercancía
                    System.out.print("Introduce el código del artículo: ");
                    int codigoEntrada = sc.nextInt();
                    System.out.print("Cantidad a añadir al stock: ");
                    int cantidadEntrada = sc.nextInt();
                    encontrado = false;

                    for (int i = 0; i < numArticulos; i++) {
                        if (articulo[i].getCodigo() == codigoEntrada) {
                            articulo[i].setStock(articulo[i].getStock() + cantidadEntrada);
                            encontrado = true;
                            System.out.println("Stock actualizado correctamente.");
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("No se encontró un artículo con ese código.");
                    }
                    break;

                case 6: // Salida de mercancía
                    System.out.print("Introduce el código del artículo: ");
                    int codigoSalida = sc.nextInt();
                    System.out.print("Cantidad a restar del stock: ");
                    int cantidadSalida = sc.nextInt();
                    encontrado = false;

                    for (int i = 0; i < numArticulos; i++) {
                        if (articulo[i].getCodigo() == codigoSalida) {
                            if (articulo[i].getStock() >= cantidadSalida) {
                                articulo[i].setStock(articulo[i].getStock() - cantidadSalida);
                                System.out.println("Stock actualizado correctamente.");
                            } else {
                                System.out.println("No hay suficiente stock para realizar esta operación.");
                            }
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("No se encontró un artículo con ese código.");
                    }
                    break;

                case 7: // Salir
                    System.out.println("Saliendo del programa...");
                    salir = true;
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, selecciona un número entre 1 y 7.");
                    break;
            }

            System.out.println(separador());
        }

        sc.close();
    }
}
