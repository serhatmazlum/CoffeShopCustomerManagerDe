package deneme1;

import java.rmi.RemoteException;


import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdater implements IPersonCheckService{

	@Override
	public boolean CheckIfRealPerson(Cutomer cutomer) throws NumberFormatException, RemoteException {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		

			boolean result =  client.TCKimlikNoDogrula(Long.parseLong(cutomer.getIdendityNumber()), cutomer.getName().toUpperCase(),
								cutomer.getLastName().toUpperCase(), cutomer.getDateOfBirth());
		System.out.println(result);
		return result;
		
	
	}

}
