package com.iseen.sysbase.common.pack;

import com.iseen.sysbase.core.pojo.IPhyPackageDetail;
import com.centling.common.pack.HqlPack;
import com.centling.common.util.UtilWork;

public class PhyPackageDetailPack{

    public static String packIPhyPackageDetailQuery(IPhyPackageDetail iPhyPackageDetail){
        StringBuffer result = new StringBuffer();
        HqlPack.getStringEqualPack("N", "dr", result);
        return result.toString();
    }
    
    public static String packIPhyPackageDetailItemsQuery(String packagePk){
        StringBuffer result = new StringBuffer();
        HqlPack.getStringEqualPack(packagePk, "phyPackageId", result);
        HqlPack.getStringEqualPack("N", "dr", result);
        return result.toString();
    }

}