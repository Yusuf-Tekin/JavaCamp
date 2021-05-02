package Concrete;
import Abstracts.CustomerCheckServices;
import Entities.Customer;
import Abstracts.CostumerManager;
public class StarbucksCustomerManager extends CostumerManager{
	private  CustomerCheckServices customerCheckService;

    public StarbucksCustomerManager(CustomerCheckServices customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void Save(Customer customer) {

        if (customerCheckService.CheckIfRealPerson(customer)) {
            super.Save(customer);
        }else {
            System.out.println("Not a valid person");
        }

    }
}
