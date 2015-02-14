/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackathon.data;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "hackimage")
@NamedQueries({
    @NamedQuery(name = "Hackimage.findAll", query = "SELECT h FROM Hackimage h"),
    @NamedQuery(name = "Hackimage.findByHackImageID", query = "SELECT h FROM Hackimage h WHERE h.hackImageID = :hackImageID"),
    @NamedQuery(name = "Hackimage.findByDateTaken", query = "SELECT h FROM Hackimage h WHERE h.dateTaken = :dateTaken"),
    @NamedQuery(name = "Hackimage.findByFilename", query = "SELECT h FROM Hackimage h WHERE h.filename = :filename")})
public class Hackimage implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "hackImageID")
    private Integer hackImageID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateTaken")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTaken;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "filename")
    private String filename;
    @JoinColumn(name = "hackathonID", referencedColumnName = "hackathonID")
    @ManyToOne(optional = false)
    private Hackathon hackathon;

    public Hackimage() {
    }

    public Hackimage(Integer hackImageID) {
        this.hackImageID = hackImageID;
    }

    public Hackimage(Integer hackImageID, Date dateTaken, String filename) {
        this.hackImageID = hackImageID;
        this.dateTaken = dateTaken;
        this.filename = filename;
    }

    public Integer getHackImageID() {
        return hackImageID;
    }

    public void setHackImageID(Integer hackImageID) {
        this.hackImageID = hackImageID;
    }

    public Date getDateTaken() {
        return dateTaken;
    }

    public void setDateTaken(Date dateTaken) {
        this.dateTaken = dateTaken;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Hackathon getHackathon() {
        return hackathon;
    }

    public void setHackathon(Hackathon hackathon) {
        this.hackathon = hackathon;
    }

   

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hackImageID != null ? hackImageID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hackimage)) {
            return false;
        }
        Hackimage other = (Hackimage) object;
        if ((this.hackImageID == null && other.hackImageID != null) || (this.hackImageID != null && !this.hackImageID.equals(other.hackImageID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hackathon.data.Hackimage[ hackImageID=" + hackImageID + " ]";
    }
    
}
