package com.fnylad.master.HR.Mapper;

import com.fnylad.master.Entity.Recruitment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RecruitmentMapper {
    List<Recruitment> getRecruitmentByEhrid(Integer ehrid);
    Integer deleteOneRecruitment(Integer r_id);
    Integer insertOneRecruitment(Recruitment re);
    Recruitment getRecruitmentAppByRid(Integer r_id);
    Integer updateRecruitment(Recruitment recruitment);
}
