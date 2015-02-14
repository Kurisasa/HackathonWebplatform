/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackathon.transfer.dto;

import com.hackathon.dto.AdminDTO;
import com.hackathon.dto.ChallengeDTO;
import com.hackathon.dto.CityDTO;
import com.hackathon.dto.CompanyDTO;
import com.hackathon.dto.CountryDTO;
import com.hackathon.dto.HackImageDTO;
import com.hackathon.dto.HackathonDTO;
import com.hackathon.dto.HackerDTO;
import com.hackathon.dto.PictureDTO;
import com.hackathon.dto.ProvinceDTO;
import com.hackathon.dto.ReportDTO;
import com.hackathon.dto.RuleDTO;
import com.hackathon.dto.SkillDTO;
import com.hackathon.dto.SponsorDTO;
import com.hackathon.dto.TeamDTO;
import com.hackathon.dto.TownDTO;
import java.util.Date;

/**
 *
 * @author CodeTribe1
 */
public class RequestDTO {
    
    private Integer requestType, companyID, hackerID, challengeID,
            skillID, sponsorID, loginType,provinceID,
            countryID, cityID, townID, reportID,ruleID,
            adminID, hackathonID, hackImageID, pictureID;
    private String email, pin, gcmRegistrationID;
    private Date startDate, endDate;
    private Double latitude, longitude;
    private Float accuracy;
    
    private AdminDTO admin;
    private ChallengeDTO challenge;
    private CityDTO city;
    private CompanyDTO company;
    private CountryDTO country;
    private HackImageDTO hackImage;
    private HackathonDTO hackathon;
    private HackerDTO hacker;
    private PictureDTO picture;
    private ProvinceDTO province;
    private ReportDTO report;
    private RuleDTO rule;
    private SkillDTO skill;
    private SponsorDTO sponsor;
    private TeamDTO team;
    private TownDTO town;
    
     public static final int REGISTER_COMPANY = 1,
            REGISTER_ADMIN = 2,
            REGISTER_HACKER = 3,
            REGISTER_TEAM = 4;
     
     public static final int LOGIN = 200,
             LOGIN_HACKER = 201;
     
     public static final int ADD_COUNTRY = 10,
             ADD_PROVINCE = 11,
             ADD_CITY = 12,
             ADD_TOWN = 13,
             ADD_HACKATHON =14,
             ADD_REPORT =15,
             ADD_RULE =16,
             ADD_SKILL = 17;
           
     
     public static final int UPDATE_COUNTRY = 20,
             UPDATE_PROVINCE = 21,
             UPDATE_CITY = 22,
             UPDATE_TOWN = 23,
             UPDATE_HACKATHON =24,
             UPDATE_REPORT =25,
             UPDATE_RULE =26,
             UPDATE_SKILL = 27,
             UPDATE_TEAM = 28;
     
      public static final int LIST_COUNTRY = 30,
             LIST_PROVINCE = 31,
             LIST_CITY = 32,
             LIST_TOWN = 33,
             LIST_HACKATHON =34,
             LIST_REPORT =35,
             LIST_RULE =36,
             LIST_SKILL = 37,
             LIST_TEAM = 38,
             LIST_CHALLENGE= 39;
      
       public static final int LIST_COUNTRY_NAME = 40,
             LIST_PROVINCE_COUNTRY = 41,
             LIST_CITY_PROVINCE = 42,
             LIST_TOWN_CITY = 43,
             LIST_HACKATHON_COMPANY =44,
             LIST_REPORT_TEAM =45,
             LIST_RULE_COMPANY =46,
             LIST_SKILL_NAME= 47,
             LIST_TEAM_NAME = 48;
      
    public static final String COMPANY_HACKATHON_DIR = "hackathon";
    public static final String HACKER_DIR = "hacker";

    public Integer getRequestType() {
        return requestType;
    }

    public void setRequestType(Integer requestType) {
        this.requestType = requestType;
    }

    public Integer getCompanyID() {
        return companyID;
    }

    public void setCompanyID(Integer companyID) {
        this.companyID = companyID;
    }

    public Integer getHackerID() {
        return hackerID;
    }

    public void setHackerID(Integer hackerID) {
        this.hackerID = hackerID;
    }

    public Integer getChallengeID() {
        return challengeID;
    }

    public void setChallengeID(Integer challengeID) {
        this.challengeID = challengeID;
    }

    public Integer getSkillID() {
        return skillID;
    }

