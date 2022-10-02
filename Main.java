//Fazer um programa para ler um número inteiro, 
//e depois dizer se este número é negativo ou não.
package ex_numeronegativo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	
	Scanner sc = new Scanner(System.in);
	int numero;
	


	
	System.out.println("Olá Mundo!");import java.util.Locale;
		
import java.util.Scanner;

	int y = 32;
	double x = 10.35784;
	String nome = "Maria";
	int idade = 31;
	double renda = 4.000;
	System.out.println(y);
	System.out.println(x);
	System.out.printf("%.2f%n", x); //Comando para colocar 2 casas decimais
	System.out.println("Bom dia");	
	System.out.printf("%.4f%n", x); //Comando para colocar 4 casas decimais
	Locale.setDefault(Locale.US); //configurar o marcador americano de numero decimal 
	System.out.printf("%.4f%n", x);
	System.out.println("RESULTADO = " + x + " METROS"); //Concatenar varios elementos usando um mesmo comando
	System.out.printf("RESULTADO = %.2f metros%n", x); //Varios elementos usando printf
    System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda); //varias variaveis 
    //marcador texto %s 
    //marcador inteiro %d
    //marcador ponto flutuante %f
    	Scanner sc = new Scanner(System.in); //entrada de dados
    	
    	String p;
    	p = sc .next();
    	System.out.println("Você digitou: " + p);
        
    	sc.close();
    // ler inteiro sc.nextInt
    // ler ponto flutuante sc.nextDouble



		

		
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
