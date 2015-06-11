package com.iseen.sysbase.web.controller.dwr;

import com.iseen.sysbase.core.pojo.ISysCompay;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import com.centling.common.module.ResultBean;
import com.centling.common.pages.Pager;
import com.centling.common.pages.PagerHelper;
import com.centling.common.util.UtilTool;
import com.centling.common.util.UtilPrimaryKey;
import com.centling.common.util.WebUtilWork;
import com.iseen.sysbase.core.iservice.IsyscompanyService;

/**********************************************
 * Class name:
 * Description:
 * Others:
 * History:
 **********************************************/
@Controller
public class DwrsyscompanyService {

    private final static Logger logger = LoggerFactory.getLogger(DwrsyscompanyService.class);

    @Resource
    private IsyscompanyService syscompanyService;

    /**
     * 查询 ISysCompay 分页列表
     * @param context
     * @param request
     * @param iSysCompay
     * @param pager
     */
    public ResultBean listISysCompay(ServletContext context, HttpServletRequest request, ISysCompay iSysCompay, Pager pager){
        List<ISysCompay> list = null;
        pager = PagerHelper.getPager(pager,syscompanyService.listISysCompayCount(iSysCompay));
        list = syscompanyService.listISysCompay(iSysCompay, pager);
        logger.info("查询 ISysCompay 分页列表...");
        return WebUtilWork.WebResultPack(list, pager);
    }

    /**
     * 查询所有 ISysCompay 列表
     * @param context
     * @param request
     * @param iSysCompay
     * @param pager
     */
    public ResultBean listISysCompayAll(ServletContext context, HttpServletRequest request){
        ISysCompay iSysCompay = new ISysCompay();
        List<ISysCompay> list = syscompanyService.listISysCompay(iSysCompay);
        logger.info("查询所有 ISysCompay 列表...");
        return WebUtilWork.WebResultPack(list);
    }

    /**
     * 保存 ISysCompay
     * @param context
     * @param request
     * @param iSysCompay
     */
    public ResultBean saveISysCompay(ServletContext context, HttpServletRequest request, ISysCompay iSysCompay){
        String empid = UtilTool.getEmployeeId(request);
        iSysCompay.initSave(empid);
        iSysCompay.setPrimaryKey(UtilPrimaryKey.getPrimaryKey());
        syscompanyService.saveISysCompay(iSysCompay);
        logger.info("保存 ISysCompay...");
        return WebUtilWork.WebResultPack(null);
    }

    /**
     * 更新 ISysCompay
     * @param context
     * @param request
     * @param iSysCompay
     */
    public ResultBean updateISysCompay(ServletContext context, HttpServletRequest request, ISysCompay iSysCompay){
        ISysCompay tmp = syscompanyService.getISysCompayByPk(iSysCompay.getPrimaryKey());
        String empid = UtilTool.getEmployeeId(request);
        iSysCompay.initUpdate(empid);
        syscompanyService.saveISysCompay(iSysCompay);
        logger.info("更新 ISysCompay...");
        return WebUtilWork.WebResultPack(null);
    }

    /**
     * 根据ID获得 ISysCompay
     * @param context
     * @param request
     * @param pk
     */
    public ResultBean getISysCompayByPk(ServletContext context, HttpServletRequest request, String pk){
        ISysCompay iSysCompay = syscompanyService.getISysCompayByPk(pk);
        logger.info("根据ID获得 ISysCompay...{}", iSysCompay.getPrimaryKey());
        return WebUtilWork.WebObjectPack(iSysCompay);
    }

    /**
     * 删除 ISysCompay
     * @param context
     * @param request
     * @param pks
     */
    public ResultBean deleteISysCompayByPks(ServletContext context, HttpServletRequest request, String[] pks){
        syscompanyService.deleteISysCompayByPks(pks);
        for (String pk : pks) {
            logger.info("删除 ISysCompay...{}", pk);
        }
        return WebUtilWork.WebResultPack(null);
    }

/**********************************************
 * 以上代码由CTOA代码生成工具自动生成，请根据具体需求进行修改。
 * 开发人员在此注释以下编写业务逻辑代码，并将自己写的代码框起来，便于后期代码合并，例如：
 **********************************************/

/**********************JC-begin**********************/
    public void method(){
        System.out.println("JC's code here");
    }
/**********************JC-end**********************/

/**********************Jacy-begin**********************/
    public void method2(){
        System.out.println("Jacy's code here");
    }
/**********************Jacy-end**********************/

}