package com.fnylad.master.Company.Mapper;

import com.fnylad.master.Entity.CompanyHr;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CoCompanyHrMapper {
     Integer deleteOneHr(Integer ehr_id);
     Integer insertOneHr(CompanyHr companyHr);
}
