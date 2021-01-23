package com.jikewang.send.dao;

import com.jikewang.send.domain.Repaymentplan;
import com.jikewang.send.domain.RepaymentplanKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ProjectName: send
 * @Package: com.jikewang.send.dao
 * @ClassName: RepaymentplanMapper
 * @Author: wangyaqiang
 * @Description:
 * @Date: 2021/1/15 14:06
 * @Version: 1.0
 */

@Mapper
public interface RepaymentplanMapper {
    int deleteByPrimaryKey(RepaymentplanKey paramRepaymentplanKey);

    int insert(Repaymentplan paramRepaymentplan);

    int insertSelective(Repaymentplan paramRepaymentplan);

    Repaymentplan selectByPrimaryKey(RepaymentplanKey paramRepaymentplanKey);

    int updateByPrimaryKeySelective(Repaymentplan paramRepaymentplan);

    int updateByPrimaryKey(Repaymentplan paramRepaymentplan);

    List<Integer> findLatest(@Param("dt") String paramString);
}
