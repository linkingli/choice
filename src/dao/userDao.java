package dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import domain.user;
import utils.DataSourceUtils;

public class userDao  implements IUserDao{

	public userDao()
	{
		
	}

	
	@SuppressWarnings("unchecked")
	public List<user> getByNameDao(String string1, String string2) {
	
		QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from user where userName = ?  and	 userpassWd = ?";
		try {
			return (List<user>) qr.query(sql, new BeanListHandler<>(user.class),string1,string2);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}
	}

