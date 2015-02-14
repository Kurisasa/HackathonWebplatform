/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackathon.transfer.dto;

import com.hackathon.dto.AdminDTO;
import com.hackathon.dto.ChallengeDTO;
import com.hackathon.dto.CityDTO;
import com.hackathon.dto.HackImageDTO;
import com.hackathon.dto.HackathonDTO;
import com.hackathon.dto.HackerDTO;
import com.hackathon.dto.PictureDTO;
import com.hackathon.dto.ProvinceDTO;
import com.hackathon.dto.ReportDTO;
import com.hackathon.dto.RuleDTO;
import com.hackathon.dto.SkillDTO;
import com.hackathon.dto.TeamDTO;
import com.hackathon.dto.TownDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CodeTribe1
 */
public class ResponseDTO {
    
    private Integer statusCode, statusCountInPeriod, goodCount, badCount;
    private String message, sessionID, GCMRegistrationID, fileString;
    private double elapsedRequestTimeInSeconds;
    private List<TeamDTO> teamList = new ArrayList<>();
    private List<TownDTO> townList = new ArrayList<>();
    private List<AdminDTO> adminList = new ArrayList<>();
    private List<RuleDTO> ruleList = new ArrayList<>();
    private List<HackathonDTO> hackathonList = new ArrayList<>();
    private List<ProvinceDTO> provinceList = new ArrayList<>();
    private List<HackImageDTO> hackimageList = new ArrayList<>();
    private List<PictureDTO> pictureList = new ArrayList<>();
    private List<CityDTO> cityList = new ArrayList<>();
    private List<HackerDTO> hackerList = new ArrayList<>();
    private List<ChallengeDTO> challengeList = new ArrayList<>();
    private List<ReportDTO> reportList = new ArrayList<>();
    
    private SkillDTO skill;

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public Integer getStatusCountInPeriod() {
        return statusCountInPeriod;
    }

    public void setStatusCountInPeriod(Integer statusCountInPeriod) {
        this.statusCountInPeriod = statusCountInPeriod;
    }

    public Integer getGoodCount() {
        return goodCount;
    }

    public void setGoodCount(Integer goodCount) {
        this.goodCount = goodCount;
    }

    public Integer getBadCount() {
        return badCount;
    }

    public void setBadCount(Integer badCount) {
        this.badCount = badCount;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    public String getGCMRegistrationID() {
        return GCMRegistrationID;
    }

    public void setGCMRegistrationID(String GCMRegistrationID) {
        this.GCMRegistrationID = GCMRegistrationID;
    }

    public String getFileString() {
        return fileString;
    }

    public void setFileString(String fileString) {
        this.fileString = fileString;
    }

    public double getElapsedRequestTimeInSeconds() {
        return elapsedRequestTimeInSeconds;
    }

    public void setElapsedRequestTimeInSeconds(double elapsedRequestTimeInSeconds) {
        this.elapsedRequestTimeInSeconds = elapsedRequestTimeInSeconds;
    }

    public List<TeamDTO> getTeamList() {
        return teamList;
    }

    public void setTeamList(List<TeamDTO> teamList) {
        this.teamList = teamList;
    }

    public List<TownDTO> getTownList() {
        return townList;
    }

    public void setTownList(List<TownDTO> townList) {
        this.townList = townList;
    }

    public List<AdminDTO> getAdminList() {
        return adminList;
    }

    public void setAdminList(List<AdminDTO> adminList) {
        this.adminList = adminList;
    }

    public List<RuleDTO> getRuleList() {
        return ruleList;
    }

    public void setRuleList(List<RuleDTO> ruleList) {
        this.ruleList = ruleList;
    }

    public List<HackathonDTO> getHackathonList() {
        return hackathonList;
    }

    public void setHackathonList(List<HackathonDTO> hackathonList) {
        this.hackathonList = hackathonList;
    }

    public List<ProvinceDTO> getProvinceList() {
        return provinceList;
    }

    public void setProvinceList(List<ProvinceDTO> provinceList) {
        this.provinceList = provinceList;
    }

    public List<HackImageDTO> getHackimageList() {
        return hackimageList;
    }

    public void setHackimageList(List<HackImageDTO> hackimageList) {
        this.hackimageList = hackimageList;
    }

    public List<PictureDTO> getPictureList() {
        return pictureList;
    }

    public void setPictureList(List<PictureDTO> pictureList) {
        this.pictureList = pictureList;
    }

    public List<CityDTO> getCityList() {
        return cityList;
    }

    public void setCityList(List<CityDTO> cityList) {
        this.cityList = cityList;
    }

    public List<HackerDTO> getHackerList() {
        return hackerList;
    }

    public void setHackerList(List<HackerDTO> hackerList) {
        this.hackerList = hackerList;
    }

    public List<ChallengeDTO> getChallengeList() {
        return challengeList;
    }

    public void setChallengeList(List<ChallengeDTO> challengeList) {
        this.challengeList = challengeList;
    }

    public List<ReportDTO> getReportList() {
        return reportList;
    }

    public void setReportList(List<ReportDTO> reportList) {
        this.reportList = reportList;
    }

    public SkillDTO getSkill() {
        return skill;
    }

    public void setSkill(SkillDTO skill) {
        this.skill = skill;
    }
    
    
    
}
