/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackathon.dto;

import com.hackathon.data.Country;
import com.hackathon.data.Province;
import java.util.List;

/**
 *
 * @author CodeTribe1
 */
public class CountryDTO {
    private Integer countryID;
    private String name;
    private double longitude;
    private double latitude;
    private List<ProvinceDTO> provinceList;
    
    private CountryDTO(){
        
    }
    
    public CountryDTO(Country c){
        this.countryID = c.getCountryID();
        this.latitude = c.getLatitude();
        this.longitude = c.getLongitude();
        this.name = c.getName();
    }

    public Integer getCountryID() {
        return countryID;
    }

    public void setCountryID(Integer countryID) {
        this.countryID = countryID;
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

    public List<ProvinceDTO> getProvinceList() {
        return provinceList;
    }

    public void setProvinceList(List<ProvinceDTO> provinceList) {
        this.provinceList = provinceList;
    }
    
    
}
