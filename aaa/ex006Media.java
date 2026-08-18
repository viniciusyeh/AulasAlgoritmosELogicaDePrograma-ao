package aaa;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ex006Media {
	public static void main(String[] args) {
		
		service();
		
	}
	
	public static void service() {
		boolean systemStatus = true;
		List<Double> notas = new ArrayList<>(List.of());
		
		Scanner input = new Scanner(System.in);
		
		while(systemStatus) {
			Double nota = 0D;
			System.out.println("DIGITE A NOTA PARA ADICIONAR");
			
			try {
			nota = input.nextDouble();
			}catch(InputMismatchException e) {
				
				systemStatus = false;
				break;
			}
			if(nota<0) {
				System.out.println("NOTA INVÁLIDA");
				System.out.println("--------------");

			}
			else {
			notas.add(nota);
			System.out.println(getMedia(notas));
			}
		}
	}
	
	public static double getMedia(List<Double> notas) {
		return notas.stream().mapToDouble(Double::doubleValue).average().orElseThrow();
		
		
	}

}
