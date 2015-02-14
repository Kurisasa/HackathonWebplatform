/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackathon.dto;

import com.hackathon.data.Company;
import com.hackathon.data.Rule;

/**
 *
 * @author CodeTribe1
 */
public class RuleDTO {
    private Integer ruleID;
    private String name;
    private String description;
    private CompanyDTO company;
    
    private RuleDTO(){
        
    }
    
     public RuleDTO(Rule r){
        this.description = r.getDescription();
        this.name = r.getName();
        this.ruleID = r.getRuleID();
    }

    public Integer getRuleID() {
        return ruleID;
    }

    public void setRuleID(Integer ruleID) {
        this.ruleID = ruleID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CompanyDTO getCompany() {
        return company;
    }

    public void setCompany(CompanyDTO company) {
        this.company = company;
    }
     
    
}
