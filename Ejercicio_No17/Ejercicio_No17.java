package Ejercicio_No17;
import java.util.Scanner;

public class Ejercicio_No17 {

    public static void main(String[] args) {
        
        double radio, longitud_circunferencia, area_circulo;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número para el radio:");
        radio = scanner.nextDouble();

        longitud_circunferencia = calculos.calcular_longitud_circunferencia(radio);
        area_circulo = calculos.calcular_circulo(radio);
        
        System.out.println("Longitud de la circunferencia: " + longitud_circunferencia);
        System.out.println("Área del circulo: " + area_circulo);
        scanner.close();
    }
}