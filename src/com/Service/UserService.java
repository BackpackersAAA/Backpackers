package com.Service;

import java.util.List;

import com.domain.User;

public interface UserService {
	public int login(User user);//��½
	public boolean Registered(User user);//ע��
	public boolean Change(User user);//�޸�
	public List<User> Query();//��ѯ
	public boolean Delete(User user);//ɾ��
}
