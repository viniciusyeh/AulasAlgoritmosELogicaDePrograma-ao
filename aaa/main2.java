package aaa;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class main2 {
	public static void main(String[] args) {
		int maxNumbers = 4;
		List<Integer>  numbers = new ArrayList<>(List.of(4,9,6,2));
		
		Scanner input = new Scanner(System.in);
		
		getTheBigger(numbers);
	}
	
	public static void getTheBigger(List<Integer> numbers) {
		Optional<Integer> maior = numbers.stream().max((o1, o2) -> o1.compareTo(o2));
		System.out.println(maior.get() + " É o maior!");

}
}
