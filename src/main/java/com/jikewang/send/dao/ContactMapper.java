package com.jikewang.send.dao;

import com.jikewang.send.domain.Contact;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: send
 * @Package: com.jikewang.send.dao
 * @ClassName: ContactMapper
 * @Author: wangyaqiang
 * @Description:
 * @Date: 2021/1/15 14:04
 * @Version: 1.0
 */

@Mapper
public interface ContactMapper {
    int deleteByPrimaryKey(Integer paramInteger);

    int insert(Contact paramContact);

    int insertSelective(Contact paramContact);

    Contact selectByPrimaryKey(Integer paramInteger);

    int updateByPrimaryKeySelective(Contact paramContact);

    int updateByPrimaryKey(Contact paramContact);

    List<Integer> findLatest(@Param("dt") String paramString);

    List<Contact> find(Map<String, Object> paramMap);
}
