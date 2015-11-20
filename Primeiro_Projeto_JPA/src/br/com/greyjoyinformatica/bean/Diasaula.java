/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.greyjoyinformatica.bean;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Christian
 */
@Entity
@Table(name = "diasaula")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Diasaula.findAll", query = "SELECT d FROM Diasaula d"),
    @NamedQuery(name = "Diasaula.findByIdDiasAula", query = "SELECT d FROM Diasaula d WHERE d.idDiasAula = :idDiasAula"),
    @NamedQuery(name = "Diasaula.findByDiaAula", query = "SELECT d FROM Diasaula d WHERE d.diaAula = :diaAula")})
public class Diasaula implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDiasAula")
    private Integer idDiasAula;
    @Column(name = "diaAula")
    private String diaAula;

    public Diasaula() {
    }

    public Diasaula(Integer idDiasAula) {
        this.idDiasAula = idDiasAula;
    }

    public Integer getIdDiasAula() {
        return idDiasAula;
    }

    public void setIdDiasAula(Integer idDiasAula) {
        this.idDiasAula = idDiasAula;
    }

    public String getDiaAula() {
        return diaAula;
    }

    public void setDiaAula(String diaAula) {
        this.diaAula = diaAula;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDiasAula != null ? idDiasAula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Diasaula)) {
            return false;
        }
        Diasaula other = (Diasaula) object;
        if ((this.idDiasAula == null && other.idDiasAula != null) || (this.idDiasAula != null && !this.idDiasAula.equals(other.idDiasAula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.greyjoyinformatica.bean.Diasaula[ idDiasAula=" + idDiasAula + " ]";
    }
    
}
