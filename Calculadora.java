package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("primer numero para operar: ");
        double n1=sc.nextDouble();
        System.out.println("segundo numero para operar: ");
        double n2=sc.nextDouble();
        
        //suma
        Suma sum = new Suma(n1,n2);
        sum.mostrarResultado();
        
        //resta
        Resta res = new Resta(n1,n2);
        res.mostrarResultado();
        
        //multiplicacion
        Multiplicacion mul = new Multiplicacion(n1,n2);
        mul.mostrarResultado();
        
        //division
        Division div = new Division(n1,n2);
        div.mostrarResultado();
    }
}