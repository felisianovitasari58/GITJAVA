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
public class DataKeluarga implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne (optional = false)
    private Karyawan karyawan;
    @Basic (optional = false)
    @Column (nullable = false,length = 50)
    private String hubungan;
    @Basic (optional = false)
    @Column (nullable = false,length = 100)
    private String namaLengkap;
    @Basic (optional = false)
    @Column (nullable = false,length = 50)
    private String tempatLahir;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tglLahir;
    @Basic (optional = false)
    @Column (nullable = false,length = 100)
    private String pendididkanTerakhir;
    @Basic (optional = false)
    @Column (nullable = false,length = 100)
    private String pekerjaan;

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
        if (!(object instanceof DataKeluarga)) {
            return false;
        }
        DataKeluarga other = (DataKeluarga) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.DataKeluarga[ id=" + id + " ]";
    }

    public Karyawan getKaryawan() {
        return karyawan;
    }

    public void setKaryawan(Karyawan karyawan) {
        this.karyawan = karyawan;
    }

    public String getHubungan() {
        return hubungan;
    }

    public void setHubungan(String hubungan) {
        this.hubungan = hubungan;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public Date getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(Date tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String getPendididkanTerakhir() {
        return pendididkanTerakhir;
    }

    public void setPendididkanTerakhir(String pendididkanTerakhir) {
        this.pendididkanTerakhir = pendididkanTerakhir;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }
    
}
