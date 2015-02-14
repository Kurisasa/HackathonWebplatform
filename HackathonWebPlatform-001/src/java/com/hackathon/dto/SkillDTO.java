/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackathon.dto;

import com.hackathon.data.Hacker;
import com.hackathon.data.Skill;
import java.util.List;

/**
 *
 * @author CodeTribe1
 */
public class SkillDTO {
    private Integer skillID;
    private String name;
    private String description;
    private List<HackerDTO> hackerList;
    
    private SkillDTO(){
        
    }
    
     private SkillDTO(Skill s){
        this.description = s.getDescription();
        this.name = s.getName();
        this.skillID = s.getSkillID();
    }

    public Integer getSkillID() {
        return skillID;
    }

    public void setSkillID(Integer skillID) {
        this.skillID = skillID;
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

    public List<HackerDTO> getHackerList() {
        return hackerList;
    }

    public void setHackerList(List<HackerDTO> hackerList) {
        this.hackerList = hackerList;
    }
     
     
}
