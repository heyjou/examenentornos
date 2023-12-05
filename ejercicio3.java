import java.util.Scanner;
import java.math.*;

public class ejercicio3 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int opcion;
            System.out.println("Menú de opciones:");
            System.out.println("1. Área triángulo");
            System.out.println("2. Área círculo");
            System.out.println("3. Área del cono");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();

                    switch (opcion) {

                        case 1:
                            System.out.print("Ingrese la base del triángulo: ");
                            double baseTriangulo = sc.nextDouble();
                            System.out.print("Ingrese la altura del triángulo: ");
                            double alturaTriangulo = sc.nextDouble();
                            double areaTriangulo = 0.5 * baseTriangulo * alturaTriangulo;
                            System.out.print("El área del triangulo es: " +areaTriangulo);

                            break;
                        case 2:
                            System.out.print("Ingrese el radio del círculo: ");
                            double radioCirculo = sc.nextDouble();
                            double areaCirculo = Math.PI * Math.pow(radioCirculo, 2);
                            System.out.print("El área del circulo es: " +areaCirculo);
                            break;

                        case 3:
                            System.out.print("Ingrese el radio de la base del cono: ");
                            double radioCono = sc.nextDouble();
                            System.out.print("Ingrese la altura del cono: ");
                            double alturaCono = sc.nextDouble();
                            double areaCono= Math.PI * radioCono * (radioCono + Math.sqrt(Math.pow(alturaCono, 2) + Math.pow(radioCono, 2)));
                            System.out.print("El área del cono es: " +areaCono);
                            break;

                        default:
                            System.out.println("Opción no válida. Inténtelo de nuevo.");
                    }

            sc.close();
        }
    }