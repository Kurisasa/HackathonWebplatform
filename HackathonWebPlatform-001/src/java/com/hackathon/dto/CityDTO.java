/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackathon.dto;

import com.hackathon.data.City;
import com.hackathon.data.Province;
import com.hackathon.data.Town;
import java.util.List;

/**
 *
 * @author CodeTribe1
 */
public class CityDTO {
    
    private Integer cityID;
    private String name;
    private double longitude;
    private double latitude;
    private List<TownDTO> townList;
    private ProvinceDTO province;
    
    private CityDTO(){
        
    }
      public CityDTO(City c){
          
       this.cityID = c.getCityID();
       this.latitude = c.getLatitude();
       this.longitude = c.getLongitude();
       this.name = c.getName();
       
    }

    public Integer getCityID() {
        return cityID;
    }

    public void setCityID(Integer cityID) {
        this.cityID = cityID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public List<TownDTO> getTownList() {
        return townList;
    }

    public void setTownList(List<TownDTO> townList) {
        this.townList = townList;
    }

    public ProvinceDTO getProvince() {
        return province;
    }

    public void setProvince(ProvinceDTO province) {
        this.province = province;
    }
    
      
}
