package arkadasSayılar;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		int firstNumber = 220;
		int secondNumber = 284;
		int saveOne = 0;
		int saveTwo = 0;

		for (int i = 1; i < firstNumber; i++) {

			if (firstNumber % i == 0) {

				saveOne = saveOne + i;

			}

		}
		
		

		for (int i = 1; i < secondNumber; i++) {

			if (secondNumber % i == 0) {

				saveTwo = saveTwo + i;

			}

		}
		
		
		if (saveOne == secondNumber && saveTwo == firstNumber) {
			
			System.out.println("Sayılar arkadaş sayıdır.");
		}else {
			
			System.out.println("Sayılar arkadaş sayı değildir.");
		}

	}

}

