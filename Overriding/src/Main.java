
public class Main {

	public static void main(String[] args) {
		
		/*BaseKrediManager baseKrediManager = new BaseKrediManager();
		
		System.out.println(baseKrediManager.hesabla(1000));*/
		
		BaseKrediManager[] kredi = new BaseKrediManager[]{new TarimKrediManager(), new OgrenciKrediManager(), new OgretmenKrediManager()};
		
		for (BaseKrediManager baseKrediManager : kredi) {
			
			System.out.println(baseKrediManager.hesabla(1000));
			
		}
		

	}

}
