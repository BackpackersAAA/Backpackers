package com.Service;

import java.util.List;

import com.domain.TravelNotes;

public interface TravelNotesService {
	public List<TravelNotes> Query(); //��ѯ
	public String Add(); //����
	public String Change(); //��
	public String Delete(); //ɾ
}
