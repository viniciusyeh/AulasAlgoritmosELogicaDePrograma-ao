package aaa;

public class ex004 {
	public static void main(String[] args) {
	  double fahrenheit = 68;
	  double celsius = 20;
	  
	  celsiusToFahrenheit(celsius);
	  fahrenheitToCelsius(fahrenheit);
	}
	
	public static void celsiusToFahrenheit(double celsius) {
		double fahrenheit = celsius* 1.8 + 32;
		System.out.println("Em Fahrenheit, a temperatura é de: " + fahrenheit);
	}
	
	public static void fahrenheitToCelsius(double fahrenheit) {
		double celsius = (fahrenheit - 32)/1.8;
		System.out.println("Em Celsius, a temperatura é de: " + celsius);
	}
}
