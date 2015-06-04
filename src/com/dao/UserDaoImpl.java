package com.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;

import com.domain.User;

public class UserDaoImpl implements UserDao{
   @Resource
   private SessionFactory sessionFactory;
	public User Query(User user) //��ѯ
	{
		// TODO Auto-generated method stub
        Query query=sessionFactory.openSession().createQuery("from [User] user where user.UserName=?");
        query.setString(0,user.getUserName());
		return  (User) query.list().get(0);
	}

	public boolean Add(User user) //����
	{
		// TODO Auto-generated method stub
        user.setUserName("1234568");
        user.setTelephone("111");
        user.setJurisdiction(1);
        Session session=sessionFactory.openSession();
		Serializable serializable=session.save(user);
		session.flush();
		System.out.println(serializable.toString()+"YES");
		return true;
	}

	public boolean Change(User user) //�޸�
	{
		// TODO Auto-generated method stub

		sessionFactory.openSession().update(user);
		return false;
	}

	public List<User> QueryAll() //��ѯ����
	{
		 Query query=sessionFactory.openSession().createQuery("from [User]");
		return query.list();
	}

	public boolean Delete(User user) //ɾ��
	{
		// TODO Auto-generated method stub
		sessionFactory.openSession().delete(user);
		return false;
	}

}
