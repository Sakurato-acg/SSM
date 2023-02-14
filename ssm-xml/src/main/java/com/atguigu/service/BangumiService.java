package com.atguigu.service;

import com.atguigu.pojo.Bangumi;
import com.github.pagehelper.PageInfo;

public interface BangumiService {

    public PageInfo<Bangumi> getByPage(Bangumi bangumi,Integer start ,Integer count);

    public boolean add (Bangumi bangumi);

    public boolean  update(Bangumi bangumi);

    public boolean deleteSingle(Integer id,Integer userId);

    public boolean deleteByIds(Integer []ids,Integer userId);
}
