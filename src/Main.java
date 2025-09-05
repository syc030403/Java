/*
public class Main {
	public static void main(String[]args) {
		System.out.println("Hello World!");
	}
*/
/*	A+B
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
*/
//Boj No.11382
import java.util.Scanner;

public class Main{
	
	public static long Calc(long A, long B, long C) {
		return (A+B+C);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		long inputNumber1 = input.nextLong();
		long inputNumber2 = input.nextLong();
		long inputNumber3 = input.nextLong();
		long calcNumber = Calc(inputNumber1, inputNumber2, inputNumber3);
		System.out.println(calcNumber);
		
		return ;
	}
}






















