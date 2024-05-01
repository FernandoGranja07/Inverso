import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static Scanner leer = new Scanner(System.in);
    public static int dimension;

    public static void main(String[] args) {

        while (true) {

            try {
                System.out.print("Ingrese la dimension de su arreglo (1-16): ");
                dimension = leer.nextInt();

                if (dimension < 1 || dimension > 16) {
                    throw new Exception("la dimension debe de ser entre 1-16");
                }
      break;
            } catch (InputMismatchException e) {
                System.out.println("Ingrese un valor entero.");
                leer.next();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
        leer.nextLine();

        int[] array = llenado();
        System.out.println("El inverso de los numeros ingresados es: ");
        imprimirArregloInvertido(array);

    }

    public static int[] llenado() {
        int[] array = new int[dimension];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Ingrese el valor [" + (i + 1) + "]: ");
            try {
                array[i] = leer.nextInt();
                if (array[i] < 1 || array[i] > 16) {
                    throw new Exception("El valor debe estar entre 1 y 16");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingrese un valor entero.");
                leer.next();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return array;
    }

    public static void imprimirArregloInvertido(int[] array) {
        for (int i = array.length -1 ; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}