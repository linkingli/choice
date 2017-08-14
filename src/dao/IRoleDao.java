package dao;

import java.util.List;

import domain.function;

public interface IRoleDao {
	public List<function> getByRoleLI(int id);
}
