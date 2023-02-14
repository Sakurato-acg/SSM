package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Bangumi;
import com.atguigu.mybatis.pojo.BangumiExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BangumiMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bangumi
     *
     * @mbggenerated Thu Jan 05 17:43:52 CST 2023
     */
    int countByExample(BangumiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bangumi
     *
     * @mbggenerated Thu Jan 05 17:43:52 CST 2023
     */
    int deleteByExample(BangumiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bangumi
     *
     * @mbggenerated Thu Jan 05 17:43:52 CST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bangumi
     *
     * @mbggenerated Thu Jan 05 17:43:52 CST 2023
     */
    int insert(Bangumi record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bangumi
     *
     * @mbggenerated Thu Jan 05 17:43:52 CST 2023
     */
    int insertSelective(Bangumi record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bangumi
     *
     * @mbggenerated Thu Jan 05 17:43:52 CST 2023
     */
    List<Bangumi> selectByExample(BangumiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bangumi
     *
     * @mbggenerated Thu Jan 05 17:43:52 CST 2023
     */
    Bangumi selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bangumi
     *
     * @mbggenerated Thu Jan 05 17:43:52 CST 2023
     */
    int updateByExampleSelective(@Param("record") Bangumi record, @Param("example") BangumiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bangumi
     *
     * @mbggenerated Thu Jan 05 17:43:52 CST 2023
     */
    int updateByExample(@Param("record") Bangumi record, @Param("example") BangumiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bangumi
     *
     * @mbggenerated Thu Jan 05 17:43:52 CST 2023
     */
    int updateByPrimaryKeySelective(Bangumi record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bangumi
     *
     * @mbggenerated Thu Jan 05 17:43:52 CST 2023
     */
    int updateByPrimaryKey(Bangumi record);
}