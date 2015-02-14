/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackathon.util;

import com.hackathon.data.Admin;
import com.hackathon.data.Challenge;
import com.hackathon.data.City;
import com.hackathon.data.Hackathon;
import com.hackathon.data.Hacker;
import com.hackathon.data.Hackimage;
import com.hackathon.data.Picture;
import com.hackathon.data.Province;
import com.hackathon.data.Report;
import com.hackathon.data.Rule;
import com.hackathon.data.Team;
import com.hackathon.data.Town;
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
import com.hackathon.dto.TeamDTO;
import com.hackathon.dto.TownDTO;
import com.hackathon.transfer.dto.ResponseDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author CodeTribe1
 */
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class ListUtil {
    @PersistenceContext
    EntityManager em;
    
      public ResponseDTO getProvinceByCountry(Integer countryID) throws DataException {
        ResponseDTO resp = new ResponseDTO();
        try {
            Query q = em.createNamedQuery("Province.findByCountry", Province.class);
            q.setParameter("countryID", countryID);
            List<Province> list = q.getResultList();
            resp.setProvinceList(new ArrayList<ProvinceDTO>());
            for (Province p : list) {
                resp.getProvinceList().add(new ProvinceDTO(p));
            }
            log.log(Level.OFF, "Found Provinces : {0}", resp.getProvinceList().size());
        } catch (Exception e) {
            log.log(Level.OFF, "failed to get provinces", e);
            throw new DataException("failed ........");
        }
        return resp;
    }

    public ResponseDTO getProvinceList() throws DataException {
        ResponseDTO resp = new ResponseDTO();
        try {
            Query q = em.createNamedQuery("Province.findAll", Province.class);
            List<Province> list = q.getResultList();
            resp.setProvinceList(new ArrayList<ProvinceDTO>());
            for (Province p : list) {
                resp.getProvinceList().add(new ProvinceDTO(p));
            }
            log.log(Level.OFF, "Provinces failed: {0}", resp.getProvinceList().size());
        } catch (Exception e) {
            log.log(Level.OFF, "failed to get provinces", e);
            throw new DataException("failed ........");
        }
        return resp;
    }
    
    public ResponseDTO getCityList(Integer provinceID) throws DataException {
        ResponseDTO resp = new ResponseDTO();
        try {
            Query q = em.createNamedQuery("City.findByProvince", City.class);
            q.setParameter("provinceID", provinceID);
            List<City> list = q.getResultList();
            resp.setCityList(new ArrayList<CityDTO>());
            for (City ci : list) {
                resp.getCityList().add(new CityDTO(ci));
            }
        } catch (Exception e) {
            Logger.getLogger("listutil").log(Level.OFF, "Failed", e);
            throw new DataException("Could not list ....");
        }

        return resp;
    }
    
     public ResponseDTO getCityList() throws DataException {
        ResponseDTO resp = new ResponseDTO();
        try {
            Query q = em.createNamedQuery("City.findAll", City.class);
            List<City> list = q.getResultList();
            resp.setCityList(new ArrayList<CityDTO>());
            for (City ci : list) {
                resp.getCityList().add(new CityDTO(ci));
            }
        } catch (Exception e) {
            Logger.getLogger("listutil").log(Level.OFF, "Failed", e);
            throw new DataException("Could not list ....");
        }

        return resp;
    }
    
    public ResponseDTO getTeamList() throws DataException {
        ResponseDTO resp = new ResponseDTO();
        try {
            Query q = em.createNamedQuery("Team.findAll", Team.class);
            List<Team> list = q.getResultList();
            resp.setTeamList(new ArrayList<TeamDTO>());
            for (Team t : list) {
                resp.getTeamList().add(new TeamDTO(t));
            }
            log.log(Level.OFF, "team list: {0}", resp.getTeamList().size());
        } catch (Exception e) {
            log.log(Level.OFF, "failed to get team", e);
            throw new DataException("failed ........");
        }
        return resp;
    }
    
    public ResponseDTO getTownList() throws DataException {
        ResponseDTO resp = new ResponseDTO();
        try {
            Query q = em.createNamedQuery("Town.findAll", Town.class);
            List<Town> list = q.getResultList();
            resp.setTownList(new ArrayList<TownDTO>());
            for (Town t : list) {
                resp.getTownList().add(new TownDTO(t));
            }
            log.log(Level.OFF, "Town list: {0}", resp.getTownList().size());
        } catch (Exception e) {
            log.log(Level.OFF, "failed to get Town", e);
            throw new DataException("failed ........");
        }
        return resp;
    }
    public ResponseDTO getAdminList() throws DataException {
        ResponseDTO resp = new ResponseDTO();
        try {
            Query q = em.createNamedQuery("Admin.findAll", Admin.class);
            List<Admin> list = q.getResultList();
            resp.setAdminList(new ArrayList<AdminDTO>());
            for (Admin a : list) {
                resp.getAdminList().add(new AdminDTO(a));
            }
            log.log(Level.OFF, "Admin list: {0}", resp.getAdminList().size());
        } catch (Exception e) {
            log.log(Level.OFF, "failed to get Admin list", e);
            throw new DataException("failed ........");
        }
        return resp;
    }
    
    public ResponseDTO getRuleList() throws DataException {
        ResponseDTO resp = new ResponseDTO();
        try {
            Query q = em.createNamedQuery("Rule.findAll", Rule.class);
            List<Rule> list = q.getResultList();
            resp.setRuleList(new ArrayList<RuleDTO>());
            for (Rule r : list) {
                resp.getRuleList().add(new RuleDTO(r));
            }
            log.log(Level.OFF, "Rule list: {0}", resp.getRuleList().size());
        } catch (Exception e) {
            log.log(Level.OFF, "failed to get Rule list", e);
            throw new DataException("failed ........");
        }
        return resp;
    }
    public ResponseDTO getHackathonList() throws DataException {
        ResponseDTO resp = new ResponseDTO();
        try {
            Query q = em.createNamedQuery("Hackathon.findAll", Hackathon.class);
            List<Hackathon> list = q.getResultList();
            resp.setHackathonList(new ArrayList<HackathonDTO>());
            for (Hackathon h : list) {
                resp.getHackathonList().add(new HackathonDTO(h));
            }
            log.log(Level.OFF, "Hackathon list: {0}", resp.getHackathonList().size());
        } catch (Exception e) {
            log.log(Level.OFF, "failed to get Hackathon list", e);
            throw new DataException("failed ........");
        }
        return resp;
    }
    public ResponseDTO getHackImageList() throws DataException {
        ResponseDTO resp = new ResponseDTO();
        try {
            Query q = em.createNamedQuery("HackImage.findAll", Hackimage.class);
            List<Hackimage> list = q.getResultList();
            resp.setHackimageList(new ArrayList<HackImageDTO>());
            for (Hackimage i : list) {
                resp.getHackimageList().add(new HackImageDTO(i));
            }
            log.log(Level.OFF, "Hacks Images list: {0}", resp.getHackathonList().size());
        } catch (Exception e) {
            log.log(Level.OFF, "failed to get Hack Images list", e);
            throw new DataException("failed ........");
        }
        return resp;
    }
    
     public ResponseDTO getPictureList() throws DataException {
        ResponseDTO resp = new ResponseDTO();
        try {
            Query q = em.createNamedQuery("Picture.findAll", Picture.class);
            List<Picture> list = q.getResultList();
            resp.setPictureList(new ArrayList<PictureDTO>());
            for (Picture p : list) {
                resp.getPictureList().add(new PictureDTO(p));
            }
            log.log(Level.OFF, "Pictures list: {0}", resp.getPictureList().size());
        } catch (Exception e) {
            log.log(Level.OFF, "failed to get Picture list", e);
            throw new DataException("failed ........");
        }
        return resp;
    }
     
    public ResponseDTO getHackerList() throws DataException {
        ResponseDTO resp = new ResponseDTO();
        try {
            Query q = em.createNamedQuery("Hacker.findAll", Hacker.class);
            List<Hacker> list = q.getResultList();
            resp.setHackerList(new ArrayList<HackerDTO>());
            for (Hacker p : list) {
                resp.getHackerList().add(new HackerDTO(p));
            }
            log.log(Level.OFF, "Hackers list: {0}", resp.getHackerList().size());
        } catch (Exception e) {
            log.log(Level.OFF, "failed to get Hacker list", e);
            throw new DataException("failed ........");
        }
        return resp;
    }
    
     public ResponseDTO getChallengeList() throws DataException {
        ResponseDTO resp = new ResponseDTO();
        try {
            Query q = em.createNamedQuery("Challenge.findAll", Challenge.class);
            List<Challenge> list = q.getResultList();
            resp.setChallengeList(new ArrayList<ChallengeDTO>());
            for (Challenge c : list) {
                resp.getChallengeList().add(new ChallengeDTO(c));
            }
            log.log(Level.OFF, "Challenges list: {0}", resp.getChallengeList().size());
        } catch (Exception e) {
            log.log(Level.OFF, "failed to get Challenges list", e);
            throw new DataException("failed ........");
        }
        return resp;
    }
     
    public ResponseDTO getReportList() throws DataException {
        ResponseDTO resp = new ResponseDTO();
        try {
            Query q = em.createNamedQuery("Report.findAll", Report.class);
            List<Report> list = q.getResultList();
            resp.setReportList(new ArrayList<ReportDTO>());
            for (Report r : list) {
                resp.getReportList().add(new ReportDTO(r));
            }
            log.log(Level.OFF, "Reports list: {0}", resp.getReportList().size());
        } catch (Exception e) {
            log.log(Level.OFF, "failed to get Reports list", e);
            throw new DataException("failed ........");
        }
        return resp;
    }
    
static final Logger log = Logger.getLogger(ListUtil.class.getSimpleName());
}
