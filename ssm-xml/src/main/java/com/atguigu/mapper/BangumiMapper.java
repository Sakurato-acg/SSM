package com.atguigu.mapper;


import com.atguigu.pojo.Bangumi;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BangumiMapper {

    List<Bangumi> selectByCondition(@Param("anime") Bangumi anime
            , @Param("start") Integer start, @Param("count") Integer count);

    @Update("insert into bangumi(name, type, time, status, year, picture, userId) VALUES (#{anime.name},#{anime.type},#{anime.time},#{anime.status},#{anime.year},#{anime.picture},#{anime.userId})")
    void addBangumi(@Param("anime") Bangumi anime);

    @Update("update anime_library.bangumi set `name`=#{anime.name}, type=#{anime.type} , time=#{anime.time} , `status`=#{anime.status} , `year`=#{anime.year} , picture=#{anime.picture}  where id=#{anime.id}")
    void update(@Param("anime") Bangumi anime);

    @Delete("delete from bangumi where id=#{id} and userId=#{userId}")
    void deleteSingle(@Param("id") Integer id,@Param("userId") Integer userId);

    void deleteByIds(@Param("ids")Integer []ids,@Param("useId") Integer userId);
}
