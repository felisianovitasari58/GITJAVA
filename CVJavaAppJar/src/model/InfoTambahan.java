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
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Dell Inspiron
 */
@Entity
public class InfoTambahan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne (optional = false)
    private Karyawan karyawan;
    @Basic (optional = false)
    @Column (nullable = false)
    private boolean kesediaanLuarKota;
    @Basic (optional = false)
    @Column (nullable = false)
    private boolean kesediaanFinance;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date expJoinDate;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date employeeNotice;
    @Basic (optional = false)
    @Column (nullable = false)
    private double expSalary;

    public Karyawan getKaryawan() {
        return karyawan;
    }

    public void setKaryawan(Karyawan karyawan) {
        this.karyawan = karyawan;
    }

    public boolean isKesediaanLuarKota() {
        return kesediaanLuarKota;
    }

    public void setKesediaanLuarKota(boolean kesediaanLuarKota) {
        this.kesediaanLuarKota = kesediaanLuarKota;
    }

    public boolean isKesediaanFinance() {
        return kesediaanFinance;
    }

    public void setKesediaanFinance(boolean kesediaanFinance) {
        this.kesediaanFinance = kesediaanFinance;
    }

    public Date getExpJoinDate() {
        return expJoinDate;
    }

    public void setExpJoinDate(Date expJoinDate) {
        this.expJoinDate = expJoinDate;
    }

    public Date getEmployeeNotice() {
        return employeeNotice;
    }

    public void setEmployeeNotice(Date employeeNotice) {
        this.employeeNotice = employeeNotice;
    }

    public double getExpSalary() {
        return expSalary;
    }

    public void setExpSalary(double expSalary) {
        this.expSalary = expSalary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InfoTambahan)) {
            return false;
        }
        InfoTambahan other = (InfoTambahan) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.InfoTambahan[ id=" + getId() + " ]";
    }
    
}
