package Concrete;

import Abstract.GameService;
import Entities.Games;

public class GamesManager implements GameService{
		
		@Override
		public void add(Games games) {
			System.out.println("Game added your library : " + games.getGameName());
		}

		@Override
		public void givingBack(Games games) {
			System.out.println("Game Giving Back Successful" + games.getGameName());
			
		}
		
}
