package gameSalesCenter;

import java.util.Date;

import Abstract.CampaignService;
import Abstract.GameService;
import Abstract.SaleService;
import Abstract.UserService;
import Abstract.Validate;
import Concrete.CampaignManager;
import Concrete.GamesManager;
import Concrete.SaleManager;
import Concrete.UserManager;
import Concrete.ValidateManager;
import Entities.Campaign;
import Entities.Games;
import Entities.User;

public class Main {

	public static void main(String[] args) {
		
		User engin = new User(1,"Engin Can","Kurubal","12345678910",150,new Date(5,4,1998));
		Games forza = new Games(1,"Forza Horizon",160);
		Campaign snow = new Campaign(1, 0.1, "Snow Discounts");
		
		UserService userService = new UserManager(null);
		userService.add(engin);
		
		GameService gameService = new GamesManager();
		gameService.add(forza);
		
		CampaignService campaignService = new CampaignManager();
		campaignService.add(snow, forza);
		
		SaleService saleService = new SaleManager();
		saleService.Sale(engin,forza);
		
		
		Validate validate = new ValidateManager();
		validate.Validation(engin);
		
	}
		
	
	
		
	
		
	
}
