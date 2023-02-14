package com.atguigu.service.impl;

import com.atguigu.mapper.BangumiMapper;
import com.atguigu.pojo.Bangumi;
import com.atguigu.service.BangumiService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class BangumiServiceImpl implements BangumiService {

    @Autowired
    private BangumiMapper bangumiMapper;

    @Override
    public PageInfo<Bangumi> getByPage(Bangumi bangumi, Integer start, Integer count) {

        if (bangumi != null && bangumi.getName() != null) {
            bangumi.setName("%" + bangumi.getName() + "%");
        }

        Page<Bangumi> page = PageHelper.startPage(start, count);
        List<Bangumi> bangumis = bangumiMapper.selectByCondition(bangumi, start, count);
        return page.toPageInfo();
    }

    @Transactional
    @Override
    public boolean add(Bangumi bangumi) {
        Page<Bangumi> page = PageHelper.startPage(1, 2);
        List<Bangumi> bangumis = bangumiMapper.selectByCondition(bangumi, 1, 2);
        if (page.stream().toList().size() == 0) {
            bangumiMapper.addBangumi(bangumi);
            return true;
        } else {
            return false;
        }

    }

    @Transactional
    @Override
    public boolean update(Bangumi bangumi) {
        bangumiMapper.update(bangumi);
        return true;
    }

    @Transactional
    @Override
    public boolean deleteSingle(Integer id,Integer userId) {
        bangumiMapper.deleteSingle(id,userId);
        return true;
    }

    @Transactional
    @Override
    public boolean deleteByIds(Integer[] ids,Integer userId) {
        bangumiMapper.deleteByIds(ids,userId);
        return true;
    }

}
