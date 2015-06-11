package com.centling.core.iservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

import com.centling.common.pages.Pager;
import com.centling.core.pojo.HrmEmployee;
import com.centling.core.pojo.OaSmsInbox;
import com.centling.core.pojo.OaSmsSend;

public interface IMoblieSmsService {

	OaSmsSend saveSmsSend(ServletContext context,OaSmsSend oaSmsSend);

	int listOaSmsSendCount(OaSmsSend oaSmsSend);

	List<OaSmsSend> getAllOaSmsSend(OaSmsSend oaSmsSend, Pager pager);

	int listOaSmsInboxCount(OaSmsInbox oaSmsInbox);

	List<OaSmsInbox> getAllOaSmsInbox(OaSmsInbox oaSmsInbox, Pager pager);

	OaSmsSend getOaSmsSendByPK(long oaSmsSendId);

	void deleteOaSmsSendByPks(long[] oaSmsSendPKs);

	OaSmsInbox getOaSmsInboxByPK(long oaSmsInboxId);

	void deleteOaSmsInboxByPks(long[] oaSmsInboxPKs);

	OaSmsInbox saveOaSmsInbox(OaSmsInbox oaSmsInbox);
	
	public Map<String, Integer> getNoReadSmsCountGroupEmp();

	HrmEmployee getEmployeeByPk(String id);
	
	public int saveOaSmsInbox(ArrayList<OaSmsInbox> list);
}
