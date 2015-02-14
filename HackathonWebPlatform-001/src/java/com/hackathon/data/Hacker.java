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
@Table(name = "hacker")
@NamedQueries({
    @NamedQuery(name = "Hacker.findAll", query = "SELECT h FROM Hacker h"),
    @NamedQuery(name = "Hacker.findByHackerID", query = "SELECT h FROM Hacker h WHERE h.hackerID = :hackerID"),
    @NamedQuery(name = "Hacker.findByFirstname", query = "SELECT h FROM Hacker h WHERE h.firstname = :firstname"),
    @NamedQuery(name = "Hacker.findByLastname", query = "SELECT h FROM Hacker h WHERE h.lastname = :lastname"),
    @NamedQuery(name = "Hacker.findByEmail", query = "SELECT h FROM Hacker h WHERE h.email = :email"),
    @NamedQuery(name = "Hacker.findByAddress", query = "SELECT h FROM Hacker h WHERE h.address = :address"),
    @NamedQuery(name = "Hacker.findByDateRegistered", query = "SELECT h FROM Hacker h WHERE h.dateRegistered = :dateRegistered")})
public class Hacker implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "hackerID")
    private Integer hackerID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "firstname")
    private String firstname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "lastname")
    private String lastname;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "address")
    private String address;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateRegistered")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateRegistered;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hacker")
    private List<Picture> pictureList;
    @JoinColumn(name = "skillID", referencedColumnName = "skillID")
    @ManyToOne(optional = false)
    private Skill skill;
    @JoinColumn(name = "teamID", referencedColumnName = "teamID")
    @ManyToOne(optional = false)
    private Team team;

    public Hacker() {
    }

    public Hacker(Integer hackerID) {
        this.hackerID = hackerID;
    }

    public Hacker(Integer hackerID, String firstname, String lastname, String email, String address, Date dateRegistered) {
        this.hackerID = hackerID;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.address = address;
        this.dateRegistered = dateRegistered;
    }

    public Integer getHackerID() {
        return hackerID;
    }

    public void setHackerID(Integer hackerID) {
        this.hackerID = hackerID;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(Date dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public List<Picture> getPictureList() {
        return pictureList;
    }

    public void setPictureList(List<Picture> pictureList) {
        this.pictureList = pictureList;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

  

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hackerID != null ? hackerID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hacker)) {
            return false;
        }
        Hacker other = (Hacker) object;
        if ((this.hackerID == null && other.hackerID != null) || (this.hackerID != null && !this.hackerID.equals(other.hackerID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hackathon.data.Hacker[ hackerID=" + hackerID + " ]";
    }
    
}
