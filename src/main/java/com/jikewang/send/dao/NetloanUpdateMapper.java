package com.jikewang.send.dao;

import com.jikewang.send.domain.NetloanUpdate;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NetloanUpdateMapper {
    int deleteByPrimaryKey(Integer appNo);

    int insert(NetloanUpdate record);

    int insertSelective(NetloanUpdate record);

    NetloanUpdate selectByPrimaryKey(Integer appNo);

    int updateByPrimaryKeySelective(NetloanUpdate record);

    int updateByPrimaryKey(NetloanUpdate record);
}