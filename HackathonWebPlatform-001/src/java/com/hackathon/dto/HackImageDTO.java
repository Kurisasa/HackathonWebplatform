/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackathon.dto;

import com.hackathon.data.Hackathon;
import com.hackathon.data.Hackimage;
import java.util.Date;

/**
 *
 * @author CodeTribe1
 */
public class HackImageDTO {
    
    private Integer hackImageID;
    private Date dateTaken;
    private String filename;
    private HackathonDTO hackathon;
    
    private HackImageDTO(){
        
    }
    
     public HackImageDTO(Hackimage h){
        this.dateTaken = new Date();
        this.filename = h.getFilename();
        this.hackImageID = h.getHackImageID();
        
    }

    public Integer getHackImageID() {
        return hackImageID;
    }

    public void setHackImageID(Integer hackImageID) {
        this.hackImageID = hackImageID;
    }

    public Date getDateTaken() {
        return dateTaken;
    }

    public void setDateTaken(Date dateTaken) {
        this.dateTaken = dateTaken;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public HackathonDTO getHackathon() {
        return hackathon;
    }

    public void setHackathon(HackathonDTO hackathon) {
        this.hackathon = hackathon;
    }
     
     
}
