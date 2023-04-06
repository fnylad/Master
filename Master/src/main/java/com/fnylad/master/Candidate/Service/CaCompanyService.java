package com.fnylad.master.Candidate.Service;

import com.fnylad.master.Entity.Company;
import com.fnylad.master.Entity.CompanyHr;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface CaCompanyService {
    Company getCompanyDetailbById(Integer e_id);
    Company getCompanyHr(Integer e_id);
    List<CompanyHr> getHrRecruitment(Integer e_id);
    PageInfo<Company> getCompanyByCondition(Integer pageIndex, Integer pageSize,String key,String flag);
    List<Company> getHotCompany();


}
