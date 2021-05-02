
public class NeroCustomerManager extends CustomerManager {
	
	
	private MernisConfirmation customerCheckService;
	
	public NeroCustomerManager(MernisConfirmation mernisConfirmation) {
		super();
		this.customerCheckService = mernisConfirmation;
		
	}
	
	
	@Override
	public void Save(Customer customer) {
		System.out.println("Saved to db : " + customer.getFirstName() + customer.getLastName());
	}
	
	

}
