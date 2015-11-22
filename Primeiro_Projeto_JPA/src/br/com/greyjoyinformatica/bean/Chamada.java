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
@Table(name = "chamada")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Chamada.findAll", query = "SELECT c FROM Chamada c"),
    @NamedQuery(name = "Chamada.findByIdChamada", query = "SELECT c FROM Chamada c WHERE c.idChamada = :idChamada"),
    @NamedQuery(name = "Chamada.findByAlunoidAluno", query = "SELECT c FROM Chamada c WHERE c.alunoidAluno = :alunoidAluno"),
    @NamedQuery(name = "Chamada.findByPresente", query = "SELECT c FROM Chamada c WHERE c.presente = :presente")})
public class Chamada implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idChamada")
    private Integer idChamada;
    @Basic(optional = false)
    @Column(name = "Aluno_idAluno")
    private int alunoidAluno;
    @Column(name = "presente")
    private Boolean presente;
    @Column(name = "disciplinaIdDisciplina")
    private int disciplinaIdDisciplina;

    public Chamada() {
    }

    public Chamada(Integer idChamada) {
        this.idChamada = idChamada;
    }

    public Chamada(Integer idChamada, int alunoidAluno) {
        this.idChamada = idChamada;
        this.alunoidAluno = alunoidAluno;
    }

    public Integer getIdChamada() {
        return idChamada;
    }

    public void setIdChamada(Integer idChamada) {
        this.idChamada = idChamada;
    }

    public int getAlunoidAluno() {
        return alunoidAluno;
    }

    public void setAlunoidAluno(int alunoidAluno) {
        this.alunoidAluno = alunoidAluno;
    }

    public Boolean getPresente() {
        return presente;
    }

    public void setPresente(Boolean presente) {
        this.presente = presente;
    }

    public int getDisciplinaIdDisciplina() {
        return disciplinaIdDisciplina;
    }

    public void setDisciplinaIdDisciplina(int disciplinaIdDisciplina) {
        this.disciplinaIdDisciplina = disciplinaIdDisciplina;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idChamada != null ? idChamada.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Chamada)) {
            return false;
        }
        Chamada other = (Chamada) object;
        if ((this.idChamada == null && other.idChamada != null) || (this.idChamada != null && !this.idChamada.equals(other.idChamada))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.greyjoyinformatica.bean.Chamada[ idChamada=" + idChamada + " ]";
    }
    
}
