package com.fnylad.master.HR.Service;

import com.github.pagehelper.PageInfo;
import com.fnylad.master.Entity.Recruitment;

public interface RecruitmentService {
    PageInfo<Recruitment> getRecruitmentByEhrid(Integer pageIndex,Integer pageSize,Integer ehrid);
    Integer deleteOneRecruitment(Integer r_id);
    Integer insertOneRecruitment(Recruitment re);
    Recruitment getRecruitmentAppByRid(Integer r_id);
    Integer updateRecruitment(Recruitment recruitment);
}
