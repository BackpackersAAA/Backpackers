package com.Action;

import javax.annotation.Resource;

import com.Service.ScenicSpotsCommentsService;
import com.domain.ScenicSpotsComments;
import com.opensymphony.xwork2.ActionSupport;


public class ScenicSpotsCommentsAction extends ActionSupport{
	private ScenicSpotsComments ssComments;
	private ScenicSpotsComments[] ssCommentsList;
	@Resource
	private ScenicSpotsCommentsService ssCommentsService;
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
	public ScenicSpotsComments getSsComments() {
		return ssComments;
	}
	public void setSsComments(ScenicSpotsComments ssComments) {
		this.ssComments = ssComments;
	}
	public ScenicSpotsComments[] getSsCommentsList() {
		return ssCommentsList;
	}
	public void setSsCommentsList(ScenicSpotsComments[] ssCommentsList) {
		this.ssCommentsList = ssCommentsList;
	}
	public ScenicSpotsCommentsService getSsCommentsService() {
		return ssCommentsService;
	}
	public void setSsCommentsService(ScenicSpotsCommentsService ssCommentsService) {
		this.ssCommentsService = ssCommentsService;
	}

}
