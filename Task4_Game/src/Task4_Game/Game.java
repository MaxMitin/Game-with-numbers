package Task4_Game;

import java.util.Scanner;

public class Game {public static void main(String[] arg) {
		
	
	int a = firstNumber();
	if (a != 0) {
		int b = 9;
		int c = thirdNumber(a);
		System.out.println("Итоговое трёхзначное число: " + a + b + c);
	}
	else {System.out.println("Вы ввели не то число!");}
	
}
	private static int firstNumber() {
			
		System.out.println("Введите первую цифру трехзначного числа (в диапазоне от нуля до девяти)!");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
						
		return number;
	} 	
	
	private static int thirdNumber(int a) {
		
		int b = 9; 
		int c = b-a;
		
		return c;
		
	}

}
