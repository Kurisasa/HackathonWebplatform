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
@Table(name = "town")
@NamedQueries({
    @NamedQuery(name = "Town.findAll", query = "SELECT t FROM Town t"),
    @NamedQuery(name = "Town.findByTownID", query = "SELECT t FROM Town t WHERE t.townID = :townID"),
    @NamedQuery(name = "Town.findByName", query = "SELECT t FROM Town t WHERE t.name = :name"),
    @NamedQuery(name = "Town.findByLangitude", query = "SELECT t FROM Town t WHERE t.langitude = :langitude"),
    @NamedQuery(name = "Town.findByLatitude", query = "SELECT t FROM Town t WHERE t.latitude = :latitude")})
public class Town implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "townID")
    private Integer townID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "langitude")
    private double langitude;
    @Basic(optional = false)
    @NotNull
    @Column(name = "latitude")
    private double latitude;
    @JoinColumn(name = "cityID", referencedColumnName = "cityID")
    @ManyToOne(optional = false)
    private City city;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "town")
    private List<Hackathon> hackathonList;

    public Town() {
    }

    public Town(Integer townID) {
        this.townID = townID;
    }

    public Town(Integer townID, String name, double langitude, double latitude) {
        this.townID = townID;
        this.name = name;
        this.langitude = langitude;
        this.latitude = latitude;
    }

    public Integer getTownID() {
        return townID;
    }

    public void setTownID(Integer townID) {
        this.townID = townID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLangitude() {
        return langitude;
    }

    public void setLangitude(double langitude) {
        this.langitude = langitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<Hackathon> getHackathonList() {
        return hackathonList;
    }

    public void setHackathonList(List<Hackathon> hackathonList) {
        this.hackathonList = hackathonList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (townID != null ? townID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Town)) {
            return false;
        }
        Town other = (Town) object;
        if ((this.townID == null && other.townID != null) || (this.townID != null && !this.townID.equals(other.townID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hackathon.data.Town[ townID=" + townID + " ]";
    }
    
}
