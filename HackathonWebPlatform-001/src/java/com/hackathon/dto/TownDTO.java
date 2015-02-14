/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackathon.dto;

import com.hackathon.data.City;
import com.hackathon.data.Hackathon;
import com.hackathon.data.Town;
import java.util.List;

/**
 *
 * @author CodeTribe1
 */
public class TownDTO {
    private Integer townID;
    private String name;
    private double langitude;
    private double latitude;
    private CityDTO city;
    private List<HackathonDTO> hackathonList;
    
    private TownDTO(){
        
    }
    
    public TownDTO(Town t){
        this.langitude = t.getLangitude();
        this.latitude = t.getLatitude();
        this.name = t.getName();
        this.townID = t.getTownID();
    }

    public Integer getTownID() {
        return townID;
    }

    public void setTownID(Integer townID) {
        this.townID = townID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLangitude() {
        return langitude;
    }

    public void setLangitude(double langitude) {
        this.langitude = langitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public CityDTO getCity() {
        return city;
    }

    public void setCity(CityDTO city) {
        this.city = city;
    }

    public List<HackathonDTO> getHackathonList() {
        return hackathonList;
    }

    public void setHackathonList(List<HackathonDTO> hackathonList) {
        this.hackathonList = hackathonList;
    }
    
    
}
