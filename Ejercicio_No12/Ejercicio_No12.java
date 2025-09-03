package Ejercicio_No12;
import java.util.Scanner;
public class Ejercicio_No12 {
    public static void main(String[] args) {
        
        double horas_trabajadas, valor_hora, retencion, salario_bruto, salario_neto;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número para las horas trabajadas:");
        horas_trabajadas = scanner.nextDouble();
        
        System.out.println("Ingrese un número para el valor hora:");
        valor_hora = scanner.nextDouble();

        System.out.println("Ingrese un número para la retencion:");
        retencion = scanner.nextDouble();

        salario_bruto = calculos.calcular_salario_bruto(horas_trabajadas, valor_hora);
        retencion = calculos.calcular_porcentaje_retencion(retencion);

        double valor_retencion_fuente = calculos.calcular_valor_retencion_fuente(retencion, salario_bruto);

        salario_neto = calculos.calcular_salario_neto(salario_bruto, valor_retencion_fuente);

        System.out.println("Salario Bruto: " + salario_bruto);
        System.out.println("Valor retencion en la fuente: " + valor_retencion_fuente);
        System.out.println("Salario Neto: " + salario_neto);
        scanner.close();
    }
}