package com.zsb.risk.mapper;


import com.zsb.risk.pojo.Risk;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RiskMapper {
    public  boolean PostRiskForm(Risk risk);

    public  int    getRiskCount();

    List<Risk> getAllRisks(int pageStart, int pageSize);
}
