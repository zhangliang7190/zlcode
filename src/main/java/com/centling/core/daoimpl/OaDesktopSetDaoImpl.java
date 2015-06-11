package com.centling.core.daoimpl;

import org.springframework.stereotype.Repository;

import com.centling.core.pojo.*;
import com.centling.core.dao.*;
/**
 * 表：OA_DESKTOP_SET 对应daoImpl
 */
@Repository
public class OaDesktopSetDaoImpl extends BaseHapiDaoimpl<OaDesktopSet, Long> implements IOaDesktopSetDao {

   public OaDesktopSetDaoImpl(){
      super(OaDesktopSet.class);
   }
}