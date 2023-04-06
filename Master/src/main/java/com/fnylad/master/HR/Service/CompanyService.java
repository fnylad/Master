package com.fnylad.master.HR.Service;

import com.fnylad.master.Entity.Company;

import java.util.List;

public interface CompanyService {
    List<Company> getRCompanyById(Integer id);
    List<Company> getHrCompanyById(Integer id);
}
