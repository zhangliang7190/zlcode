package com.centling.core.iservice;

import java.util.List;
import com.centling.common.pages.Pager;
import com.centling.core.pojo.OaAdversaria;
import com.centling.core.pojo.OaAnnouncement;
import com.centling.core.pojo.OaNotice;
import com.centling.core.pojo.SysLibraryInfo;


public interface IOaNewsService {
	
	public List<OaAnnouncement> getAllAnnouncement(OaAnnouncement announcement,long l,Pager pager);
	
	public int listAnnouncementCount(OaAnnouncement announcement,long l);
	
	public void deleteAnnouncementByPk(long[] ids);
	
	public OaAnnouncement getAnnouncementByPK(long id);
	
	public OaAnnouncement saveAnnouncement(OaAnnouncement announcement);
	
	public List<OaNotice> getAllNotice(OaNotice notice,long l,Pager pager);
	
	public int listNoticeCount(OaNotice notice,long l);
	
	public OaNotice getNoticeByPK(long id);
	
	public void deleteNoticeByPk(long[] ids);
	
	public OaNotice  saveNotice(OaNotice notice);
	
	public List<OaAdversaria>  getAllAdversaria(OaAdversaria adversaria,long l,Pager pager);
	
	public int listAdversariaCount(OaAdversaria adversaria,long l);
	
	public OaAdversaria getAdversariaByPK(long id);
	
	public void deleteAdversariaByPk(long[] ids);
	
	public OaAdversaria saveAdversaria(OaAdversaria adversaria);
	
	public SysLibraryInfo getLibraryInfoByPK(long id);

}
