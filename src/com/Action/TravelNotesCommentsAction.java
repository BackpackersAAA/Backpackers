package com.Action;

import javax.annotation.Resource;

import com.Service.TravelNotesCommentsService;
import com.domain.TravelNotesComments;
import com.opensymphony.xwork2.ActionSupport;


public class TravelNotesCommentsAction extends ActionSupport{
	private TravelNotesComments tnc;
	private TravelNotesComments[] tncList;
	@Resource
	private TravelNotesCommentsService tncService;
	public String Query() //��ѯ
	{
		
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
	public TravelNotesComments getTnc() {
		return tnc;
	}
	public void setTnc(TravelNotesComments tnc) {
		this.tnc = tnc;
	}
	public TravelNotesComments[] getTncList() {
		return tncList;
	}
	public void setTncList(TravelNotesComments[] tncList) {
		this.tncList = tncList;
	}
	public TravelNotesCommentsService getTncService() {
		return tncService;
	}
	public void setTncService(TravelNotesCommentsService tncService) {
		this.tncService = tncService;
	}
}
