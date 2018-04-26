/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
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
public class SkillTeknis implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "skillTeknis", fetch = FetchType.LAZY)
    private List<KaryawanSkillTeknis> karyawanSkillTekniss;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String skillTeknis;

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
        if (!(object instanceof SkillTeknis)) {
            return false;
        }
        SkillTeknis other = (SkillTeknis) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.SkillTeknis[ id=" + id + " ]";
    }

    public String getSkillTeknis() {
        return skillTeknis;
    }

    public void setSkillTeknis(String skillTeknis) {
        this.skillTeknis = skillTeknis;
    }
    
}
