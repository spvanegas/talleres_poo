package Ejercicio_No4;

public class Ejercicio_No4 {
    public static void main(String[] args) {
        double edjuan = 9;
        double edalber = calculos.calcular_edalber(edjuan);
        double edana = calculos.calcular_edana(edjuan);
        double edmama = calculos.calcular_edmama(edjuan, edalber, edana);
        System.out.println("Juan: " + edjuan);
        System.out.println("Ana: " + edana);
        System.out.println("Alberto: " + edalber);
        System.out.println("Mamá: " + edmama);
    }
}
