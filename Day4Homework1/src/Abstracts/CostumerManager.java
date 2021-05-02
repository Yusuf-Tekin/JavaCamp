package Abstracts;
import Entities.Customer;
public abstract class CostumerManager implements CustomerService{
	@Override
    public void Save(Customer customer) {
        System.out.println("Saved to db : " + customer.getName());
    }
}
