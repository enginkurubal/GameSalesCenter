package Abstract;

import Entities.Campaign;
import Entities.Games;


public interface CampaignService {
	void add(Campaign campaign,Games games);
	void update(Campaign campaign,Games games);
	void delete(Campaign campaign,Games games);

}
