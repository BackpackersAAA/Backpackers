package com.Action;

import java.util.List;

import javax.annotation.Resource;

import com.Service.TravelNotesService;
import com.domain.TravelNotes;
import com.opensymphony.xwork2.ActionSupport;


public class TravelNotesAction extends ActionSupport{
	private TravelNotes travelNotes;
	private List<TravelNotes> tnList;
	@Resource
	private TravelNotesService tnService;
	public String Query() //��ѯ
	{
		tnList=tnService.Query();
		return "d";
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
	public TravelNotes getTravelNotes() {
		return travelNotes;
	}
	public void setTravelNotes(TravelNotes travelNotes) {
		this.travelNotes = travelNotes;
	}
	public TravelNotesService getTnService() {
		return tnService;
	}
	public List<TravelNotes> getTnList() {
		return tnList;
	}
	public void setTnList(List<TravelNotes> tnList) {
		this.tnList = tnList;
	}
	public void setTnService(TravelNotesService tnService) {
		this.tnService = tnService;
	}

	
}
