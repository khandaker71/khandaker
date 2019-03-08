package lesson;

import java.util.Scanner;

public class Exercise_1 {
	public static void main(String[] args) {
// convert ferenheit to celcious
	
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter a degree in Fahrenheit:   ");
		double ferenheit = sca.nextDouble();

		
		double celsious = (5.0 / 9) * (ferenheit - 32);
	System.out.println("ferenheit    " + ferenheit + "    is   " + celsious + "    in celcious  ");
	
	System.out.println("-------------------------------------------------------------------------");
	
//convert pounds to kilogram
		Scanner pca = new Scanner(System.in);
		System.out.println("Enter a number in pounds :   ");
		double pound = pca.nextDouble();
		double kilo = (pound * 0.454);
		System.out.println( pound + "   pounds  is   " + kilo + "    kilogram  ");
	}
}