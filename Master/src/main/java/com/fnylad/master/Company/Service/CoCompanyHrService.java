package com.fnylad.master.Company.Service;

import com.fnylad.master.Entity.CompanyHr;

public interface CoCompanyHrService {
    Integer deleteOneHr(Integer ehr_id);
    Integer insertOneHr(CompanyHr companyHr);
}
