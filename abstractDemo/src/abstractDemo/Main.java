package abstractDemo;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager manager = new CustomerManager();
		manager.dataBaseManager = new SqlServerDatabaseManager();
		manager.getCustomers();
		

	}

}
