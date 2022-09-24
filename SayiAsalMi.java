
public class Main {

	public static void main(String[] args) {

		int number = 23;
		int hold = 0;
		int save = number;
		
		//Test deneme

		for (int i = 2; i < number; i++) {

			number = number % i;

			if (number == 0) {

				hold++;
			}

		}
		if (save < 1) {

			System.out.println("GEÇERSİZ SAYI GİRİŞİ.");

		} else if (save == 1) {

			System.out.println("SAYI ASAL DEĞİLDİR.");

		} else if (hold == 0) {

			System.out.println("SAYI ASALDIR.");

		} else {
			System.out.println("SAYI ASAL DEĞİLDİR.");
		}

	}

}
