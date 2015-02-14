/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackathon.gate;

import com.google.gson.Gson;
import com.hackathon.transfer.dto.RequestDTO;
import com.hackathon.transfer.dto.ResponseDTO;
import com.hackathon.util.DataUtil;
import com.hackathon.util.ListUtil;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author CodeTribe1
 */
@WebServlet(name = "TestServlet", urlPatterns = {"/test"})
public class TestServlet extends HttpServlet {

    @EJB
    DataUtil dataUtil;

    @EJB
    ListUtil listUtil;
    Gson gson = new Gson();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json;charset=UTF-8");
                log.log(Level.OFF, "Servlet starting ...");
        PrintWriter out = response.getWriter();
        String json;
        ResponseDTO ur = new ResponseDTO();
        try {
            RequestDTO req = getRequest(request);

            switch (req.getRequestType()) {
                case RequestDTO.REGISTER_TEAM:
                    ur = dataUtil.registerTeam(req.getTeam());
                    break;
                case RequestDTO.REGISTER_ADMIN:
                    ur = dataUtil.registerAdmin(req.getAdmin());
                    break;
                case RequestDTO.REGISTER_COMPANY:
                    ur = dataUtil.registerCompany(req.getCompany());
                    break;
                case RequestDTO.REGISTER_HACKER:
                    ur = dataUtil.registerHacker(req.getHacker());
                    break;
                case RequestDTO.ADD_CITY:
                    ur = dataUtil.addCity(req.getCity());
                    break;
                case RequestDTO.ADD_COUNTRY:
                    ur = dataUtil.addCountry(req.getCountry());
                    break;
                case RequestDTO.ADD_PROVINCE:
                    ur = dataUtil.addProvince(req.getProvince());
                    break;
                case RequestDTO.ADD_HACKATHON:
                    ur = dataUtil.addHackathon(req.getHackathon());
                    break;
                case RequestDTO.ADD_REPORT:
                    ur = dataUtil.addReport(req.getReport());
                    break;
                case RequestDTO.ADD_RULE:
                    ur = dataUtil.addRule(req.getRule());
                    break;
                case RequestDTO.ADD_SKILL:
                    ur = dataUtil.addSkill(req.getSkill());
                    break;
                case RequestDTO.ADD_TOWN:
                    ur = dataUtil.addTown(req.getTown());
                    break;
                case RequestDTO.LIST_CITY:
                    ur = listUtil.getCityList();
                    break;
                case RequestDTO.LIST_CITY_PROVINCE:
                    ur = listUtil.getCityList(req.getProvinceID());
                    break;
                case RequestDTO.LIST_HACKATHON:
                    ur = listUtil.getHackathonList();
                    break;
                case RequestDTO.LIST_REPORT:
                    ur = listUtil.getReportList();
                    break;
                case RequestDTO.LIST_TEAM:
                    ur = listUtil.getTeamList();
                    break;
                case RequestDTO.LIST_CHALLENGE:
                    ur = listUtil.getChallengeList();
                    break;
                case RequestDTO.LIST_PROVINCE:
                    ur = listUtil.getProvinceList();
                    break;
                 case RequestDTO.LIST_RULE:
                    ur = listUtil.getRuleList();
                    break;
                 case RequestDTO.LIST_TOWN:
                     ur = listUtil.getTownList();
                     break;
                /*case RequestDTO.LIST_SKILL:
                     ur = listUtil.getSkillList();
                     break;*/
                
                default:
                    ur.setStatusCode(444);
                    ur.setMessage("#### Unknown Request");
                    log.log(Level.SEVERE, "Couldn't find request,you fool");
                    break;

            }
        } catch (Exception ex) {
            log.log(Level.OFF, "Failed.....{0}", ex);
            ur.setStatusCode(10);
            ur.setMessage("broken sasa u r nt a geek");
        } finally {
            json = gson.toJson(ur);
            out.println(json);
            out.close();
            log.log(Level.OFF, "Servlet ending");
        }
    }
        

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
 private RequestDTO getRequest(HttpServletRequest req) {
        String json = req.getParameter("JSON");
        RequestDTO re = null;
        if (json == null) {
            log.log(Level.OFF, "Json parameter not found...");
            re = new RequestDTO();
            re.setRequestType(0);
            return re;
        }

        try {
            re = gson.fromJson(json, RequestDTO.class);
            log.log(Level.INFO, "JSON okay. ...");
        } catch (Exception e) {
            log.log(Level.OFF, "JSON is not okay. ...");
            re = new RequestDTO();
            re.setRequestType(0);
        }
        return re;
    }
    
    static final Logger log = Logger.getLogger(TestServlet.class.getSimpleName());
}

