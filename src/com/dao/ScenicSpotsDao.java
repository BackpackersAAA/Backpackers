package com.dao;

import com.domain.ScenicSpots;

public interface ScenicSpotsDao {
	public String QueryAll(); //��ѯ
	public String Add(ScenicSpots scenicSpots); //����
	public Boolean Change(ScenicSpots scenicSpots); //��
	public Boolean Delete(ScenicSpots scenicSpots); //ɾ
}
