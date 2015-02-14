/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackathon.dto;

import com.hackathon.data.Hacker;
import com.hackathon.data.Picture;
import com.hackathon.data.Skill;
import com.hackathon.data.Team;
import java.util.Date;
import java.util.List;

/**
 *
 * @author CodeTribe1
 */
public class HackerDTO {
    
    private Integer hackerID;
    private String firstname;
    private String lastname;
    private String email;
    private String address;
    private Date dateRegistered;
    private List<PictureDTO> pictureList;
    private SkillDTO skill;
    private TeamDTO team;
    
    private HackerDTO(){
        
    }
    public HackerDTO(Hacker h){
        this.address = h.getAddress();
        this.dateRegistered = new Date();
        this.email = h.getEmail();
        this.firstname = h.getFirstname();
        this.hackerID = h.getHackerID();
        this.lastname = h.getLastname();
        
    }

    public Integer getHackerID() {
        return hackerID;
    }

    public void setHackerID(Integer hackerID) {
        this.hackerID = hackerID;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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

    public Date getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(Date dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public List<PictureDTO> getPictureList() {
        return pictureList;
    }

    public void setPictureList(List<PictureDTO> pictureList) {
        this.pictureList = pictureList;
    }

    public SkillDTO getSkill() {
        return skill;
    }

    public void setSkill(SkillDTO skill) {
        this.skill = skill;
    }

    public TeamDTO getTeam() {
        return team;
    }

    public void setTeam(TeamDTO team) {
        this.team = team;
    }
    
}
