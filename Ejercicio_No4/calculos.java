package Ejercicio_No4;

public class calculos {

    static double calcular_edalber(double edjuan){
        double edalber = 2* (edjuan/3);
        return edalber;
    }

    static double calcular_edana(double edjuan){
        double edana = 4* (edjuan/3);
        return edana;
    }

    static double calcular_edmama(double edjuan, double edalber, double edana){
        double edmama = edjuan + edalber + edana;
        return edmama;
    } 

}