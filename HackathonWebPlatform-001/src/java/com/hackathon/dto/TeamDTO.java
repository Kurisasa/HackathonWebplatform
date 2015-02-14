/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackathon.dto;

import com.hackathon.data.Challenge;
import com.hackathon.data.Hacker;
import com.hackathon.data.Report;
import com.hackathon.data.Team;
import java.util.Date;
import java.util.List;

/**
 *
 * @author CodeTribe1
 */
public class TeamDTO {
    private Integer teamID;
    private String name;
    private Date dateRegistered;
    private ChallengeDTO challenge;
    private List<HackerDTO> hackerList;
    private List<ReportDTO> reportList;
    
    private TeamDTO(){
        
    }
    
    public TeamDTO(Team t){
        this.dateRegistered = new Date();
        this.name = t.getName();
        this.teamID = t.getTeamID();
    }

    public Integer getTeamID() {
        return teamID;
    }

    public void setTeamID(Integer teamID) {
        this.teamID = teamID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(Date dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public ChallengeDTO getChallenge() {
        return challenge;
    }

    public void setChallenge(ChallengeDTO challenge) {
        this.challenge = challenge;
    }

    public List<HackerDTO> getHackerList() {
        return hackerList;
    }

    public void setHackerList(List<HackerDTO> hackerList) {
        this.hackerList = hackerList;
    }

    public List<ReportDTO> getReportList() {
        return reportList;
    }

    public void setReportList(List<ReportDTO> reportList) {
        this.reportList = reportList;
    }
    
    
}
