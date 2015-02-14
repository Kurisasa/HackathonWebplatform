/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackathon.dto;

import com.hackathon.data.Challenge;
import com.hackathon.data.Sponsor;
import com.hackathon.data.Team;
import java.util.List;

/**
 *
 * @author CodeTribe1
 */
public class ChallengeDTO {
    private Integer challengeID;
    private String name;
    private String description;
    private List<TeamDTO> teamList;
    private SponsorDTO sponsor;
    
    private ChallengeDTO(){
    }
    public ChallengeDTO(Challenge c){
        this.challengeID = c.getChallengeID();
        this.description = c.getDescription();
        this.name = c.getName();
    }

    public Integer getChallengeID() {
        return challengeID;
    }

    public void setChallengeID(Integer challengeID) {
        this.challengeID = challengeID;
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

    public List<TeamDTO> getTeamList() {
        return teamList;
    }

    public void setTeamList(List<TeamDTO> teamList) {
        this.teamList = teamList;
    }

    public SponsorDTO getSponsor() {
        return sponsor;
    }

    public void setSponsor(SponsorDTO sponsor) {
        this.sponsor = sponsor;
    }
    
    
}
