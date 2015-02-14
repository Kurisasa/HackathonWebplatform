/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackathon.data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author CodeTribe1
 */
@Entity
@Table(name = "hackathon")
@NamedQueries({
    @NamedQuery(name = "Hackathon.findAll", query = "SELECT h FROM Hackathon h"),
    @NamedQuery(name = "Hackathon.findByHackathonID", query = "SELECT h FROM Hackathon h WHERE h.hackathonID = :hackathonID"),
    @NamedQuery(name = "Hackathon.findByName", query = "SELECT h FROM Hackathon h WHERE h.name = :name"),
    @NamedQuery(name = "Hackathon.findByLocation", query = "SELECT h FROM Hackathon h WHERE h.location = :location"),
    @NamedQuery(name = "Hackathon.findByDate", query = "SELECT h FROM Hackathon h WHERE h.date = :date"),
    @NamedQuery(name = "Hackathon.findByTotalRegistrants", query = "SELECT h FROM Hackathon h WHERE h.totalRegistrants = :totalRegistrants"),
    @NamedQuery(name = "Hackathon.findByTotalProjectDemo", query = "SELECT h FROM Hackathon h WHERE h.totalProjectDemo = :totalProjectDemo"),
    @NamedQuery(name = "Hackathon.findByWinner", query = "SELECT h FROM Hackathon h WHERE h.winner = :winner")})
public class Hackathon implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "hackathonID")
    private Integer hackathonID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "location")
    private String location;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @Basic(optional = false)
    @NotNull
    @Column(name = "totalRegistrants")
    private double totalRegistrants;
    @Basic(optional = false)
    @NotNull
    @Column(name = "totalProjectDemo")
    private double totalProjectDemo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "winner")
    private String winner;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hackathon")
    private List<Hackimage> hackimageList;
    @JoinColumn(name = "companyID", referencedColumnName = "companyID")
    @ManyToOne(optional = false)
    private Company company;
    @JoinColumn(name = "townID", referencedColumnName = "townID")
    @ManyToOne(optional = false)
    private Town town;

    public Hackathon() {
    }

    public Hackathon(Integer hackathonID) {
        this.hackathonID = hackathonID;
    }

    public Hackathon(Integer hackathonID, String name, String location, Date date, double totalRegistrants, double totalProjectDemo, String winner) {
        this.hackathonID = hackathonID;
        this.name = name;
        this.location = location;
        this.date = date;
        this.totalRegistrants = totalRegistrants;
        this.totalProjectDemo = totalProjectDemo;
        this.winner = winner;
    }

    public Integer getHackathonID() {
        return hackathonID;
    }

    public void setHackathonID(Integer hackathonID) {
        this.hackathonID = hackathonID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getTotalRegistrants() {
        return totalRegistrants;
    }

    public void setTotalRegistrants(double totalRegistrants) {
        this.totalRegistrants = totalRegistrants;
    }

    public double getTotalProjectDemo() {
        return totalProjectDemo;
    }

    public void setTotalProjectDemo(double totalProjectDemo) {
        this.totalProjectDemo = totalProjectDemo;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public List<Hackimage> getHackimageList() {
        return hackimageList;
    }

    public void setHackimageList(List<Hackimage> hackimageList) {
        this.hackimageList = hackimageList;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Town getTown() {
        return town;
    }

    public void setTown(Town town) {
        this.town = town;
    }

   
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hackathonID != null ? hackathonID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hackathon)) {
            return false;
        }
        Hackathon other = (Hackathon) object;
        if ((this.hackathonID == null && other.hackathonID != null) || (this.hackathonID != null && !this.hackathonID.equals(other.hackathonID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hackathon.data.Hackathon[ hackathonID=" + hackathonID + " ]";
    }
    
}
