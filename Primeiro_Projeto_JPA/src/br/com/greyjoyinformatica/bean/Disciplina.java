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
@Table(name = "disciplina")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Disciplina.findAll", query = "SELECT d FROM Disciplina d"),
    @NamedQuery(name = "Disciplina.findByIdDisciplina", query = "SELECT d FROM Disciplina d WHERE d.idDisciplina = :idDisciplina"),
    @NamedQuery(name = "Disciplina.findByDiasAulaidDiasAula", query = "SELECT d FROM Disciplina d WHERE d.diasAulaidDiasAula = :diasAulaidDiasAula"),
    @NamedQuery(name = "Disciplina.findByCusosidCusos", query = "SELECT d FROM Disciplina d WHERE d.cusosidCusos = :cusosidCusos"),
    @NamedQuery(name = "Disciplina.findByNomeDisciplina", query = "SELECT d FROM Disciplina d WHERE d.nomeDisciplina = :nomeDisciplina")})
public class Disciplina implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDisciplina")
    private Integer idDisciplina;
    @Basic(optional = false)
    @Column(name = "DiasAula_idDiasAula")
    private int diasAulaidDiasAula;
    @Basic(optional = false)
    @Column(name = "Cusos_idCusos")
    private int cusosidCusos;
    @Column(name = "nomeDisciplina")
    private String nomeDisciplina;

    public Disciplina() {
    }

    public Disciplina(Integer idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public Disciplina(Integer idDisciplina, int diasAulaidDiasAula, int cusosidCusos) {
        this.idDisciplina = idDisciplina;
        this.diasAulaidDiasAula = diasAulaidDiasAula;
        this.cusosidCusos = cusosidCusos;
    }

    public Integer getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(Integer idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public int getDiasAulaidDiasAula() {
        return diasAulaidDiasAula;
    }

    public void setDiasAulaidDiasAula(int diasAulaidDiasAula) {
        this.diasAulaidDiasAula = diasAulaidDiasAula;
    }

    public int getCusosidCusos() {
        return cusosidCusos;
    }

    public void setCusosidCusos(int cusosidCusos) {
        this.cusosidCusos = cusosidCusos;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDisciplina != null ? idDisciplina.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Disciplina)) {
            return false;
        }
        Disciplina other = (Disciplina) object;
        if ((this.idDisciplina == null && other.idDisciplina != null) || (this.idDisciplina != null && !this.idDisciplina.equals(other.idDisciplina))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.greyjoyinformatica.bean.Disciplina[ idDisciplina=" + idDisciplina + " ]";
    }
    
}
