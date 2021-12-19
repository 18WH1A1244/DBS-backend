package com.ts.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.mindrot.jbcrypt.BCrypt;

import com.rest.dto.Admin;
import com.ts.db.HibernateTemplate;

public class AdminDAO {

	private SessionFactory factory = null;


	public int register(String admin) {
		System.out.println("Inside Admin registration");
		return HibernateTemplate.addObject(admin);
	}


	public Admin getAdmin(int id) {
		return (Admin)HibernateTemplate.getObject(Admin.class, id);
	}

}