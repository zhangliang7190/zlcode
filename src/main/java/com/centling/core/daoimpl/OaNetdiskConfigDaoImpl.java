package com.centling.core.daoimpl;

import org.springframework.stereotype.Repository;

import com.centling.core.pojo.*;
import com.centling.core.dao.*;
/**
 * 表：OA_NETDISK_CONFIG 对应daoImpl
 */
@Repository
public class OaNetdiskConfigDaoImpl extends BaseHapiDaoimpl<OaNetdiskConfig, Long> implements IOaNetdiskConfigDao {

   public OaNetdiskConfigDaoImpl(){
      super(OaNetdiskConfig.class);
   }
}