package Concrete;

import Abstracts.CustomerCheckServices;
import Entities.Customer;

public class CostumerCheckManager implements CustomerCheckServices{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return true;
	}

}
