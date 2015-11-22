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
@Table(name = "matricula")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Matricula.findAll", query = "SELECT m FROM Matricula m"),
    @NamedQuery(name = "Matricula.findByIdMatricula", query = "SELECT m FROM Matricula m WHERE m.idMatricula = :idMatricula"),
    @NamedQuery(name = "Matricula.findByDisciplinaidDisciplina", query = "SELECT m FROM Matricula m WHERE m.disciplinaidDisciplina = :disciplinaidDisciplina"),
    @NamedQuery(name = "Matricula.findByAlunoidAluno", query = "SELECT m FROM Matricula m WHERE m.alunoidAluno = :alunoidAluno")})
public class Matricula implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idMatricula")
    private Integer idMatricula;
    @Basic(optional = false)
    @Column(name = "Disciplina_idDisciplina")
    private int disciplinaidDisciplina;
    @Basic(optional = false)
    @Column(name = "Aluno_idAluno")
    private int alunoidAluno;

    public Matricula() {
    }

    public Matricula(Integer idMatricula) {
        this.idMatricula = idMatricula;
    }

    public Matricula(Integer idMatricula, int disciplinaidDisciplina, int alunoidAluno) {
        this.idMatricula = idMatricula;
        this.disciplinaidDisciplina = disciplinaidDisciplina;
        this.alunoidAluno = alunoidAluno;
    }

    public Integer getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(Integer idMatricula) {
        this.idMatricula = idMatricula;
    }

    public int getDisciplinaidDisciplina() {
        return disciplinaidDisciplina;
    }

    public void setDisciplinaidDisciplina(int disciplinaidDisciplina) {
        this.disciplinaidDisciplina = disciplinaidDisciplina;
    }

    public int getAlunoidAluno() {
        return alunoidAluno;
    }

    public void setAlunoidAluno(int alunoidAluno) {
        this.alunoidAluno = alunoidAluno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMatricula != null ? idMatricula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Matricula)) {
            return false;
        }
        Matricula other = (Matricula) object;
        if ((this.idMatricula == null && other.idMatricula != null) || (this.idMatricula != null && !this.idMatricula.equals(other.idMatricula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return String.valueOf(getAlunoidAluno());
    }
    
}
