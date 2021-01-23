package com.jikewang.send.dao;

import com.jikewang.send.domain.Payment;
import com.jikewang.send.domain.PaymentKey;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ProjectName: send
 * @Package: com.jikewang.send.dao
 * @ClassName: PaymentMapper
 * @Author: wangyaqiang
 * @Description:
 * @Date: 2021/1/15 14:06
 * @Version: 1.0
 */
@Mapper
public interface PaymentMapper {
    int deleteByPrimaryKey(PaymentKey paramPaymentKey);

    int insert(Payment paramPayment);

    int insertSelective(Payment paramPayment);

    Payment selectByPrimaryKey(PaymentKey paramPaymentKey);

    int updateByPrimaryKeySelective(Payment paramPayment);

    int updateByPrimaryKey(Payment paramPayment);
}
