/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Dell Inspiron
 */
@Entity
public class Bahasa implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bahasa", fetch = FetchType.LAZY)
    private List<KaryawanBahasa> karyawanBahasas;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic (optional = false)
    @Column (nullable = false, unique = true, length = 4)
    private String kodeBahasa;
    @Basic (optional = false)
    @Column (nullable = false, unique = true, length = 15)
    private String Bahasa;

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
        if (!(object instanceof Bahasa)) {
            return false;
        }
        Bahasa other = (Bahasa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Bahasa[ id=" + id + " ]";
    }

    public String getKodeBahasa() {
        return kodeBahasa;
    }

    public void setKodeBahasa(String kodeBahasa) {
        this.kodeBahasa = kodeBahasa;
    }

    public String getBahasa() {
        return Bahasa;
    }

    public void setBahasa(String Bahasa) {
        this.Bahasa = Bahasa;
    }
    
}
