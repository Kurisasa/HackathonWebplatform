/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackathon.dto;

import com.hackathon.data.Challenge;
import com.hackathon.data.Sponsor;
import java.util.Date;
import java.util.List;

/**
 *
 * @author CodeTribe1
 */
public class SponsorDTO {
    private Integer sponsorID;
    private String name;
    private String email;
    private Date dateRegistered;
    private List<ChallengeDTO> challengeList;
    
    private SponsorDTO(){
        
    }
    
    private SponsorDTO(Sponsor s){
        this.dateRegistered = new Date();
        this.email = s.getEmail();
        this.sponsorID = s.getSponsorID();
        this.name = s.getName();
    }

    public Integer getSponsorID() {
        return sponsorID;
    }

    public void setSponsorID(Integer sponsorID) {
        this.sponsorID = sponsorID;
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

    public Date getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(Date dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public List<ChallengeDTO> getChallengeList() {
        return challengeList;
    }

    public void setChallengeList(List<ChallengeDTO> challengeList) {
        this.challengeList = challengeList;
    }
    
    
}
