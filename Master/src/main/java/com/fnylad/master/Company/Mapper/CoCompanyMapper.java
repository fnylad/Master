package com.fnylad.master.Company.Mapper;
import com.fnylad.master.Entity.Company;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CoCompanyMapper {
    Integer updateCompanyAvatar(Integer e_id,String e_logo);
    Integer updateCompanyInfo(Company company);
    Integer uploadLicenseImg(Integer e_id,String e_licenseImg);
}
