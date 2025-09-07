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
//BojNo.11382
/*
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
*/
//BojNo.2525
/*
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int hour = scanner.nextInt();
		int minute = scanner.nextInt();
		int time = scanner.nextInt();
		int printHour = 0;
		int printMinute = 0;
		
		if(time >= 60) {
			printHour = hour + ((time - (time % 60)) / 60);
			printMinute = minute + (time % 60);
			if(printMinute >= 60) {
				printHour = printHour + ((printMinute - (printMinute % 60)) / 60);
				printMinute = printMinute % 60;
			}
		}else {
			printHour = hour;
			printMinute = minute + time;
			if(printMinute >= 60) {
				printHour = printHour + ((printMinute - (printMinute % 60)) / 60);
				printMinute = printMinute % 60;
			}
		}
		
		System.out.print(printHour % 24);
		System.out.print(" ");
		System.out.print(printMinute);
		
	}
}
*/
// BojNo.25314
/*
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		int i = 0;
		number = number / 4;
		
		for(i = 0; i < number; i++) {
			System.out.print("long ");
		}
		System.out.print("int");
		
		return;
	}
}
*/
// BojNo.25304
/*
import java.util.Scanner;

public class Main{
	public static void main(String[]args){
		int totalPrice = 0;
		int totalNumber = 0;
		int price = 0;
		int number = 0;
		int calcPrice = 0;

		Scanner scanner = new Scanner(System.in);

		totalPrice = scanner.nextInt();
		totalNumber = scanner.nextInt();

		for(int i = 0; i < totalNumber; i++){
			price = scanner.nextInt();
			number = scanner.nextInt();
			calcPrice = calcPrice + (price * number);
		}

		if(totalPrice == calcPrice){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
		return;
		
	}
}
*/
//BojNo.10951 

import java.util.Scanner; 

public class Main{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in); 
		int numberA = 0;
		int numberB = 0;
		// EOF를 이용한 while문 무한반복
		// while은 조건이 항상 True이면 무한반복을 만들 수 있음, False면 종료
		while (scanner.hasNextInt()) { // hasnext~() 메서드는 입력값이 생기기 전 까지는 실행을 안함, 입력하는 값에따라 True/False 반환
				numberA = scanner.nextInt();
				numberB = scanner.nextInt();
				System.out.println(numberA+numberB);
		}
	}
}





















