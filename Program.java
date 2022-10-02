package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width: ");
		rectangle.width = sc.nextDouble();
		System.out.println("Enter rectangle height: ");
		rectangle.height = sc.nextDouble(); 
		
		System.out.println();
		System.out.println("Area = " + rectangle.area());
		System.out.println("Permiter = " + rectangle.perimeter());
		System.out.println("Diagonal = " + rectangle.diagonal());
				
		sc.close();
		
	}

}
