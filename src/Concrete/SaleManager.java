package Concrete;

import Abstract.SaleService;
import Entities.Games;
import Entities.User;

public class SaleManager implements SaleService {
	
	public void Sale(User user,Games games) {
		if(user.getUserMoney()>=games.getGamePrice()) {
			System.out.println("Purchase Successful : " + games.getGameName());
		}else {
			System.out.println("Purschase Failed : Insufficient Balance !");
		}
			
	}
}
