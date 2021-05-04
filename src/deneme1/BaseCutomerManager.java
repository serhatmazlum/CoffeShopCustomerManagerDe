package deneme1;

import java.rmi.RemoteException;

public class BaseCutomerManager implements ICustomer{



	@Override
	public void save(Cutomer customer) throws RemoteException {
		System.out.println("Saved to DB: " + customer.getName());
		
	}


}
