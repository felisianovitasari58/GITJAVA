/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author 
 */
@Embeddable
public class KaryawanSkillTeknisPK implements Serializable {

    @Basic(optional = false)
    @Column (insertable = false,updatable = false)
    private long idKaryawan;

    @Basic(optional = false)
    @Column (insertable = false,updatable = false)
    private long idSkillTeknis;

    public KaryawanSkillTeknisPK(long idKaryawan, long idSkillTeknis) {
        this.idKaryawan = idKaryawan;
        this.idSkillTeknis = idSkillTeknis;
    }
    
    
    public KaryawanSkillTeknisPK(){
    
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) getIdKaryawan();
        hash += (int) getIdSkillTeknis();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KaryawanSkillTeknisPK)) {
            return false;
        }
        KaryawanSkillTeknisPK other = (KaryawanSkillTeknisPK) object;
        if (this.getIdKaryawan()!=other.getIdKaryawan()) {
            return false;
        }
        if (this.getIdSkillTeknis()!=other.getIdSkillTeknis()) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.KaryawanSkillTeknisPK[ idKaryawan=" + getIdKaryawan()  + ", idSkillTeknis="+ getIdSkillTeknis() +" ]";
    }

    /**
     * @return the idSkillTeknis
     */
    public long getIdSkillTeknis() {
        return idSkillTeknis;
    }

    /**
     * @param idSkillTeknis the idSkillTeknis to set
     */
    public void setIdSkillTeknis(long idSkillTeknis) {
        this.idSkillTeknis = idSkillTeknis;
    }

    /**
     * @return the idKaryawan
     */
    public long getIdKaryawan() {
        return idKaryawan;
    }

    /**
     * @param idKaryawan the idKaryawan to set
     */
    public void setIdKaryawan(long idKaryawan) {
        this.idKaryawan = idKaryawan;
    }
    
}
