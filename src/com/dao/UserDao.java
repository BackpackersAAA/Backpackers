package com.dao;

import java.util.List;

import com.domain.User;

public interface UserDao {
	public User Query(User user);//��ѯ����
	public boolean Add(User user);//����
	public boolean Change(User user);//�޸�
	public List<User> QueryAll();//��ѯ����
	public boolean Delete(User user);//ɾ��
}
