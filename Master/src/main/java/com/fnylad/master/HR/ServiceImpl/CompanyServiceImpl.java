package com.fnylad.master.HR.ServiceImpl;

import com.fnylad.master.Entity.Company;
import com.fnylad.master.HR.Mapper.CompanyMapper;
import com.fnylad.master.HR.Service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyMapper companyMapper;
    @Override
    public List<Company> getRCompanyById(Integer id) {
         List<Company> list=companyMapper.getRCompanyById(id);
        for (int i = 0; i < list.size(); i++) {
            list.get(i).setPositionNum(list.size());
        }
        return list;
    }

    @Override
    public List<Company> getHrCompanyById(Integer id) {
        List<Company> list=companyMapper.getHrCompanyById(id);
        for (int i = 0; i < list.size(); i++) {
            list.get(i).setHrNum(list.size());
        }
        return list;
    }


}
