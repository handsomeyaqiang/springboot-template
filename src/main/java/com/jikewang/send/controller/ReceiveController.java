package com.jikewang.send.controller;

import com.jikewang.send.domain.LoanInfo;
import com.jikewang.send.vo.RestResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ProjectName: send
 * @Package: com.jikewang.send.controller
 * @ClassName: ReceiveController
 * @Author: wangyaqiang
 * @Description:
 * @Date: 2021/1/15 14:02
 * @Version: 1.0
 */

@RestController
@RequestMapping({"/receive"})
public class ReceiveController
{
    @RequestMapping(value = {"/receive"}, produces = {"application/json;charset=UTF-8"})
    public RestResult receive(@RequestBody List<LoanInfo> info) {
        System.out.println(info);
        return RestResult.success();
    }
}
