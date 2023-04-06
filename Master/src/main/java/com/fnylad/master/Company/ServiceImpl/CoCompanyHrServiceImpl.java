package com.fnylad.master.Company.ServiceImpl;

import com.fnylad.master.Entity.CompanyHr;
import com.fnylad.master.Company.Service.CoCompanyHrService;
import com.fnylad.master.Company.Mapper.CoCompanyHrMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoCompanyHrServiceImpl implements CoCompanyHrService {
    @Autowired
    private CoCompanyHrMapper coCompanyHrMapper;
    @Override
    public Integer deleteOneHr(Integer ehr_id) {
        return coCompanyHrMapper.deleteOneHr(ehr_id);
    }

    @Override
    public Integer insertOneHr(CompanyHr companyHr) {

        return coCompanyHrMapper.insertOneHr(companyHr);
    }
}
