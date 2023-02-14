package com.itheima.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itheima.controller.Code;
import com.itheima.exception.BusinessException;
import com.itheima.mapper.BookMapper;
import com.itheima.pojo.Book;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public boolean save(Book book) {
        int save = bookMapper.save(book);
        return save>0;
    }

    @Override
    public boolean update(Book book) {
        int update = bookMapper.update(book);
        return update>0;
    }

    @Override
    public boolean delete(Integer id) {
        int delete = bookMapper.delete(id);
        return delete>0;
    }

    @Override
    public Book getById(Integer id) {
        if (id==1){
            //业务异常
            throw new BusinessException(Code.BUSINESS_ERR,"请不要用你的技术，挑战我的软肋（doge）");
        }

//        try {
//            int i = 1 / 0;
//        } catch (ArithmeticException e) {
//            //系统异常
//            throw new SystemException(Code.SYSTEM_TIMEOUT_ERR,"服务器访问超时，请重试",e);
//        }

        return bookMapper.getById(id);
    }

    @Override
    public List<Book> getAll() {
        Page page=new Page(1,10);

        return bookMapper.getAll();
    }
    @Override
    public Page<Book> getPage() {
        Page<Book> page=PageHelper.startPage(1,10);
        bookMapper.getAll();
        return page;
    }
}
