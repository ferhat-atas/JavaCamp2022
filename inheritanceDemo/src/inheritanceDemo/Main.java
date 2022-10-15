package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		
		//OgretmenKrediManager ogretmenkredimanager = new OgretmenKrediManager();
		
		//ogretmenkredimanager.krediHesapla();
		
		KrediUI krediui = new KrediUI();
		
		krediui.KrediHesapla(new TarimKrediManager());
		
		krediui.KrediHesapla(new OgretmenKrediManager());
		
		
		
		
		
		
	}

}
