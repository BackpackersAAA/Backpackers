package com.dao;

import com.domain.ScenicSpots;
import com.domain.ScenicSpotsComments;

public interface ScenicSpotsCommentsDao {
	public String QueryAll(ScenicSpots scenicSpots); //��ѯ
	public String Add(ScenicSpotsComments ssc); //����
	public String Delete(ScenicSpotsComments ssc); //ɾ
}
