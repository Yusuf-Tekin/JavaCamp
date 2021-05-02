package adapters;

import java.rmi.RemoteException;

import Abstracts.CustomerCheckServices;
import Entities.Customer;


public class MernisServiceAdapter implements CustomerCheckServices {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		// Kontrol Kodlarý
		return true;
	}
	

}
