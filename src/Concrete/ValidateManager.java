package Concrete;

import java.rmi.RemoteException;

import Abstract.Validate;
import Entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class ValidateManager implements Validate {

@Override
	
	public boolean Validation(User user) {
		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
		boolean result = false;
		  try {
			  result = soapClient.TCKimlikNoDogrula(Long.parseLong(user.getNationalityIdentityNumber()),user.getFirstName(),user.getLastName(),user.getDateofBirth());
		  } catch (NumberFormatException e) {
			   e.printStackTrace();
		  } catch (RemoteException e) {
		       e.printStackTrace();
		  }
		 return result;
	}
}
