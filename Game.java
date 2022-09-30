package ex_numeronegativo;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int horaInicio;
		int horaTermino;
		int aux;
		
		System.out.println("Digite a hora de inicio do jogo:");
		horaInicio = sc.nextInt();
		System.out.println("Digite a hora do termino do jogo:");
		horaTermino = sc.nextInt();
		
		if(horaInicio == horaTermino){
			System.out.println("O JOGO DUROU 24 HORAS");
		} else if(horaInicio > horaTermino){
			aux = (24 - horaInicio) + (horaTermino - 0);
			System.out.println("O JOGO DUROU " + aux + " HORAS");
		} else {
			aux = horaTermino - horaInicio;
			System.out.println("O JOGO DUROU " + aux + " HORAS");
		}
		
		
		sc.close();
	}

}
