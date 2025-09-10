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
/*
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
	scanner.close(); // 스캐너 종
	return;
	}
}
*/
// BojNo.10807
/*
import java.util.Scanner;

public class Main{
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		int numberN = 0;
		int compareNumber = 0;
		int count = 0;
		numberN = scanner.nextInt();
		
		int[] inputNumberArray = new int[numberN];
		for(int i = 0;i < numberN;i++) {
			inputNumberArray[i] = scanner.nextInt();
		}
		
		compareNumber = scanner.nextInt();
		
		for(int i = 0;i < numberN; i++) {
			if(inputNumberArray[i] == compareNumber) {
				count++;
			}
		}
		
		System.out.println(count);
		scanner.close();
		return;
	}
}
*/
// BojNo.10818
/*
 * 1. 버블정렬(비효율적)
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		int numberN = scanner.nextInt();
		int array[] = new int[numberN];
		int buffer = 0;
		for(int i = 0; i < numberN; i++) {
			array[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < numberN; i++) {
			for(int j = 0; j < numberN; j++) {
				if(array[i]<=array[j]) {
					buffer = array[i];
					array[i] = array[j];
					array[j] = buffer;
				}
			}
		}
		
		System.out.print(array[0]);
		System.out.print(" ");
		System.out.print(array[numberN-1]);
		
		scanner.close();
		return;
		
	}
}
*/
/* 2.Arrays.sort 사용(효율적)
import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		int numberN = scanner.nextInt();
		int array[] = new int[numberN];
		int buffer = 0;
		for(int i = 0; i < numberN; i++) {
			array[i] = scanner.nextInt();
		}
		
		Arrays.sort(array);
		System.out.print(array[0]);
		System.out.print(" ");
		System.out.print(array[numberN-1]);
		
		
	}
}
*/ // 단순 최댓값 최솟값 비교는 반복문 안써도 됨
/*
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		int numberN = scanner.nextInt();
		int max = scanner.nextInt();
		int min = max;
		
		for(int i = 0; i < numberN-1; i++) {
			int num = scanner.nextInt();
			if(num < min) {
				min = num;
			}else if(num > max) {
				max = num;
			}
		}
		System.out.println(min + " " + max);
		scanner.close();
		return;
	}
}
*/
// BojNo. 2562
/*
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int array[] = new int[9];
		int max = 0;
		int maxIndex = 0;
		for(int i = 0; i < 9; i++) {
			array[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < 9; i++) {
			if(max <= array[i]) {
				max = array[i];
				maxIndex = i;
			}
		}
		System.out.println(max);
		System.out.println(maxIndex+1);
	}
}
*/
// BojNo.1546
/*
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		double max = 0;
		double scoreArray[] = new double[number]; // 자료형 주의
		double scoreSum = 0;
		
		for(int i = 0; i < number; i++) {
			scoreArray[i] = scanner.nextDouble();
			if(max <= scoreArray[i]) {
				 max = scoreArray[i];
			}
		}
		
		for(int i = 0; i < number; i++) {
			
			scoreSum = scoreSum + (scoreArray[i]/max*100);
		}
		
		System.out.println(scoreSum/number);
		
	}
}
*/
// Bojno.10811
/*
import java.util.Scanner;

public class Main {
	
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int tmp = 0;
		int array[] = new int[N];
		
		for(int k = 1; k < N+1; k++) {
			array[k-1] = k;
			}
		
		for(int k = 0; k < M; k++) {
			 int i = scanner.nextInt();
			 int j = scanner.nextInt();
			 for(;i<j+1;i++) {
				 tmp = array[i-1];
				 array[i-1] = array[j-1];
				 array[j-1] = tmp;
				 j--;
			 }
		}
		for(int k = 0; k < N; k++) {
			System.out.print(array[k]);
			System.out.print(" ");
		}
		scanner.close();
		return;
	}
}
*/
// BojNo.3052
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int array[] = new int[10];
        int countB = 0;
        
        for(int i = 0; i < array.length; i++) {
            int inputNumber = scanner.nextInt();
            array[i] = inputNumber % 42;
            
            // 이전에 같은 값이 있었는지 체크
            boolean isDuplicate = false;
            for(int j = 0; j < i; j++) {
                if(array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            
            // 처음 나타나는 값이면 카운트
            if(!isDuplicate) {
                countB++;
            }
        }
        
        System.out.print(countB);
    }
}
*/




























