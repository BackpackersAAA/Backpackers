package com.dao;

import java.util.List;

import com.domain.TravelNotes;


public interface TravelNotesDao {

	public List<TravelNotes> QueryAll(); //��ѯ
	public String Add(TravelNotes scenicSpots); //����
	public Boolean Change(TravelNotes scenicSpots); //��
	public Boolean Delete(TravelNotes scenicSpots); //ɾ

}
