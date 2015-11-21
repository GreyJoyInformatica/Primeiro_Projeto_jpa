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
@Table(name = "cursos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cursos.findAll", query = "SELECT c FROM Cursos c"),
    @NamedQuery(name = "Cursos.findByIdCursos", query = "SELECT c FROM Cursos c WHERE c.idCursos = :idCursos"),
    @NamedQuery(name = "Cursos.findByNomeCurso", query = "SELECT c FROM Cursos c WHERE c.nomeCurso = :nomeCurso")})
public class Cursos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCursos")
    private Integer idCursos;
    @Column(name = "nomeCurso")
    private String nomeCurso;

    public Cursos() {
    }

    public Cursos(Integer idCursos) {
        this.idCursos = idCursos;
    }

    public Integer getIdCursos() {
        return idCursos;
    }

    public void setIdCursos(Integer idCursos) {
        this.idCursos = idCursos;
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
        hash += (idCursos != null ? idCursos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cursos)) {
            return false;
        }
        Cursos other = (Cursos) object;
        if ((this.idCursos == null && other.idCursos != null) || (this.idCursos != null && !this.idCursos.equals(other.idCursos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getNomeCurso();
    }
    
}
