package numberguessing;

import java.util.Random;
import java.util.Scanner;

public class numberguess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnum= new Random();
		int number=rnum.nextInt(100);
		Scanner sc=new Scanner(System.in);
		int guess=0;
		int attempt=0;
		int maxAtmt=7;
		while(guess!=number&&attempt<maxAtmt) {
		System.out.println("Guess Number between(1-100)");
		guess=sc.nextInt();
		attempt++;
		
		if(guess==number) {
			System.out.println("Guesses the correct number" +number);
		}
		else if(guess>number) {
			System.out.println("Guessed a high number");
		}
		else {
			System.out.println("Guessed a low number");
		}
		}
		
		if(guess!=number) {
		System.out.println("Guessing locked!");
		System.out.println("The Actual Number is" +number);
		}
		sc.close();
	}
}
