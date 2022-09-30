package ex_numeronegativo;

import java.util.Scanner;

//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
//ordem crescente ou decrescente.
public class Multiplos {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		
			
		System.out.println("Digite o primeiro numero:");
		num1 = sc.nextInt();
		System.out.println("Digite o segundo numero:");
		num2 = sc.nextInt();
		
		if ((num1 % num2 != 0) && (num2 % num1 !=0)) {
			System.out.println("NÃO SÃO MULTIPLOS");
		}else {
			System.out.println("SÃO MULTIPLOS");
			
		}
		
		
		sc.close();
		}

}
