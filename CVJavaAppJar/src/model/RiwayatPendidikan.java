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
 * @author Cuek3
 */
@Entity
public class RiwayatPendidikan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(optional = false)
    private Karyawan karyawan;
    @Basic(optional = false)
    @Column(nullable = false,length=40)
    private String namaInstitusi;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date thnMasuk;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date thnLulus;
    @Basic(optional = false)
    @Column(nullable = false)
    private double nilaiIpk;
    @Basic(optional = false)
    @Column(nullable = false,length=50)
    private String jurusan;
    @Basic(optional = false)
    @Column(nullable = false,length=100)
    private String ijazahPath;
    @Basic(optional = false)
    @Column(nullable = false,length=100)
    private String transkripPath;
    

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
        if (!(object instanceof RiwayatPendidikan)) {
            return false;
        }
        RiwayatPendidikan other = (RiwayatPendidikan) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.RiwayatPendidikan[ id=" + id + " ]";
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
     * @return the namaInstitusi
     */
    public String getNamaInstitusi() {
        return namaInstitusi;
    }

    /**
     * @param namaInstitusi the namaInstitusi to set
     */
    public void setNamaInstitusi(String namaInstitusi) {
        this.namaInstitusi = namaInstitusi;
    }

    /**
     * @return the thnMasuk
     */
    public Date getThnMasuk() {
        return thnMasuk;
    }

    /**
     * @param thnMasuk the thnMasuk to set
     */
    public void setThnMasuk(Date thnMasuk) {
        this.thnMasuk = thnMasuk;
    }

    /**
     * @return the thnLulus
     */
    public Date getThnLulus() {
        return thnLulus;
    }

    /**
     * @param thnLulus the thnLulus to set
     */
    public void setThnLulus(Date thnLulus) {
        this.thnLulus = thnLulus;
    }

    /**
     * @return the nilaiIpk
     */
    public double getNilaiIpk() {
        return nilaiIpk;
    }

    /**
     * @param nilaiIpk the nilaiIpk to set
     */
    public void setNilaiIpk(double nilaiIpk) {
        this.nilaiIpk = nilaiIpk;
    }

    /**
     * @return the jurusan
     */
    public String getJurusan() {
        return jurusan;
    }

    /**
     * @param jurusan the jurusan to set
     */
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    /**
     * @return the ijazahPath
     */
    public String getIjazahPath() {
        return ijazahPath;
    }

    /**
     * @param ijazahPath the ijazahPath to set
     */
    public void setIjazahPath(String ijazahPath) {
        this.ijazahPath = ijazahPath;
    }

    /**
     * @return the transkripPath
     */
    public String getTranskripPath() {
        return transkripPath;
    }

    /**
     * @param transkripPath the transkripPath to set
     */
    public void setTranskripPath(String transkripPath) {
        this.transkripPath = transkripPath;
    }
    
}
