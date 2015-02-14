/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackathon.dto;

import com.hackathon.data.Admin;
import com.hackathon.data.Company;
import com.hackathon.data.Hackathon;
import com.hackathon.data.Rule;
import java.util.List;

/**
 *
 * @author CodeTribe1
 */
public class CompanyDTO {
    
    private Integer companyID;
    private String name;
    private String email;
    private String address;
    private String website;
    private List<AdminDTO> adminList;
    private List<RuleDTO> ruleList;
    private List<HackathonDTO> hackathonList;
    
    private CompanyDTO(){
        
    }
    
     private CompanyDTO(Company c){
        this.address = c.getAddress();
        this.companyID = c.getCompanyID();
        this.email = c.getEmail();
        this.name = c.getName();
        this.website = c.getWebsite();
    }

    public Integer getCompanyID() {
        return companyID;
    }

    public void setCompanyID(Integer companyID) {
        this.companyID = companyID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public List<AdminDTO> getAdminList() {
        return adminList;
    }

    public void setAdminList(List<AdminDTO> adminList) {
        this.adminList = adminList;
    }

    public List<RuleDTO> getRuleList() {
        return ruleList;
    }

    public void setRuleList(List<RuleDTO> ruleList) {
        this.ruleList = ruleList;
    }

    public List<HackathonDTO> getHackathonList() {
        return hackathonList;
    }

    public void setHackathonList(List<HackathonDTO> hackathonList) {
        this.hackathonList = hackathonList;
    }
     
     
}
