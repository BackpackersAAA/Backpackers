package com.Service;

import java.util.List;

import javax.annotation.Resource;

import com.dao.TravelNotesDao;
import com.domain.TravelNotes;


public class TravelNotesServiceImpl implements TravelNotesService{
	@Resource
	private TravelNotesDao tnDao;
	public List<TravelNotes> Query() //��ѯ
	{

		return  tnDao.QueryAll();
	}
	public String Add() //����
	{
		return "d";
	}
	public String Change() //��
	{
		return "d";
	}
	public String Delete() //ɾ
	{
		return "d";
	}
}
