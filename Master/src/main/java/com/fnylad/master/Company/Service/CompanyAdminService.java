package com.fnylad.master.Company.Service;


import com.fnylad.master.Entity.CompanyAdmin;

import java.util.List;

public interface CompanyAdminService {
    CompanyAdmin getCompanyInfo(Integer ea_id);
    List<CompanyAdmin> getCompanyHrList(Integer ea_id);
}
