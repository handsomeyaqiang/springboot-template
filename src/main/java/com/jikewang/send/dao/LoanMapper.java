package com.jikewang.send.dao;

import com.jikewang.send.domain.Loan;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: send
 * @Package: com.jikewang.send.dao
 * @ClassName: LoanMapper
 * @Author: wangyaqiang
 * @Description:
 * @Date: 2021/1/15 14:05
 * @Version: 1.0
 */
@Mapper
public interface LoanMapper {
    int deleteByPrimaryKey(Integer paramInteger);

    int insert(Loan paramLoan);

    int insertSelective(Loan paramLoan);

    Loan selectByPrimaryKey(Integer paramInteger);

    int updateByPrimaryKeySelective(Loan paramLoan);

    int updateByPrimaryKey(Loan paramLoan);

    List<Loan> find(Map<String, Object> paramMap);

    List<Integer> findLoanLatest(@Param("dt") String paramString);

    List<Loan> query(Map<String, Object> paramMap);
}
