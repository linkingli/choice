package dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import domain.function;
import domain.user;
import utils.DataSourceUtils;

public class roleDao  implements IRoleDao{


	public List<function> getByRoleLI(int id) {
		

		
		QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select f1.* from function f1,(select functionId from linking where roleId = ?) f2 where f2.functionId = f1.id";
		try {
			return  qr.query(sql, new BeanListHandler<>(function.class), id);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	
	}

}
