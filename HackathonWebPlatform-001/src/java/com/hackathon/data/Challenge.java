/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackathon.data;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author CodeTribe1
 */
@Entity
@Table(name = "challenge")
@NamedQueries({
    @NamedQuery(name = "Challenge.findAll", query = "SELECT c FROM Challenge c"),
    @NamedQuery(name = "Challenge.findByChallengeID", query = "SELECT c FROM Challenge c WHERE c.challengeID = :challengeID"),
    @NamedQuery(name = "Challenge.findByName", query = "SELECT c FROM Challenge c WHERE c.name = :name"),
    @NamedQuery(name = "Challenge.findByDescription", query = "SELECT c FROM Challenge c WHERE c.description = :description")})
public class Challenge implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "challengeID")
    private Integer challengeID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "description")
    private String description;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "challenge")
    private List<Team> teamList;
    @JoinColumn(name = "sponsorID", referencedColumnName = "sponsorID")
    @ManyToOne(optional = false)
    private Sponsor sponsor;

    public Challenge() {
    }

    public Challenge(Integer challengeID) {
        this.challengeID = challengeID;
    }

    public Challenge(Integer challengeID, String name, String description) {
        this.challengeID = challengeID;
        this.name = name;
        this.description = description;
    }

    public Integer getChallengeID() {
        return challengeID;
    }

    public void setChallengeID(Integer challengeID) {
        this.challengeID = challengeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Team> getTeamList() {
        return teamList;
    }

    public void setTeamList(List<Team> teamList) {
        this.teamList = teamList;
    }

    public Sponsor getSponsor() {
        return sponsor;
    }

    public void setSponsor(Sponsor sponsor) {
        this.sponsor = sponsor;
    }

   

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (challengeID != null ? challengeID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Challenge)) {
            return false;
        }
        Challenge other = (Challenge) object;
        if ((this.challengeID == null && other.challengeID != null) || (this.challengeID != null && !this.challengeID.equals(other.challengeID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hackathon.data.Challenge[ challengeID=" + challengeID + " ]";
    }
    
}
