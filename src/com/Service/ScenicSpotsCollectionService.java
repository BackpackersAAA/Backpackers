package com.Service;

import java.util.List;

import com.domain.ScenicSpotsCollection;
import com.domain.User;

public interface ScenicSpotsCollectionService {
	public List<User> Query(User user); //��ѯ
	public String Add(ScenicSpotsCollection ssCollection); //����
	public String Delete(ScenicSpotsCollection ssCollection); //ɾ
}