    public void setSkillID(Integer skillID) {
        this.skillID = skillID;
    }

    public Integer getSponsorID() {
        return sponsorID;
    }

    public void setSponsorID(Integer sponsorID) {
        this.sponsorID = sponsorID;
    }

    public Integer getLoginType() {
        return loginType;
    }

    public void setLoginType(Integer loginType) {
        this.loginType = loginType;
    }

    public Integer getProvinceID() {
        return provinceID;
    }

    public void setProvinceID(Integer provinceID) {
        this.provinceID = provinceID;
    }

    public Integer getCountryID() {
        return countryID;
    }

    public void setCountryID(Integer countryID) {
        this.countryID = countryID;
    }

    public Integer getCityID() {
        return cityID;
    }

    public void setCityID(Integer cityID) {
        this.cityID = cityID;
    }

    public Integer getTownID() {
        return townID;
    }

    public void setTownID(Integer townID) {
        this.townID = townID;
    }

    public Integer getReportID() {
        return reportID;
    }

    public void setReportID(Integer reportID) {
        this.reportID = reportID;
    }

    public Integer getRuleID() {
        return ruleID;
    }

    public void setRuleID(Integer ruleID) {
        this.ruleID = ruleID;
    }

    public Integer getAdminID() {
        return adminID;
    }

    public void setAdminID(Integer adminID) {
        this.adminID = adminID;
    }

    public Integer getHackathonID() {
        return hackathonID;
    }

    public void setHackathonID(Integer hackathonID) {
        this.hackathonID = hackathonID;
    }

    public Integer getHackImageID() {
        return hackImageID;
    }

    public void setHackImageID(Integer hackImageID) {
        this.hackImageID = hackImageID;
    }

    public Integer getPictureID() {
        return pictureID;
    }

    public void setPictureID(Integer pictureID) {
        this.pictureID = pictureID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getGcmRegistrationID() {
        return gcmRegistrationID;
    }

    public void setGcmRegistrationID(String gcmRegistrationID) {
        this.gcmRegistrationID = gcmRegistrationID;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Float getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Float accuracy) {
        this.accuracy = accuracy;
    }

    public AdminDTO getAdmin() {
        return admin;
    }

    public void setAdmin(AdminDTO admin) {
        this.admin = admin;
    }

    public ChallengeDTO getChallenge() {
        return challenge;
    }

    public void setChallenge(ChallengeDTO challenge) {
        this.challenge = challenge;
    }

    public CityDTO getCity() {
        return city;
    }

    public void setCity(CityDTO city) {
        this.city = city;
    }

    public CompanyDTO getCompany() {
        return company;
    }

    public void setCompany(CompanyDTO company) {
        this.company = company;
    }

    public CountryDTO getCountry() {
        return country;
    }

    public void setCountry(CountryDTO country) {
        this.country = country;
    }

    public HackImageDTO getHackImage() {
        return hackImage;
    }

    public void setHackImage(HackImageDTO hackImage) {
        this.hackImage = hackImage;
    }

    public HackathonDTO getHackathon() {
        return hackathon;
    }

    public void setHackathon(HackathonDTO hackathon) {
        this.hackathon = hackathon;
    }

    public HackerDTO getHacker() {
        return hacker;
    }

    public void setHacker(HackerDTO hacker) {
        this.hacker = hacker;
    }

    public PictureDTO getPicture() {
        return picture;
    }

    public void setPicture(PictureDTO picture) {
        this.picture = picture;
    }

    public ProvinceDTO getProvince() {
        return province;
    }

    public void setProvince(ProvinceDTO province) {
        this.province = province;
    }

    public ReportDTO getReport() {
        return report;
    }

    public void setReport(ReportDTO report) {
        this.report = report;
    }

    public RuleDTO getRule() {
        return rule;
    }

    public void setRule(RuleDTO rule) {
        this.rule = rule;
    }

    public SkillDTO getSkill() {
        return skill;
    }

    public void setSkill(SkillDTO skill) {
        this.skill = skill;
    }

    public SponsorDTO getSponsor() {
        return sponsor;
    }

    public void setSponsor(SponsorDTO sponsor) {
        this.sponsor = sponsor;
    }

    public TeamDTO getTeam() {
        return team;
    }

    public void setTeam(TeamDTO team) {
        this.team = team;
    }

    public TownDTO getTown() {
        return town;
    }

    public void setTown(TownDTO town) {
        this.town = town;
    }
    
    
}
