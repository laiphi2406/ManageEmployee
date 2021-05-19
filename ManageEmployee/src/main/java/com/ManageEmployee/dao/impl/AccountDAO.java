package com.ManageEmployee.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ManageEmployee.dao.IAccountDAO;
import com.ManageEmployee.mapper.AccountMapper;
import com.ManageEmployee.model.AccountModel;

@Repository
public class AccountDAO extends AbstractDAO<AccountModel> implements IAccountDAO {
	
	/*
	 * @Override public List<NewModel> findByCategoryId(Long categoryId) { String
	 * sql = "SELECT * FROM news WHERE categoryid = ?"; return query(sql, new
	 * NewMapper(), categoryId); }
	 * 
	 * @Override public Long save(NewModel newModel) { StringBuilder sql = new
	 * StringBuilder("INSERT INTO news (title, content,"); sql.
	 * append(" thumbnail, shortdescription, categoryid, createddate, createdby)");
	 * sql.append(" VALUES(?, ?, ?, ?, ?, ?, ?)"); return insert(sql.toString(),
	 * newModel.getTitle(), newModel.getContent(), newModel.getThumbnail(),
	 * newModel.getShortDescription(), newModel.getCategoryId(),
	 * newModel.getCreatedDate(), newModel.getCreatedBy()); }
	 * 
	 * @Override public NewModel findOne(Long id) { String sql =
	 * "SELECT * FROM news WHERE id = ?"; List<NewModel> news = query(sql, new
	 * NewMapper(), id); return news.isEmpty() ? null : news.get(0); }
	 * 
	 * @Override public void update(NewModel updateNew) { StringBuilder sql = new
	 * StringBuilder("UPDATE news SET title = ?, thumbnail = ?,");
	 * sql.append(" shortdescription = ?, content = ?, categoryid = ?,"); sql.
	 * append(" createddate = ?, createdby = ?, modifieddate = ?, modifiedby = ? WHERE id = ?"
	 * ); update(sql.toString(), updateNew.getTitle(), updateNew.getThumbnail(),
	 * updateNew.getShortDescription(), updateNew.getContent(),
	 * updateNew.getCategoryId(), updateNew.getCreatedDate(),
	 * updateNew.getCreatedBy(), updateNew.getModifiedDate(),
	 * updateNew.getModifiedBy(), updateNew.getId()); }
	 * 
	 * @Override public void delete(long id) { String sql =
	 * "DELETE FROM news WHERE id = ?"; update(sql, id); }
	 */
	@Override
	public List<AccountModel> getAccount() {
		StringBuilder sql = new StringBuilder("SELECT * FROM public.\"Account\"");

		return query(sql.toString(), new AccountMapper());
	}
	
	@Override
	public List<AccountModel> findByUsername(String userName) {
		StringBuilder sql = new StringBuilder("SELECT * FROM public.\"Account\" WHERE \"UserName\" = "+userName+"");

		return query(sql.toString(), new AccountMapper());
	}

	
	/*
	 * @Override public int getTotalItem() { String sql =
	 * "SELECT count(*) FROM news"; return count(sql); }
	 */
}
