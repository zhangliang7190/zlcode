package com.centling.core.daoimpl;

import org.springframework.stereotype.Repository;

import com.centling.core.pojo.*;
import com.centling.core.dao.*;
/**
 * 表：SYS_LIBRARY_INFO 对应daoImpl
 */
@Repository
public class SysLibraryStandardDaoImpl extends BaseHapiDaoimpl<SysLibraryStandard, Long> implements ISysLibraryStandardDao {

   public SysLibraryStandardDaoImpl(){
      super(SysLibraryStandard.class);
   }
}