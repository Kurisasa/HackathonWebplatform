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
@Table(name = "sponsor")
@NamedQueries({
    @NamedQuery(name = "Sponsor.findAll", query = "SELECT s FROM Sponsor s"),
    @NamedQuery(name = "Sponsor.findBySponsorID", query = "SELECT s FROM Sponsor s WHERE s.sponsorID = :sponsorID"),
    @NamedQuery(name = "Sponsor.findByName", query = "SELECT s FROM Sponsor s WHERE s.name = :name"),
    @NamedQuery(name = "Sponsor.findByEmail", query = "SELECT s FROM Sponsor s WHERE s.email = :email"),
    @NamedQuery(name = "Sponsor.findByDateRegistered", query = "SELECT s FROM Sponsor s WHERE s.dateRegistered = :dateRegistered")})
public class Sponsor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "sponsorID")
    private Integer sponsorID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "name")
    private String name;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateRegistered")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateRegistered;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sponsor")
    private List<Challenge> challengeList;

    public Sponsor() {
    }

    public Sponsor(Integer sponsorID) {
        this.sponsorID = sponsorID;
    }

    public Sponsor(Integer sponsorID, String name, String email, Date dateRegistered) {
        this.sponsorID = sponsorID;
        this.name = name;
        this.email = email;
        this.dateRegistered = dateRegistered;
    }

    public Integer getSponsorID() {
        return sponsorID;
    }

    public void setSponsorID(Integer sponsorID) {
        this.sponsorID = sponsorID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(Date dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public List<Challenge> getChallengeList() {
        return challengeList;
    }

    public void setChallengeList(List<Challenge> challengeList) {
        this.challengeList = challengeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sponsorID != null ? sponsorID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sponsor)) {
            return false;
        }
        Sponsor other = (Sponsor) object;
        if ((this.sponsorID == null && other.sponsorID != null) || (this.sponsorID != null && !this.sponsorID.equals(other.sponsorID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hackathon.data.Sponsor[ sponsorID=" + sponsorID + " ]";
    }
    
}
