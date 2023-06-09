package com.fnylad.master.Company.Controller;

import com.fnylad.master.Entity.CompanyHr;
import com.fnylad.master.Company.Service.CoCompanyHrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoCompanyHrController {
    @Autowired
    private CoCompanyHrService coCompanyHrService;

    //hr管理员删除一个hr
    @RequestMapping("/company/list/delete/{ehr_id}")
    public Integer deleteOneHr(@PathVariable Integer ehr_id){
        return coCompanyHrService.deleteOneHr(ehr_id);
    }

    @RequestMapping("/company/list/insertCompanyHr")
    public Integer insertHr(@RequestBody CompanyHr companyHr){
        System.out.println(companyHr);
        return coCompanyHrService.insertOneHr(companyHr);
    }
}
