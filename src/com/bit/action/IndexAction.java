package com.bit.action;

import com.opensymphony.xwork2.Action;

public class IndexAction implements Action{
	private String msg="IndexAction�� ���� ���";
	
	public String getMsg() {
		return msg;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return this.SUCCESS;
	}
}
