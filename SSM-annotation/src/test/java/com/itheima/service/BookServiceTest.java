package com.itheima.service;

import com.github.pagehelper.Page;
import com.itheima.config.SpringConfig;
import com.itheima.pojo.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookServiceTest {

    @Autowired
    private BookService bookService;

    @Test
    public void getAll() {
        List<Book> books = bookService.getAll();
        System.out.println("====================");
        books.forEach(System.out::println);
        System.out.println("====================");
    }

    @Test
    public void getById(){
        Book byId = bookService.getById(2);
        System.out.println("byId = " + byId);
    }

    @Test
    public void getPage(){
        Page<Book> page = bookService.getPage();
        System.out.println(page);
    }
}
