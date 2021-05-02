package Concrete;

import Abstract.UserService;
import Entities.User;

	public  class UserManager implements UserService {
		public UserManager(ValidateManager validateManager) {
			
		}


		@Override
		public void add(User user) {
			System.out.println("Kayýt Successful! "+" Welcome!! "+user.getFirstName());
		}
		
		@Override
		public void update(User user) {
			System.out.println("Update Successful! "+" Your New Name : "+user.getFirstName());
		}
		
		@Override
		public void delete(User user) {
			System.out.println("Delete  Successful!"+" Good Bye : "+user.getFirstName());
		}
}
