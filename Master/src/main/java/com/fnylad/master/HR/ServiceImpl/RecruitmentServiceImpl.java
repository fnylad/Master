package com.fnylad.master.HR.ServiceImpl;

import com.fnylad.master.Entity.Recruitment;
import com.fnylad.master.HR.Mapper.RecruitmentMapper;
import com.fnylad.master.HR.Service.RecruitmentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecruitmentServiceImpl implements RecruitmentService {

    @Autowired
    RecruitmentMapper recruitmentMapper;

    @Override
    public PageInfo<Recruitment> getRecruitmentByEhrid(Integer pageIndex, Integer pageSize, Integer ehrid) {
        PageHelper.startPage(pageIndex,pageSize);
        List<Recruitment> list=recruitmentMapper.getRecruitmentByEhrid(ehrid);
        PageInfo<Recruitment> plist=new PageInfo<>(list);
        return plist;
    }

    @Override
    public Integer deleteOneRecruitment(Integer r_id) {

        return recruitmentMapper.deleteOneRecruitment(r_id);
    }

    @Override
    public Integer insertOneRecruitment(Recruitment re) {
        return recruitmentMapper.insertOneRecruitment(re);
    }

    @Override
    public Recruitment getRecruitmentAppByRid(Integer r_id) {
        Recruitment recruitment=recruitmentMapper.getRecruitmentAppByRid(r_id);

        recruitment.setApplyNum(recruitment.getApplyList().size());

        return recruitment;
    }

    @Override
    public Integer updateRecruitment(Recruitment recruitment) {
        return recruitmentMapper.updateRecruitment(recruitment);
    }
}
