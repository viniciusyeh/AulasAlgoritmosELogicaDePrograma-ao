package aaa;

import java.util.Scanner;

public class exCalculadora005 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("DIGITE A OPERAÇÃO");
		String operation = input.nextLine();
		
		System.out.println("DIGITE O PRIMEIRO NUMERO DA OPERAÇÃO");
		double num1 = input.nextDouble();
		
		System.out.println("DIGITE O SEGUNDO NUMERO DA OPERAÇÃO");
		double num2 = input.nextDouble();
		
		
		System.out.println("--------------------");
		if(operation != null) calculadora(num1,num2,operation);
		
	}
	
	public static void calculadora(double num1, double num2, String operation) {
		if(operation.equals("soma")) {
			System.out.println(num1 + num2);
		}
		else if(operation.equals("subtração")) {
			System.out.println(num1 - num2);
		}
		else if(operation.equals("multiplicação")) {
			System.out.println(num1 * num2);

		}
		else if(operation.equals("divisão")) {
			System.out.println(num1 / num2);

		}
		else {
			System.out.println("DIGITE UMA OPERAÇÂO VÁLIDA");
		}
		
	}

}
