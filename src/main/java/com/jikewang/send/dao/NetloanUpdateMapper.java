package com.jikewang.send.dao;

import com.jikewang.send.domain.NetloanUpdate;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface NetloanUpdateMapper {
    List<Integer> findWdAll();

    List<NetloanUpdate> query(@Param("appNos") List<Integer> paramList);

    void batchInsert(@Param("appNos") List<Integer> paramList);

    List<Integer> findFail();

    void batchUpdate(@Param("appNos") List<Integer> paramList);

}