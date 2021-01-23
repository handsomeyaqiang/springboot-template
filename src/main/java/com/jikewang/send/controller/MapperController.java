package com.jikewang.send.controller;

import com.jikewang.send.dao.CustomerMapper;
import com.jikewang.send.dao.NetloanUpdateMapper;
import com.jikewang.send.domain.Customer;
import com.jikewang.send.domain.NetloanUpdate;
import com.jikewang.send.vo.RestResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: send
 * @Package: com.jikewang.send.controller
 * @ClassName: MapperController
 * @Author: wangyaqiang
 * @Description:
 * @Date: 2021/1/22 16:31
 * @Version: 1.0
 */
@RestController
@RequestMapping({"/mapper"})
public class MapperController {
    private static final Logger logger = LoggerFactory.getLogger(MapperController.class);
    @Autowired
    private CustomerMapper customerMapper;
    @Autowired
    private NetloanUpdateMapper netloanUpdateMapper;

    @RequestMapping("/getCustomer")
    public RestResult getCustomerInfo(){
        Customer customer = customerMapper.selectByPrimaryKey(152);
        System.out.println(customer.toString());
        RestResult success = RestResult.success(customer);
        return success;
    }

    @RequestMapping("/getNetInfo")
    public RestResult getNetInfo() {
        NetloanUpdate netloanUpdate = netloanUpdateMapper.selectByPrimaryKey(8461926);
        return RestResult.success(netloanUpdate);
    }
}
