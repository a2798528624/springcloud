package com.zsb.risk.controller;


import com.alibaba.fastjson.JSON;
import com.zsb.risk.pojo.QueryInfo;
import com.zsb.risk.pojo.Risk;
import com.zsb.risk.service.RiskService;
import org.hibernate.validator.constraints.ParameterScriptAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/risk")
public class RiskController {
    @Autowired
    RiskService riskService;

    @PostMapping("/post/riskForm")
    public  String PostRiskForm(@RequestBody Risk risk){

            boolean  check = riskService.PostRiskForm(risk);
            return check==true?"success":"false";
    }
    @RequestMapping("/allrisk")
    public String getAllUser(@RequestBody QueryInfo queryInfo){
        int number = riskService.getRiskCount();
        int pageStart = (queryInfo.getPageNum()-1) * queryInfo.getPageSize();

        List<Risk> risks = riskService.getAllRisks(pageStart,queryInfo.getPageSize());

        HashMap<String,Object> res = new HashMap<>();

        res.put("number",number);

        res.put("risks",risks);
        String res_s = JSON.toJSONString(res);
        System.out.println(res_s);
        return res_s;
    }
}
