package com.Service;

import java.util.List;

import javax.annotation.Resource;

import com.dao.ScenicSpotsCollectionDao;
import com.domain.ScenicSpotsCollection;
import com.domain.User;


public class ScenicSpotsCollectionServiceImpl implements ScenicSpotsCollectionService{
	@Resource
	private ScenicSpotsCollectionDao ssCollectionDao;
	public List<User> Query(User user) //��ѯ
	{
		return ssCollectionDao.QueryAll(user);
	}
	public String Add(ScenicSpotsCollection ssCollection) //����
	{
		return "d";
	} 

	public String Delete(ScenicSpotsCollection ssCollection) //ɾ
	{
		return "d";
	}
}
