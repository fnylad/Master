package com.fnylad.master.HR.Mapper;

import com.fnylad.master.Entity.Company;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CompanyMapper {
    List<Company> getRCompanyById(Integer id);
    List<Company> getHrCompanyById(Integer id);
}
