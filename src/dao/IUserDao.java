package dao;

import java.util.List;

import domain.user;

public interface IUserDao  {

	public List<user> getByNameDao(String string1, String string2) ;
	
}
