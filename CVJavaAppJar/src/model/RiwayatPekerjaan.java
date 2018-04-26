/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author Cuek3
 */
@Entity
public class RiwayatPekerjaan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Karyawan karyawan;
    private String namaPerusahaan;
    private String posisi;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tglMasuk;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tglKeluar;
    private String alasanPindah;
    private boolean statusCurrent;
    private String namaRef;
    private String notelpRef;
    private String emailRef;
    private String jabatanRef;
    private String referenceLetterPath;

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
        if (!(object instanceof RiwayatPekerjaan)) {
            return false;
        }
        RiwayatPekerjaan other = (RiwayatPekerjaan) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.RiwayatPekerjaan[ id=" + id + " ]";
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
     * @return the namaPerusahaan
     */
    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }

    /**
     * @param namaPerusahaan the namaPerusahaan to set
     */
    public void setNamaPerusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
    }

    /**
     * @return the posisi
     */
    public String getPosisi() {
        return posisi;
    }

    /**
     * @param posisi the posisi to set
     */
    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    /**
     * @return the tglMasuk
     */
    public Date getTglMasuk() {
        return tglMasuk;
    }

    /**
     * @param tglMasuk the tglMasuk to set
     */
    public void setTglMasuk(Date tglMasuk) {
        this.tglMasuk = tglMasuk;
    }

    /**
     * @return the tglKeluar
     */
    public Date getTglKeluar() {
        return tglKeluar;
    }

    /**
     * @param tglKeluar the tglKeluar to set
     */
    public void setTglKeluar(Date tglKeluar) {
        this.tglKeluar = tglKeluar;
    }

    /**
     * @return the alasanPindah
     */
    public String getAlasanPindah() {
        return alasanPindah;
    }

    /**
     * @param alasanPindah the alasanPindah to set
     */
    public void setAlasanPindah(String alasanPindah) {
        this.alasanPindah = alasanPindah;
    }

    /**
     * @return the statusCurrent
     */
    public boolean isStatusCurrent() {
        return statusCurrent;
    }

    /**
     * @param statusCurrent the statusCurrent to set
     */
    public void setStatusCurrent(boolean statusCurrent) {
        this.statusCurrent = statusCurrent;
    }

    /**
     * @return the namaRef
     */
    public String getNamaRef() {
        return namaRef;
    }

    /**
     * @param namaRef the namaRef to set
     */
    public void setNamaRef(String namaRef) {
        this.namaRef = namaRef;
    }

    /**
     * @return the notelpRef
     */
    public String getNotelpRef() {
        return notelpRef;
    }

    /**
     * @param notelpRef the notelpRef to set
     */
    public void setNotelpRef(String notelpRef) {
        this.notelpRef = notelpRef;
    }

    /**
     * @return the emailRef
     */
    public String getEmailRef() {
        return emailRef;
    }

    /**
     * @param emailRef the emailRef to set
     */
    public void setEmailRef(String emailRef) {
        this.emailRef = emailRef;
    }

    /**
     * @return the jabatanRef
     */
    public String getJabatanRef() {
        return jabatanRef;
    }

    /**
     * @param jabatanRef the jabatanRef to set
     */
    public void setJabatanRef(String jabatanRef) {
        this.jabatanRef = jabatanRef;
    }

    /**
     * @return the referenceLetterPath
     */
    public String getReferenceLetterPath() {
        return referenceLetterPath;
    }

    /**
     * @param referenceLetterPath the referenceLetterPath to set
     */
    public void setReferenceLetterPath(String referenceLetterPath) {
        this.referenceLetterPath = referenceLetterPath;
    }
    
}
