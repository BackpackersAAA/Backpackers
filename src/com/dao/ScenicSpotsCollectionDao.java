package com.dao;

import java.util.List;

import com.domain.ScenicSpotsCollection;
import com.domain.User;

public interface ScenicSpotsCollectionDao {
	public List<User> QueryAll(User user); //��ѯ
	public String Add(ScenicSpotsCollection ssc); //����
	public String Delete(ScenicSpotsCollection ssc); //ɾ
}
