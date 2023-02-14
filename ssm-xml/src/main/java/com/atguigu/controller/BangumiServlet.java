package com.atguigu.controller;

import com.atguigu.pojo.Bangumi;
import com.atguigu.service.BangumiService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@SuppressWarnings("all")
@RestController
@RequestMapping("/subject")
public class BangumiServlet {

    @Autowired
    private BangumiService bangumiService;

    @PostMapping()
    public PageInfo<Bangumi> getByPage(@RequestBody Bangumi bangumi, Integer currentPage, Integer pageSize) {
        PageInfo<Bangumi> pageInfo = bangumiService.getByPage(bangumi, currentPage, pageSize);
        return pageInfo;
    }

    @PutMapping("/add")
    public boolean addBangumi(@RequestBody Bangumi bangumi, HttpSession session) {
        boolean add = bangumiService.add(bangumi);
        return add;
    }


    @PutMapping("/update")
    public boolean update(@RequestBody Bangumi bangumi, HttpSession session) {
        boolean update = bangumiService.update(bangumi);
        return update;

    }


    @DeleteMapping("/{id}")
    public boolean deleteSingle(@PathVariable("id") Integer id, HttpSession session, Integer userId) {
//        User user = (User) session.getAttribute("user" + userId);
        boolean deleteSingle = bangumiService.deleteSingle(id, userId);
        return deleteSingle;
    }

    @DeleteMapping()
    public boolean deleteByIds(@RequestBody Integer[] ids, HttpSession session, Integer userId) {
//        User user = (User) session.getAttribute("user" + userId);
        boolean deleteByIds = bangumiService.deleteByIds(ids, userId);
        return deleteByIds;
    }

}
