/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackathon.dto;

import com.hackathon.data.Report;
import com.hackathon.data.Team;

/**
 *
 * @author CodeTribe1
 */
public class ReportDTO {
    private Integer reportID;
    private String description;
    private TeamDTO team;
    
    private ReportDTO(){
        
    }
    
    public ReportDTO(Report r){
        this.description = r.getDescription();
        this.reportID = r.getReportID();
    }

    public Integer getReportID() {
        return reportID;
    }

    public void setReportID(Integer reportID) {
        this.reportID = reportID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TeamDTO getTeam() {
        return team;
    }

    public void setTeam(TeamDTO team) {
        this.team = team;
    }
    
    
}
