package aaa;

public class main {
	public static void main(String[] args) {
		int x = 10;
		int y = 9;
		int z = 11;
		getTheBigger(x,y,z);
		System.out.println("Hello World!");
		
	}
	
	public static void getTheBigger(int num1, int num2, int num3) {
		if(num1>num2 && num1>num3) {
			System.out.println(num1 + " é o maior");
		}else if(num2>num1 && num2>num3){
			System.out.println(num2 + " é o maior");
		}else {
			System.out.println(num3 + " é o maior");

		}
	}

}
