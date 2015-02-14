/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackathon.data;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author CodeTribe1
 */
@Entity
@Table(name = "picture")
@NamedQueries({
    @NamedQuery(name = "Picture.findAll", query = "SELECT p FROM Picture p"),
    @NamedQuery(name = "Picture.findByPictureID", query = "SELECT p FROM Picture p WHERE p.pictureID = :pictureID"),
    @NamedQuery(name = "Picture.findByUri", query = "SELECT p FROM Picture p WHERE p.uri = :uri")})
public class Picture implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pictureID")
    private Integer pictureID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "uri")
    private String uri;
    @JoinColumn(name = "hackerID", referencedColumnName = "hackerID")
    @ManyToOne(optional = false)
    private Hacker hacker;

    public Picture() {
    }

    public Picture(Integer pictureID) {
        this.pictureID = pictureID;
    }

    public Picture(Integer pictureID, String uri) {
        this.pictureID = pictureID;
        this.uri = uri;
    }

    public Integer getPictureID() {
        return pictureID;
    }

    public void setPictureID(Integer pictureID) {
        this.pictureID = pictureID;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Hacker getHacker() {
        return hacker;
    }

    public void setHacker(Hacker hacker) {
        this.hacker = hacker;
    }

   

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pictureID != null ? pictureID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Picture)) {
            return false;
        }
        Picture other = (Picture) object;
        if ((this.pictureID == null && other.pictureID != null) || (this.pictureID != null && !this.pictureID.equals(other.pictureID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hackathon.data.Picture[ pictureID=" + pictureID + " ]";
    }
    
}
