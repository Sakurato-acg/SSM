package com.itheima.controller;

import com.itheima.pojo.Book;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/books")
public class BookServlet {

    @Autowired
    private BookService bookService;

    @PostMapping
    public Result save(@RequestBody Book book) {

        boolean flag = bookService.save(book);

        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR, flag);
    }

    @PutMapping
    public Result update(@RequestBody Book book) {

        boolean update = bookService.update(book);

        return new Result(update ? Code.UPDATE_OK : Code.UPDATE_ERR, update);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag = bookService.delete(id);
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR, flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {

        Book book = bookService.getById(id);

        Integer code = book != null ? Code.GET_OK : Code.GET_ERR;
        String msg = book != null ? "" : "数据查询失败";

        return new Result(code, book, msg);
    }

    @GetMapping
    public Result getAll() {

        List<Book> list = bookService.getAll();
//        List<Book> list=new ArrayList<>();
        Integer code = list.isEmpty() ? Code.GET_ERR : Code.GET_OK;
        String msg = list.isEmpty() ? "数据查询失败" : "数据查询成功 ";

        return new Result(code, list, msg);
    }
}
