package com.dao;

import com.domain.TravelNotes;
import com.domain.TravelNotesComments;


public interface TravelNotesCommentsDao {
	public String QueryAll(TravelNotes travelNotes); //��ѯ
	public String Add(TravelNotesComments tnc); //����
	public String Delete(TravelNotesComments tnc); //ɾ
}
