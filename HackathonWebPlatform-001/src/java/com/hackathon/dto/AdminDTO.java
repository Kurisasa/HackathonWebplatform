/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackathon.dto;

import com.hackathon.data.Admin;

/**
 *
 * @author CodeTribe1
 */
public class AdminDTO {
    
    private Integer adminID;
    private String name;
    private String email;
    private CompanyDTO company;
    
    private AdminDTO(){
        
    }
    public AdminDTO(Admin a){
        this.adminID = a.getAdminID();
        this.name = a.getName();
        this.email = a.getEmail();
    }

    public Integer getAdminID() {
        return adminID;
    }

    public void setAdminID(Integer adminID) {
        this.adminID = adminID;
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

    public CompanyDTO getCompany() {
        return company;
    }

    public void setCompany(CompanyDTO company) {
        this.company = company;
    }
    
    
    
}
