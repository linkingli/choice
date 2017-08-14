package service;

import java.util.List;

import dao.userDao;
import domain.user;

public class userService implements IUserService {
	private userDao li=new userDao();
	
	public user getByName(String string1, String string2) {
		List<user> lii=li.getByNameDao(string1,  string2);
		if(lii.isEmpty())
		{
			return null;
		}
		else
		{
			return lii.get(0);
		}
		
	}

}