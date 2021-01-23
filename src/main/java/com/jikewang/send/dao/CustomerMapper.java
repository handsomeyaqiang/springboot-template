package com.jikewang.send.dao;

import com.jikewang.send.domain.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: send
 * @Package: com.jikewang.send.dao
 * @ClassName: CustomerMapper
 * @Author: wangyaqiang
 * @Description:
 * @Date: 2021/1/15 14:04
 * @Version: 1.0
 */
@Mapper
public interface CustomerMapper {
    int deleteByPrimaryKey(Integer paramInteger);

    int insert(Customer paramCustomer);

    int insertSelective(Customer paramCustomer);

    Customer selectByPrimaryKey(Integer paramInteger);

    int updateByPrimaryKeySelective(Customer paramCustomer);

    int updateByPrimaryKey(Customer paramCustomer);

    List<Customer> find(Map<String, Object> paramMap);

    List<Integer> findLatest(@Param("dt") String paramString);
}

