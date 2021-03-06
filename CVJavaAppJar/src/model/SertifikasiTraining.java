/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Dell Inspiron
 */
@Entity
public class SertifikasiTraining implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(optional = false)
    private Karyawan karyawan;
    @Basic(optional = false)
    @Column(nullable = false,length=50)
    private String kegiatan;
    @Basic(optional = false)
    @Column(nullable = false,length=30)
    private String nomorSertifikat;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tglKegiatan;
    @Basic(optional = false)
    @Column(nullable = false,length=100)
    private String sertifikatPath;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SertifikasiTraining)) {
            return false;
        }
        SertifikasiTraining other = (SertifikasiTraining) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.SertifikasiTraining[ id=" + id + " ]";
    }

    public Karyawan getKaryawan() {
        return karyawan;
    }

    public void setKaryawan(Karyawan karyawan) {
        this.karyawan = karyawan;
    }

    public String getKegiatan() {
        return kegiatan;
    }

    public void setKegiatan(String kegiatan) {
        this.kegiatan = kegiatan;
    }

    public Date getTglKegiatan() {
        return tglKegiatan;
    }

    public void setTglKegiatan(Date tglKegiatan) {
        this.tglKegiatan = tglKegiatan;
    }

    public String getSertifikatPath() {
        return sertifikatPath;
    }

    public void setSertifikatPath(String sertifikatPath) {
        this.sertifikatPath = sertifikatPath;
    }
    
}
