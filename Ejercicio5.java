
import java.util.Scanner;

public class Ejercicio5{
public static void main (String args[]){
	double numero, pi = 3.1416;

	Scanner S = new Scanner(System.in);
	System.out.println("Ingresa tu radio");
	numero = S.nextDouble();

double Resultado =  (pi * Math.pow(numero, 2));

System.out.println("El area del circulo es " + Resultado);
}
}