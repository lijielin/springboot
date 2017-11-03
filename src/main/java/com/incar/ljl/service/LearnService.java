package com.incar.ljl.service;

import com.incar.ljl.domain.LearnResouce;

import java.util.List;
import java.util.Map;

/**
 * Created by lijielin on 2017/11/3.
 */
public interface LearnService {

    int add(LearnResouce learnResouce);

    int update(LearnResouce learnResouce);

    int deleteByIds(String[] ids);

    LearnResouce queryLearnResouceById(Long learnResouce);

    List<LearnResouce> queryLearnResouceList(Map<String, Object> params);

}


