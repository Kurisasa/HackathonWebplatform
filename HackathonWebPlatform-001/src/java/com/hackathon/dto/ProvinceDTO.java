/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackathon.dto;

import com.hackathon.data.City;
import com.hackathon.data.Country;
import com.hackathon.data.Province;
import java.util.List;

/**
 *
 * @author CodeTribe1
 */
public class ProvinceDTO {
    private Integer provinceID;
    private String name;
    private double longitude;
    private double latitude;
    private List<CityDTO> cityList;
    private CountryDTO country;
    
    private ProvinceDTO(){
        
    }
    
     public ProvinceDTO(Province p){
        this.latitude = p.getLatitude();
        this.longitude = p.getLongitude();
        this.name = p.getName();
        this.provinceID = p.getProvinceID();
    }

    public Integer getProvinceID() {
        return provinceID;
    }

    public void setProvinceID(Integer provinceID) {
        this.provinceID = provinceID;
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

    public List<CityDTO> getCityList() {
        return cityList;
    }

    public void setCityList(List<CityDTO> cityList) {
        this.cityList = cityList;
    }

    public CountryDTO getCountry() {
        return country;
    }

    public void setCountry(CountryDTO country) {
        this.country = country;
    }
     
     
}
