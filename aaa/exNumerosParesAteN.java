package aaa;

import java.util.Scanner;

public class exNumerosParesAteN {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o número");
		int num = input.nextInt();
		
		//jeitoUm(num);
		jeitoDois(num);
		
	}
	
	public static void jeitoUm(int num) {
		for(int i = 0; i <= num; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		System.out.println("-----------------");

	}
	
	public static void jeitoDois(int num) {
		for(int i = 0; i <= num; i+=2) {
				System.out.println(i);
		}
		System.out.println("-----------------");
	}

}
