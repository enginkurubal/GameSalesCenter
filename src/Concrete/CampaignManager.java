package Concrete;


import Abstract.CampaignService;
import Entities.Campaign;
import Entities.Games;

public class CampaignManager implements CampaignService {
	
	@Override
	public void add(Campaign campaign, Games games) {
		System.out.println("Campaign is done : "+campaign.getCampaignName()+" to "+ games.getGameName());
	}
	
	@Override
	public void update(Campaign campaign, Games games) {
		System.out.println("Campaign is done : "+campaign.getCampaignName()+" to "+ games.getGameName());
	}
	
	@Override
	public void delete(Campaign campaign, Games games) {
		System.out.println("Campaign is done : "+campaign.getCampaignName()+" to "+ games.getGameName());
	}

		
}
