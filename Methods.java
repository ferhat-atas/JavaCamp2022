package methods;

public class Main {

	public static void main(String[] args) {
		
		findNumber();

	}
	
	public static void findNumber() {
		
		int[] numbers = {1,2,3,4,5,6,7,8,9,0};
		int searchNumber = 5;
		boolean save = false;
		
		for (int i : numbers) {
			
			if (numbers[i] == searchNumber) {
				
				save = true;
				
				break;
				
			}
		
		}
		
		if (save == true) {
			
			messege("Aranan sayı bulundu :"+ searchNumber);
			
		} else {
			
			messege(searchNumber +" sayısı bulunamadı.");
			
		}
		
		
	}
	
	public static void messege(String messege) {
		
		System.out.println(messege);
	}

}
