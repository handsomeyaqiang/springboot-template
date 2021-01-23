package com.jikewang.send.dao;

import com.jikewang.send.domain.Miss;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ProjectName: send
 * @Package: com.jikewang.send.dao
 * @ClassName: MissMapper
 * @Author: wangyaqiang
 * @Description:
 * @Date: 2021/1/15 14:05
 * @Version: 1.0
 */
@Mapper
public interface MissMapper {
    int deleteByPrimaryKey(Integer paramInteger);

    int insert(Miss paramMiss);

    int insertSelective(Miss paramMiss);

    Miss selectByPrimaryKey(Integer paramInteger);

    int updateByPrimaryKeySelective(Miss paramMiss);

    int updateByPrimaryKey(Miss paramMiss);

    List<Integer> findMiss(@Param("dt") String paramString);

    void batchInsert(@Param("dt") String paramString, @Param("acctNos") List<Integer> paramList);

    void batchUpdate(@Param("dt") String paramString, @Param("acctNos") List<Integer> paramList);
}
