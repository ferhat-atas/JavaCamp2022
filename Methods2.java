
public class Main {

	public static void main(String[] args) {

		int result = total2(2, 3);
		add();
		delete();
		update();
		total();
		giveCity();

		System.out.println(total());
		System.out.println(giveCity());
		System.out.println(result);
		System.out.println(total3(2, 7, 8, 9));

	}

	public static void add() {

		System.out.println("Added.");
	}

	public static void delete() {

		System.out.println("Deleted.");
	}

	public static void update() {

		System.out.println("Updated.");

	}

	public static int total() {

		return 5;

	}

	public static String giveCity() {

		return "İstanbul";

	}

	public static int total2(int number, int number2) {

		return number + number2;
	}

	public static int total3(int... numbers) {

		int number = 0;

		for (int i : numbers) {

			number += i;
		}

		return number;
	}

}
