/*
public class Main {
	public static void main(String[]args) {
		System.out.println("Hello World!");
	}
*/

import java.util.Scanner;

public class Main {
	public static int Sum(int number1, int number2) {
		return number1 + number2;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		int inputNumber1 = scanner.nextInt();
		int inputNumber2 = scanner.nextInt();
		
		
		System.out.println(inputNumber1+inputNumber2);
		return;
				
	}
}