import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerManager customerManager = new StarbucksCustomerManager(new MernisConfirmation());
		customerManager.Save(new Customer(1,"Yusuf","Tekin", new Date(2003,9,10), "G�venlik Sebebi �le Yaz�lmad�"));
	
		CustomerManager customerManager2 = new NeroCustomerManager(new MernisConfirmation());
		customerManager2.Save(new Customer(2,"Engin", "Demiro�", new Date(1985,1,6), "123456789"));
	}

}
