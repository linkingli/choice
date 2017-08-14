package service;

import java.util.List;

import dao.roleDao;
import domain.function;

public class userFoundService implements IuserFoundService 
{
	private roleDao li=new roleDao();
	public List<function> getByRole(int id)
	{
		return li.getByRoleLI(id);
	};

}
