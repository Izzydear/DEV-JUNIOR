package ex_numeronegativo;

import java.util.Scanner;
//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
public class Horajogo {

public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int horaini;
	int horafim;
	
	System.out.println("Digite a hora inicial do jogo: ");
	horaini = sc.nextInt();
	System.out.println("Digite a hora final do jogo: ");
	horafim = sc.nextInt();
	
	
	
	

	sc.close();
	}
	
}

