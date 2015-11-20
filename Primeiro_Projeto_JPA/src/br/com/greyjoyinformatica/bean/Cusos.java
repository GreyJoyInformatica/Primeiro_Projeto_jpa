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
@Table(name = "cusos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cusos.findAll", query = "SELECT c FROM Cusos c"),
    @NamedQuery(name = "Cusos.findByIdCusos", query = "SELECT c FROM Cusos c WHERE c.idCusos = :idCusos"),
    @NamedQuery(name = "Cusos.findByNomeCurso", query = "SELECT c FROM Cusos c WHERE c.nomeCurso = :nomeCurso")})
public class Cusos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCusos")
    private Integer idCusos;
    @Column(name = "nomeCurso")
    private String nomeCurso;

    public Cusos() {
    }

    public Cusos(Integer idCusos) {
        this.idCusos = idCusos;
    }

    public Integer getIdCusos() {
        return idCusos;
    }

    public void setIdCusos(Integer idCusos) {
        this.idCusos = idCusos;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCusos != null ? idCusos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cusos)) {
            return false;
        }
        Cusos other = (Cusos) object;
        if ((this.idCusos == null && other.idCusos != null) || (this.idCusos != null && !this.idCusos.equals(other.idCusos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.greyjoyinformatica.bean.Cusos[ idCusos=" + idCusos + " ]";
    }
    
}
