/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackathon.util;

import com.hackathon.data.Admin;
import com.hackathon.data.Challenge;
import com.hackathon.data.City;
import com.hackathon.data.Company;
import com.hackathon.data.Country;
import com.hackathon.data.Hackathon;
import com.hackathon.data.Hacker;
import com.hackathon.data.Province;
import com.hackathon.data.Report;
import com.hackathon.data.Rule;
import com.hackathon.data.Skill;
import com.hackathon.data.Team;
import com.hackathon.data.Town;
import com.hackathon.dto.AdminDTO;
import com.hackathon.dto.CityDTO;
import com.hackathon.dto.CompanyDTO;
import com.hackathon.dto.CountryDTO;
import com.hackathon.dto.HackathonDTO;
import com.hackathon.dto.HackerDTO;
import com.hackathon.dto.ProvinceDTO;
import com.hackathon.dto.ReportDTO;
import com.hackathon.dto.RuleDTO;
import com.hackathon.dto.SkillDTO;
import com.hackathon.dto.TeamDTO;
import com.hackathon.dto.TownDTO;
import com.hackathon.transfer.dto.ResponseDTO;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author CodeTribe1
 */
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class DataUtil {
    @PersistenceContext
    EntityManager em;
    
     public ResponseDTO addCountry(CountryDTO country) throws DataException {
        ResponseDTO resp = new ResponseDTO();
        try {
            Country ct = new Country();
            ct.setName(country.getName());
            ct.setLatitude(country.getLatitude());
            ct.setLongitude(country.getLongitude());

            em.persist(ct);
            em.flush();

            log.log(Level.OFF, "Country has been added for: {0} ",
                    new Object[]{ct.getName()});

        } catch (Exception e) {
            log.log(Level.SEVERE, "Failed", e);
            throw new DataException("Failed");
        }
        return resp;
    }
    
    public ResponseDTO addProvince(ProvinceDTO province) throws DataException {
        ResponseDTO resp = new ResponseDTO();
        try {
            Province p = new Province();
            p.setLatitude(province.getLatitude());
            p.setLongitude(province.getLongitude());
            p.setName(province.getName());

            em.persist(p);
            em.flush();

            resp.getProvinceList().add(new ProvinceDTO(p));

            log.log(Level.OFF, "province has been added for: {0} ",
                    new Object[]{p.getName()});

        } catch (Exception e) {
            log.log(Level.SEVERE, "Failed", e);
            throw new DataException("Failed");
        }
        return resp;
    }
    
    public ResponseDTO addCity(CityDTO city) throws DataException {
        ResponseDTO resp = new ResponseDTO();
        try {
            City cty = new City();
            cty.setName(city.getName());
            cty.setLatitude(city.getLatitude());
            cty.setLongitude(city.getLongitude());

            em.persist(cty);
            em.flush();
            resp.getCityList().add(new CityDTO(cty));

            log.log(Level.OFF, "city has been added for: {0} ",
                    new Object[]{cty.getName()});

        } catch (Exception e) {
            log.log(Level.SEVERE, "Failed", e);
            throw new DataException("Failed");
        }
        return resp;
    }
    
    public ResponseDTO addTown(TownDTO township) throws DataException {
        ResponseDTO resp = new ResponseDTO();
        try {
            Town tw = new Town();
            tw.setName(township.getName());
            tw.setLatitude(township.getLatitude());
            tw.setLangitude(township.getLangitude());
            tw.setCity(em.find(City.class, township.getCity().getCityID()));

            em.persist(tw);
            em.flush();
            resp.getTownList().add(new TownDTO(tw));

            log.log(Level.OFF, "Town has been added for: {0} ",
                    new Object[]{tw.getName()});

        } catch (Exception e) {
            log.log(Level.SEVERE, "Failed", e);
            throw new DataException("Failed");
        }
        return resp;
    }
    
    public ResponseDTO registerAdmin(AdminDTO admin) throws DataException {
        ResponseDTO resp = new ResponseDTO();
        try {
            Admin a = new Admin();
            a.setCompany(em.find(Company.class, admin.getCompany().getCompanyID()));
            
            a.setName(admin.getName());
            a.setEmail(admin.getEmail());
            
            } catch (Exception e) {
            log.log(Level.SEVERE, "Failed", e);
            throw new DataException("Failed");
        }
        return resp;
        }
    
     public ResponseDTO registerHacker(HackerDTO hacker) throws DataException {
        ResponseDTO resp = new ResponseDTO();
        try {
            Hacker ts = new Hacker();
            
                ts.setSkill(em.find(Skill.class, hacker.getSkill().getSkillID()));
                ts.setTeam(em.find(Team.class, hacker.getHackerID()));
                
                ts.setAddress(hacker.getAddress());
                ts.setDateRegistered(new Date());
                ts.setEmail(hacker.getEmail());
                ts.setLastname(hacker.getLastname());
                ts.setFirstname(hacker.getFirstname());
                
                em.persist(ts);
                em.flush();
                
            } catch (Exception e) {
            log.log(Level.SEVERE, "Failed", e);
            throw new DataException("Failed");
        }
        return resp;
        }
     
      public ResponseDTO registerCompany(CompanyDTO company) throws DataException {
        ResponseDTO resp = new ResponseDTO();
        try {
            Company c = new Company();
            c.setAddress(company.getAddress());
            c.setEmail(company.getEmail());
            c.setName(company.getName());
            c.setWebsite(company.getWebsite());
            
            em.persist(c);
            em.flush();


            log.log(Level.OFF, "Company has been registered for: {0} ",
                    new Object[]{c.getName()});

            
            } 
        catch (Exception e) {
            log.log(Level.SEVERE, "Failed", e);
            throw new DataException("Failed");
        }
        return resp;
        }
       public ResponseDTO registerTeam(TeamDTO team) throws DataException {
        ResponseDTO resp = new ResponseDTO();
        try {
            Team t = new Team();
            t.setChallenge(em.find(Challenge.class, team.getChallenge().getChallengeID()));
            t.setName(team.getName());
            t.setDateRegistered(new Date());

            em.persist(t);
            em.flush();

            resp.getTeamList().add(new TeamDTO(t));

            log.log(Level.OFF, "Team has been registered for: {0} ",
                    new Object[]{t.getName()});

        } catch (Exception e) {
            log.log(Level.SEVERE, "Failed", e);
            throw new DataException("Failed");
        }
        return resp;
    }
    public ResponseDTO addRule(RuleDTO rule) throws DataException {
        ResponseDTO resp = new ResponseDTO();
        try {
            Rule i = new Rule();
            i.setCompany(em.find(Company.class, rule.getCompany().getCompanyID()));
            i.setName(rule.getName());
            i.setDescription(rule.getDescription());

            em.persist(i);
            em.flush();

            resp.getRuleList().add(new RuleDTO(i));

            log.log(Level.OFF, "rule has been added for: {0} ",
                    new Object[]{i.getName()});

        } catch (Exception e) {
            log.log(Level.SEVERE, "Failed", e);
            throw new DataException("Failed");
        }
        return resp;
    }
  public ResponseDTO addSkill(SkillDTO skill) throws DataException {
        ResponseDTO resp = new ResponseDTO();
        try {
            Skill s = new Skill();
            
            s.setName(skill.getName());
            s.setDescription(skill.getDescription());

            em.persist(s);
            em.flush();

            log.log(Level.OFF, "skill has been added for: {0} ",
                    new Object[]{s.getName()});

        } catch (Exception e) {
            log.log(Level.SEVERE, "Failed", e);
            throw new DataException("Failed");
        }
        return resp;
    }
  
   public ResponseDTO addReport(ReportDTO report) throws DataException {
        ResponseDTO resp = new ResponseDTO();
        try {
            Report r = new Report();
            
             r.setTeam(em.find(Team.class, report.getReportID()));
             r.setDescription(report.getDescription());
            

            em.persist(r);
            em.flush();

            log.log(Level.OFF, "Report has been added for: {0} ",
                    new Object[]{r.getTeam().getName()});

        } catch (Exception e) {
            log.log(Level.SEVERE, "Failed", e);
            throw new DataException("Failed");
        }
        return resp;
    }
   
   public ResponseDTO addHackathon(HackathonDTO hackathon) throws DataException {
        ResponseDTO resp = new ResponseDTO();
        try {
            Hackathon h = new Hackathon();
            h.setCompany(em.find(Company.class, hackathon.getCompany().getCompanyID()));
            h.setTown(em.find(Town.class, hackathon.getTown().getTownID()));
           
            h.setDate(new Date());
            h.setName(hackathon.getName());
            h.setLocation(hackathon.getLocation());
            h.setWinner(hackathon.getWinner());
            h.setTotalProjectDemo(hackathon.getTotalProjectDemo());
            h.setTotalRegistrants(hackathon.getTotalRegistrants());
            em.persist(h);
            em.flush();

            resp.getHackathonList().add(new HackathonDTO(h));

            log.log(Level.OFF, "hackathon has been added for: {0} ",
                    new Object[]{h.getName()});

        } catch (Exception e) {
            log.log(Level.SEVERE, "Failed", e);
            throw new DataException("Failed");
        }
        return resp;
    }
        
   public ResponseDTO updateTeam(TeamDTO tea) throws DataException {
        ResponseDTO resp = new ResponseDTO();
        try {
            Team t = em.find(Team.class, tea.getTeamID());
            
                if (tea.getName() != null) {
                    t.setName(tea.getName());
                            

                em.merge(t);
                log.log(Level.INFO, "Team updated");
            }
        } catch (Exception e) {
            log.log(Level.OFF, null, e);
            throw new DataException("Failed to update Team");
        }

        return resp;
    }
   
    public ResponseDTO updateCountry(CountryDTO country) throws DataException {
        ResponseDTO resp = new ResponseDTO();
        try {
            Country cn = em.find(Country.class, country.getCountryID());
            
            
                if (country.getName() != null) {
                    cn.setName(country.getName());
                    
                

                em.merge(cn);
                log.log(Level.INFO, "country updated");
            }
        } catch (Exception e) {
            log.log(Level.OFF, null, e);
            throw new DataException("Failed to update country");
        }

        return resp;
    }
   
    public ResponseDTO updateProvince(ProvinceDTO province) throws DataException {
        ResponseDTO resp = new ResponseDTO();
        try {
            Province p = em.find(Province.class, province.getProvinceID());
            
            
                if (province.getName() != null) {
                    p.setName(province.getName());
                    
                

                em.merge(p);
                log.log(Level.INFO, "Province updated");
            }
        } catch (Exception e) {
            log.log(Level.OFF, null, e);
            throw new DataException("Failed to update Province");
        }

        return resp;
    }
   
    public ResponseDTO updateCity(CityDTO city) throws DataException {
        ResponseDTO resp = new ResponseDTO();
        try {
            City c = em.find(City.class, city.getCityID());
            
            
                if (city.getName() != null) {
                    c.setName(city.getName());
                    
                

                em.merge(c);
                log.log(Level.INFO, "City updated");
            }
        } catch (Exception e) {
            log.log(Level.OFF, null, e);
            throw new DataException("Failed to update City");
        }

        return resp;
    }
   
   public ResponseDTO updateTown(TownDTO tow) throws DataException {
        ResponseDTO resp = new ResponseDTO();
        try {
            Town t = em.find(Town.class, tow.getTownID());
            
            
                if (tow.getName() != null) {
                    t.setName(tow.getName());
                    
                

                em.merge(t);
                log.log(Level.INFO, "Town updated");
            }
        } catch (Exception e) {
            log.log(Level.OFF, null, e);
            throw new DataException("Failed to update Town");
        }

        return resp;
    }
   
    public ResponseDTO updateSkill(SkillDTO skill) throws DataException {
        ResponseDTO resp = new ResponseDTO();
        try {
            Skill s = em.find(Skill.class, skill.getSkillID());
            
            
                if (skill.getName() != null) {
                    s.setName(skill.getName());
                    
                  if(skill.getDescription() !=null){
                      s.setDescription(skill.getDescription());
                  }
                

                em.merge(s);
                log.log(Level.INFO, "skill updated");
            }
        } catch (Exception e) {
            log.log(Level.OFF, null, e);
            throw new DataException("Failed to update skill");
        }

        return resp;
    }
    
     public ResponseDTO updateRule(RuleDTO rule) throws DataException {
        ResponseDTO resp = new ResponseDTO();
        try {
            Rule r = em.find(Rule.class, rule.getRuleID());
            
            
                if (rule.getName() != null) {
                    r.setName(rule.getName());
                    
                  if(rule.getDescription() !=null){
                      r.setDescription(rule.getDescription());
                  }
                

                em.merge(r);
                log.log(Level.INFO, "rule updated");
            }
        } catch (Exception e) {
            log.log(Level.OFF, null, e);
            throw new DataException("Failed to update rule");
        }

        return resp;
    }
    public ResponseDTO updateHackathon(HackathonDTO hackathon) throws DataException {
        ResponseDTO resp = new ResponseDTO();
        try {
            Hackathon hr = em.find(Hackathon.class, hackathon.getHackathonID());
            
            
                if (hackathon.getName() != null) {
                    hr.setName(hackathon.getName());
                    
                  if(hackathon.getWinner() !=null){
                      hr.setWinner(hackathon.getWinner());
                  }
                
                  if(hackathon.getLocation() !=null){
                      hr.setLocation(hackathon.getLocation());
                  }

                em.merge(hr);
                log.log(Level.INFO, "Hackathon updated");
            }
        } catch (Exception e) {
            log.log(Level.OFF, null, e);
            throw new DataException("Failed to update Hackathon");
        }

        return resp;
    }
    
     static final Logger log = Logger.getLogger(DataUtil.class.getSimpleName());   
}
