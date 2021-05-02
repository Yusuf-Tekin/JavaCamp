package Concrete;

import Abstracts.CostumerManager;
import Abstracts.CustomerCheckServices;
import Entities.Customer;
public class NeroCustomerManager extends CostumerManager{

	
	private CustomerCheckServices customerCheckService;
	
	public NeroCustomerManager(CustomerCheckServices customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void Save(Customer customer) {

		if (customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		} else {
			System.out.println("Not a valid person");
		}

	}
	
}
