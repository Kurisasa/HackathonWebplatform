/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackathon.dto;

import com.hackathon.data.Hacker;
import com.hackathon.data.Picture;

/**
 *
 * @author CodeTribe1
 */
public class PictureDTO {
    private Integer pictureID;
    private String uri;
    private HackerDTO hacker;
    
    private PictureDTO(){
        
    }
    
    public PictureDTO(Picture p){
        this.pictureID = p.getPictureID();
        this.uri = p.getUri();
    }

    public Integer getPictureID() {
        return pictureID;
    }

    public void setPictureID(Integer pictureID) {
        this.pictureID = pictureID;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public HackerDTO getHacker() {
        return hacker;
    }

    public void setHacker(HackerDTO hacker) {
        this.hacker = hacker;
    }
    
    
}
