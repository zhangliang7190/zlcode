package com.centling.common.util.file.office;

import java.io.FileOutputStream;
import java.util.List;
import javax.annotation.Resource;
import jxl.Workbook;
import jxl.format.Alignment;
import jxl.format.Colour;
import jxl.format.UnderlineStyle;
import jxl.format.VerticalAlignment;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import com.centling.common.util.ConstWords;
import com.centling.core.pojo.HrmEmployee;
import com.centling.web.springmvc.RealPathResolver;

public class ExcelExport {
	
	//定义导出EXCEL文件的名称，使用英文名称，中文名称不兼容
	public static final String EMPLOYEE_FILE_NAME = "renyuan.xls";//人员excel名称 

	/**
	 * 导出人员信息
	 * @param path
	 * @param list
	 * @throws Exception
	 */
	public String exportEmployeeExcel(List<HrmEmployee> list) throws Exception {
        WritableWorkbook wwb;
        FileOutputStream fos;
        String fileName = getDownloadFilePath() + EMPLOYEE_FILE_NAME;
        fos = new FileOutputStream(fileName);
        wwb = Workbook.createWorkbook(fos);
        WritableSheet ws = wwb.createSheet("导出的人员信息", 10);//创建一个工作表

        //设置单元格的文字格式
        WritableFont wf = new WritableFont(WritableFont.ARIAL,12,WritableFont.BOLD,false,
                UnderlineStyle.NO_UNDERLINE,Colour.BLUE);
        WritableCellFormat wcf = new WritableCellFormat(wf);
        wcf.setVerticalAlignment(VerticalAlignment.CENTRE); 
        wcf.setAlignment(Alignment.CENTRE); 
        ws.setRowView(1, 500);
        
        ws.addCell(new Label(0, 0, "姓名", wcf));
        ws.addCell(new Label(1, 0, "出生年月", wcf));
        
        //填充数据的内容
        for (int i = 0; i < list.size(); i++){
        	wcf = new WritableCellFormat();
        	HrmEmployee e = (HrmEmployee)list.get(i);
            ws.addCell(new Label(0, i + 1, e.getHrmEmployeeName(), wcf));
            ws.addCell(new Label(1, i + 1, e.getHrmEmployeeBirthday(), wcf));
        }

        wwb.write();
        wwb.close();
        return fileName;
	}
	
	
	
	
	@Resource
	private RealPathResolver realPathResolver;
	
	
	public String getDownloadFilePath() {
		return realPathResolver.get("") + ConstWords.DOWNLOADFILE_PATH;
	}
}
