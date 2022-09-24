package sayıBulma;

public class Main {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5,6,7,8,9,0};
		int searchNumber = 12;
		int save = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			
			if (numbers[i] == searchNumber) {
				
				save = 1;
				
				
				
			}
		
		}
		
		if (save == 1) {
			
			System.out.println("Aranan sayı bulundu.");
		} else {
			
			System.out.println("Aranan sayı dizinde mevcut değil.");
		}
		
		

	}

}
