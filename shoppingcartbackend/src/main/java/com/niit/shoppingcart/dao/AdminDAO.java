package com.niit.shoppingcart.dao;

import java.util.List;

import com.niit.shoppingcart.model.Admin;

public interface AdminDAO {



	public List<Admin> list();

	public Admin get(String id);
	
	public void saveOrUpdate(Admin admin);

	public void delete(String id);



}
