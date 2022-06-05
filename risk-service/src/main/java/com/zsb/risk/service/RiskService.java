package com.zsb.risk.service;

import com.zsb.risk.mapper.RiskMapper;
import com.zsb.risk.pojo.Risk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RiskService {
    @Autowired
    RiskMapper  riskMapper;

    public boolean PostRiskForm(Risk risk){
        return  riskMapper.PostRiskForm(risk);
    }


    public int getRiskCount() {
        return riskMapper.getRiskCount();
    }

    public List<Risk> getAllRisks(int pageStart, int pageSize) {
        return riskMapper.getAllRisks(pageStart,pageSize);
    }
}
