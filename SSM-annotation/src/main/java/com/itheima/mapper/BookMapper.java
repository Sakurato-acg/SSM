package com.itheima.mapper;

import com.itheima.pojo.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface BookMapper {
    @Insert("INSERT INTO mybatis.tbl_book (type, name, description)" +
            "VALUES (#{type},#{name},#{description})")
    public int save(Book book);

    @Update("update mybatis.tbl_book set type=#{type},name=#{name},description=#{description}")
    public int update(Book book);

    @Delete("delete from tbl_book where id=#{id}")
    public int delete(@Param("id") Integer id);

    @Select("select * from tbl_book where id=#{id}")
    public Book getById(@Param("id") Integer id);

    @Select("select *from tbl_book")
    public List<Book> getAll();
}
