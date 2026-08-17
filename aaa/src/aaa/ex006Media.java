package aaa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex006Media {
	public static void main(String[] args) {
		List<Double> notas = new ArrayList<>(List.of(6D,7D,5D));
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("DIGITE A NOTA PARA ADICIONAR");
			double nota = input.nextDouble();
			notas.add(nota);
			System.out.println(getMedia(notas));
		}
		

		
	}
	
	public static double getMedia(List<Double> notas) {
		return notas.stream().mapToDouble(Double::doubleValue).average().orElseThrow();
		
		
	}

}
