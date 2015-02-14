/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackathon.dto;

import com.hackathon.data.Company;
import com.hackathon.data.Hackathon;
import com.hackathon.data.Hackimage;
import com.hackathon.data.Town;
import java.util.Date;
import java.util.List;

/**
 *
 * @author CodeTribe1
 */
public class HackathonDTO {
    
    private Integer hackathonID;
    private String name;
    private String location;
    private Date date;
    private double totalRegistrants;
    private double totalProjectDemo;
    private String winner;
    private List<HackImageDTO> hackimageList;
    private CompanyDTO company;
    private TownDTO town;
    
    private HackathonDTO(){
        
    }
    
     public HackathonDTO(Hackathon h){
        this.date = new Date();
        this.location = h.getLocation();
        this.name = h.getName();
        this.totalProjectDemo = h.getTotalProjectDemo();
        this.totalRegistrants = h.getTotalRegistrants();
        this.winner = h.getWinner();
    }

    public Integer getHackathonID() {
        return hackathonID;
    }

    public void setHackathonID(Integer hackathonID) {
        this.hackathonID = hackathonID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getTotalRegistrants() {
        return totalRegistrants;
    }

    public void setTotalRegistrants(double totalRegistrants) {
        this.totalRegistrants = totalRegistrants;
    }

    public double getTotalProjectDemo() {
        return totalProjectDemo;
    }

    public void setTotalProjectDemo(double totalProjectDemo) {
        this.totalProjectDemo = totalProjectDemo;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public List<HackImageDTO> getHackimageList() {
        return hackimageList;
    }

    public void setHackimageList(List<HackImageDTO> hackimageList) {
        this.hackimageList = hackimageList;
    }

    public CompanyDTO getCompany() {
        return company;
    }

    public void setCompany(CompanyDTO company) {
        this.company = company;
    }

    public TownDTO getTown() {
        return town;
    }

    public void setTown(TownDTO town) {
        this.town = town;
    }
     
     
}
