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

/**
 *
 * @author Dell Inspiron
 */
@Embeddable
public class KaryawanBahasaPK implements Serializable {
    @Basic(optional = false)
    @Column(insertable = false,updatable = false)
    private long idKaryawan;
    @Basic(optional = false)
    @Column(insertable = false,updatable = false)
    private long idBahasa;

    public KaryawanBahasaPK() {
    }

    public KaryawanBahasaPK(long idKaryawan, long idBahasa) {
        this.idKaryawan = idKaryawan;
        this.idBahasa = idBahasa;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idKaryawan;
        hash += (int) idBahasa;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KaryawanBahasaPK)) {
            return false;
        }
        KaryawanBahasaPK other = (KaryawanBahasaPK) object;
        if (this.idKaryawan != other.idKaryawan) {
            return false;
        }
        if (this.idBahasa != other.idBahasa) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.KaryawanSoftSkillPK[ idKaryawan=" + idKaryawan + ", idBahasa=" + idBahasa + " ]";
    }

    public long getIdKaryawan() {
        return idKaryawan;
    }

    public void setIdKaryawan(long idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    public long getIdBahasa() {
        return idBahasa;
    }

    public void setIdBahasa(long idBahasa) {
        this.idBahasa = idBahasa;
    }


}
