import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		int perfectNumber = 3;
		int save = 0;

		for (int i = 1; i < perfectNumber; i++) {

			if (perfectNumber % i == 0) {

				save = save + i;
			}

		}

		if (save == perfectNumber) {

			System.out.println("Sayı Mükemmel.");

		} else {
			System.out.println("Sayı Mükemmel Değil");
		}

	}

}
