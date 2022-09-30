//Fazer um programa para ler um número inteiro, 
//e depois dizer se este número é negativo ou não.
package ex_numeronegativo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int numero;
	
		
	System.out.println("Digite um numero:");
	numero = sc.nextInt();
	
	if (numero < 0) {
		System.out.println("Numero negativo!");
	}
	else {
		System.out.println("Numero não negativo");
	}
	
	
	sc.close();
	}

}
