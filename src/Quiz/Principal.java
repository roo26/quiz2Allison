
package Quiz;

import java.util.Scanner;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("**BIENVENIDOS**");
            System.out.println("---MENU---");
            System.out.println("Presione 1 -- Calcular el area del rectangulo");
            System.out.println("Presone 0 -- Salir");
            System.out.print("Porfavor ingrese una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    try {
                        System.out.print("Porfavor ingrese el ancho del rectangulo: ");
                        int ancho = scanner.nextInt();
                        System.out.print("Porfavor ingrese la altura dele rectangulo: ");
                        int altura = scanner.nextInt();

                        Rectangulo rectangulo = new Rectangulo(ancho, altura);
                        int area = rectangulo.calcularArea();
                        System.out.println("El area del rectangulo es: " + area);
                    } catch (RectanguloException e) {
                        System.out.println("UPS! Error: " + e.getMessage());
                    }
                    break;
                case 0:
                    System.out.println("---SALIENDO DEL PROGRAMA---");
                    break;
                default:
                    System.out.println("La opcion ingresada es invalida, TRY AGAIN!");
                    break;
            }
            System.out.println();
        } while (opcion != 0);

        scanner.close();
    }
 }
    

