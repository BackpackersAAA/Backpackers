package com.Service;

import java.util.List;

import javax.annotation.Resource;

import com.dao.UserDao;
import com.domain.User;

public class UserServiceImpl implements UserService{
	@Resource
	private UserDao userDao;
	public int  login(User user)//��½
	{
		User user1=userDao.Query(user);
		if(user1==null)//��ѯ���Ϊ��
		{
			return 1;
		}
		else if(user.getPassword().equals(user1.getPassword()))//��ѯ�����ж�
		{ 
			if(user1.getJurisdiction()==1) //Ȩ���ж�
			{
			   return 2; 
			}
			return 3; 
		}
		return 1;
	}
	public boolean Registered(User user)//ע��
	{
		return userDao.Add(user);
	}
	public boolean Change(User user)//�޸�
	{
		userDao.Change(user);
		return false;
	}
	public List<User> Query()//��ѯ
	{
		return userDao.QueryAll();
	}
	public boolean Delete(User user)//ɾ��
	{

		userDao.Delete(user);
		return false;
	}


}
