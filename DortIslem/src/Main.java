
public class Main {

	public static void main(String[] args) {
		
		Cikarma cikarma = new Cikarma();
		
		cikarma.cikarma(3, 5);
		
		Toplama toplama = new Toplama();
		
		toplama.toplama(2, 5);
		
		Carpma carpma = new Carpma();
		
		carpma.carpma(2, 3);
		
		Bolme bolme = new Bolme();
		
		bolme.bolme(3, 5);
		
		toplama.toplama(3, 5, 6, 7);
		System.out.println("Sonuç = "+ toplama.toplama(3, 5, 6, 7));
		

	}

}
