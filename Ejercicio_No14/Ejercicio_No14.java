package Ejercicio_No14;
import java.util.Scanner;

public class Ejercicio_No14 {
    
    public static void main(String[] args) {
        
        double numero, cuadrado, cubo;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        numero = scanner.nextDouble();
        cuadrado = calculos.calcular_cuadrado(numero);
        cubo = calculos.calcular_cubo(numero);

        System.out.println("Número: " + numero);
        System.out.println("Cuadrado: " + cuadrado);
        System.out.println("Cubo: " + cubo);
        scanner.close();
    }
}