/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Dell Inspiron
 */
@Entity
public class Wilayah implements Serializable {

    @OneToMany(mappedBy = "wilayah")
    private List<Alamat> alamats;

    @OneToMany(mappedBy = "parent")
    private List<Wilayah> wilayahs;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Basic(optional = false)
    @Column(nullable = false,length=30)
    private String namaWilayah;
    @Basic(optional = false)
    @Column(nullable = false)
    private LevelWilayah levelWilayah;
    @ManyToOne(optional = false)
    private Wilayah parent;

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
        if (!(object instanceof Wilayah)) {
            return false;
        }
        Wilayah other = (Wilayah) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Wilayah[ id=" + id + " ]";
    }

    public String getNamaWilayah() {
        return namaWilayah;
    }

    public void setNamaWilayah(String namaWilayah) {
        this.namaWilayah = namaWilayah;
    }

    public LevelWilayah getLevelWilayah() {
        return levelWilayah;
    }

    public void setLevelWilayah(LevelWilayah levelWilayah) {
        this.levelWilayah = levelWilayah;
    }

    public Wilayah getParent() {
        return parent;
    }

    public void setParent(Wilayah parent) {
        this.parent = parent;
    }

    public List<Wilayah> getWilayahs() {
        return wilayahs;
    }

    public void setWilayahs(List<Wilayah> wilayahs) {
        this.wilayahs = wilayahs;
    }
    
}
