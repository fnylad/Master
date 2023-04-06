package com.fnylad.master.Company.Service;

import com.fnylad.master.Entity.Company;

public interface CoCompanyService {
    Integer updateCompanyAvatar(Integer e_id,String fileName);
    Integer updateCompanyInfo(Company company);
    Integer uploadLicenseImg(Integer e_id,String fileName);
}
