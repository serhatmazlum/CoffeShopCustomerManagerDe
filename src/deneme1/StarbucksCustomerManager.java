package deneme1;

import java.rmi.RemoteException;

public class StarbucksCustomerManager extends BaseCutomerManager {
	


	private IPersonCheckService personCheckService;

	public StarbucksCustomerManager(IPersonCheckService personCheckService) {
	
		this.personCheckService = personCheckService;
	}

	@Override
	public void save(Cutomer customer) throws RemoteException {
		
		if(personCheckService.CheckIfRealPerson(customer)) {
			
			
			super.save(customer);	
			
			
		}
		else {
			//throw new Exception("ot a valid");
			System.out.println("Person is not valid: "+customer.getName());
		}
	}

}
