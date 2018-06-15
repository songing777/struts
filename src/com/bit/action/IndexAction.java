package com.bit.action;

import com.opensymphony.xwork2.Action;

public class IndexAction implements Action{
	private String msg="IndexAction을 통한 결과";
	
	public String getMsg() {
		return msg;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return this.SUCCESS;
	}
}
