/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Dell Inspiron
 */
@Entity
public class UserPerusahaan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic (optional = false)
    @Column (nullable = false, unique = true, length = 30)
    private String usernameP;
    @Basic (optional = false)
    @Column (nullable = false, length = 20)
    private String passwordP;
    @Basic (optional = false)
    @Column (nullable = false, length = 50)
    private String namaP;
    @Basic (optional = false)
    @Column (nullable = false, unique = true, length = 30)
    private String noHpP;
    @Basic (optional = false)
    @Column (nullable = false, unique = true, length = 40)
    private String emailP;

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
        if (!(object instanceof UserPerusahaan)) {
            return false;
        }
        UserPerusahaan other = (UserPerusahaan) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.UserPerusahaan[ id=" + id + " ]";
    }

    public String getUsernameP() {
        return usernameP;
    }

    public void setUsernameP(String usernameP) {
        this.usernameP = usernameP;
    }

    public String getPasswordP() {
        return passwordP;
    }

    public void setPasswordP(String passwordP) {
        this.passwordP = passwordP;
    }

    public String getNamaP() {
        return namaP;
    }

    public void setNamaP(String namaP) {
        this.namaP = namaP;
    }

    public String getNoHpP() {
        return noHpP;
    }

    public void setNoHpP(String noHpP) {
        this.noHpP = noHpP;
    }

    public String getEmailP() {
        return emailP;
    }

    public void setEmailP(String emailP) {
        this.emailP = emailP;
    }
    
}
