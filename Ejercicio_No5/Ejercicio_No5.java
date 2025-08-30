package Ejercicio_No5;
import java.util.Scanner;
public class Ejercicio_No5 {
    public static void main(String[] args) {

        double suma, x, y;
        Scanner scanner = new Scanner(System.in); //leer lo que entra por el teclado

        System.out.println("Ingrese un número para suma:");
        suma = scanner.nextDouble(); //lee desde el teclado y asigna el valor a suma

        System.out.println("Ingrese un número para x:");
        x = scanner.nextDouble();

        System.out.println("Ingrese un número para y:");
        y = scanner.nextDouble();

        suma = calculos.calcular_suma(suma, x);
        x = calculos.calcular_x(x, y);

        suma = suma + (x/y);
        System.out.println("El valor de la suma es: " + suma);
        scanner.close();
    }
}
