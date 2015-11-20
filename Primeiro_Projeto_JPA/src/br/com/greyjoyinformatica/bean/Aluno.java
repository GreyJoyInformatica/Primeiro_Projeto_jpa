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
@Table(name = "aluno")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Aluno.findAll", query = "SELECT a FROM Aluno a"),
    @NamedQuery(name = "Aluno.findByIdAluno", query = "SELECT a FROM Aluno a WHERE a.idAluno = :idAluno"),
    @NamedQuery(name = "Aluno.findByNomeAluno", query = "SELECT a FROM Aluno a WHERE a.nomeAluno = :nomeAluno"),
    @NamedQuery(name = "Aluno.findByEmailAluno", query = "SELECT a FROM Aluno a WHERE a.emailAluno = :emailAluno"),
    @NamedQuery(name = "Aluno.findByMatriculaAluno", query = "SELECT a FROM Aluno a WHERE a.matriculaAluno = :matriculaAluno")})
public class Aluno implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idAluno")
    private Integer idAluno;
    @Column(name = "nomeAluno")
    private String nomeAluno;
    @Column(name = "emailAluno")
    private String emailAluno;
    @Column(name = "matriculaAluno")
    private String matriculaAluno;

    public Aluno() {
    }

    public Aluno(Integer idAluno) {
        this.idAluno = idAluno;
    }

    public Integer getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(Integer idAluno) {
        this.idAluno = idAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getEmailAluno() {
        return emailAluno;
    }

    public void setEmailAluno(String emailAluno) {
        this.emailAluno = emailAluno;
    }

    public String getMatriculaAluno() {
        return matriculaAluno;
    }

    public void setMatriculaAluno(String matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAluno != null ? idAluno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aluno)) {
            return false;
        }
        Aluno other = (Aluno) object;
        if ((this.idAluno == null && other.idAluno != null) || (this.idAluno != null && !this.idAluno.equals(other.idAluno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.greyjoyinformatica.bean.Aluno[ idAluno=" + idAluno + " ]";
    }
    
}
