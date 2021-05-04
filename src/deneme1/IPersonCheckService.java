package deneme1;

import java.rmi.RemoteException;

public interface IPersonCheckService {

	boolean CheckIfRealPerson(Cutomer cutomer) throws NumberFormatException, RemoteException;
	
}
