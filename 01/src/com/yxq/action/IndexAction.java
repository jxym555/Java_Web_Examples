package com.yxq.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

import com.yxq.actionSuper.MySuperAction;
import com.yxq.dao.OpDB;

public class IndexAction extends MySuperAction {				

	public String execute() throws Exception {
		/* 查询所有收费信息，按发布时间降序排列 */
		
		request.setAttribute("payforlist","23123123");		

		session.put("typeMap","2222");
		
		return SUCCESS;
	}
}
