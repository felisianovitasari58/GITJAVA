/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Cuek3
 */
@Entity
public class KaryawanSkillTeknis implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected KaryawanSkillTeknisPK karyawanSkillTeknisPK;
    @JoinColumn(name = "idKaryawan",referencedColumnName = "id")
    @ManyToOne (optional = false)
    private Karyawan karyawan;
    
    @JoinColumn(name = "idSkillTeknis",referencedColumnName = "id")
    @ManyToOne (optional = false)
    private SkillTeknis skillTeknis;
    private String levelSkill;
    
    public KaryawanSkillTeknis(){}

    public KaryawanSkillTeknis(Karyawan karyawan, SkillTeknis skillTeknis) {
        this.karyawan = karyawan;
        this.skillTeknis = skillTeknis;
    }
    
    public KaryawanSkillTeknisPK getKaryawanSkillTeknisPK() {
        return karyawanSkillTeknisPK;
    }

    public void setKaryawanSkillTeknisPK(KaryawanSkillTeknisPK karyawanSkillTeknisPK) {
        this.karyawanSkillTeknisPK = karyawanSkillTeknisPK;
    }

    public String getLevelSkill() {
        return levelSkill;
    }

    public void setLevelSkill(String levelSkill) {
        this.levelSkill = levelSkill;
    }

  

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (karyawanSkillTeknisPK != null ? karyawanSkillTeknisPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KaryawanSkillTeknis)) {
            return false;
        }
        KaryawanSkillTeknis other = (KaryawanSkillTeknis) object;
        if ((this.karyawanSkillTeknisPK == null && other.karyawanSkillTeknisPK != null) || (this.karyawanSkillTeknisPK != null && !this.karyawanSkillTeknisPK.equals(other.karyawanSkillTeknisPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.KaryawanSkillTeknis[ karyawanSkillTeknisPK=" + karyawanSkillTeknisPK + " ]";
    }

    /**
     * @return the karyawan
     */
    public Karyawan getKaryawan() {
        return karyawan;
    }

    /**
     * @param karyawan the karyawan to set
     */
    public void setKaryawan(Karyawan karyawan) {
        this.karyawan = karyawan;
    }

    /**
     * @return the skillTeknis
     */
    public SkillTeknis getSkillTeknis() {
        return skillTeknis;
    }

    /**
     * @param skillTeknis the skillTeknis to set
     */
    public void setSkillTeknis(SkillTeknis skillTeknis) {
        this.skillTeknis = skillTeknis;
    }

    /**
     * @return the level
     */
    
    
}
