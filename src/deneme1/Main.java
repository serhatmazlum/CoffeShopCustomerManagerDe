package deneme1;

import java.rmi.RemoteException;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) throws RemoteException {
		// TODO Auto-generated method stub

		BaseCutomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdater());
		customerManager.save(new Cutomer(1, "serhat mazlum", "çetin", "61615171288", 1993));
		
		}

}
