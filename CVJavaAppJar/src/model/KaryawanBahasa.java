/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
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
 * @author Dell Inspiron
 */
@Entity
public class KaryawanBahasa implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected KaryawanBahasaPK karyawanBahasaPK;
    @JoinColumn (name = "idKaryawan",referencedColumnName = "id")
    @ManyToOne (optional = false)
    private Karyawan karyawan;
    @JoinColumn (name = "idBahasa",referencedColumnName = "id")
    @ManyToOne (optional = false)
    private Bahasa bahasa;
    @Basic (optional = false)
    @Column (nullable = false,length = 40)
    private String levelSkillReading;
    @Basic (optional = false)
    @Column (nullable = false,length = 40)
    private String levelSkillWriting;
    @Basic (optional = false)
    @Column (nullable = false,length = 40)
    private String levelSkillListening;
    @Basic (optional = false)
    @Column (nullable = false,length = 40)
    private String levelSkillSpeaking;

    public KaryawanBahasa(){}

    public KaryawanBahasa( Karyawan karyawan, Bahasa bahasa) {
        this.karyawan = karyawan;
        this.bahasa = bahasa;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (karyawanBahasaPK != null ? karyawanBahasaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KaryawanBahasa)) {
            return false;
        }
        KaryawanBahasa other = (KaryawanBahasa) object;
        if ((this.karyawanBahasaPK == null && other.karyawanBahasaPK != null) || (this.karyawanBahasaPK != null && !this.karyawanBahasaPK.equals(other.karyawanBahasaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.KaryawanBahasa[ karyawanBahasaPK=" + karyawanBahasaPK + " ]";
    }

    public KaryawanBahasaPK getKaryawanSoftSkillPK() {
        return karyawanBahasaPK;
    }

    public void setKaryawanSoftSkillPK(KaryawanBahasaPK karyawanBahasaPK) {
        this.karyawanBahasaPK = karyawanBahasaPK;
    }

    public Karyawan getKaryawan() {
        return karyawan;
    }

    public void setKaryawan(Karyawan karyawan) {
        this.karyawan = karyawan;
    }

    public KaryawanBahasaPK getKaryawanBahasaPK() {
        return karyawanBahasaPK;
    }

    public void setKaryawanBahasaPK(KaryawanBahasaPK karyawanBahasaPK) {
        this.karyawanBahasaPK = karyawanBahasaPK;
    }

    public Bahasa getBahasa() {
        return bahasa;
    }

    public void setBahasa(Bahasa bahasa) {
        this.bahasa = bahasa;
    }

    public String getLevelSkillWriting() {
        return levelSkillWriting;
    }

    public void setLevelSkillWriting(String levelSkillWriting) {
        this.levelSkillWriting = levelSkillWriting;
    }

    public String getLevelSkillListening() {
        return levelSkillListening;
    }

    public void setLevelSkillListening(String levelSkillListening) {
        this.levelSkillListening = levelSkillListening;
    }

    public String getLevelSkillSpeaking() {
        return levelSkillSpeaking;
    }

    public void setLevelSkillSpeaking(String levelSkillSpeaking) {
        this.levelSkillSpeaking = levelSkillSpeaking;
    }

    public String getLevelSkillReading() {
        return levelSkillReading;
    }

    public void setLevelSkillReading(String levelSkillReading) {
        this.levelSkillReading = levelSkillReading;
    }

}
