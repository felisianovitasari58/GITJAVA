/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import DAO.UserKaryawannDAO;
import java.util.List;
import model.Karyawan;
import model.UserKaryawan;

/**
 *
 * @author Dell Inspiron
 */
public class UserKaryawanDAOImpl extends GeneralDAOImpl implements UserKaryawannDAO{

    public UserKaryawanDAOImpl(){
        super();
    }
    
    @Override
    public UserKaryawan getById(long id) {
        return em.find(UserKaryawan.class, id);
    }

    @Override
    public List<UserKaryawan> getAll() {
        return em.createQuery("from UserKaryawan uk").getResultList();
    }

    @Override
    public String getUsername(Karyawan k) {
        return (String)em.createNativeQuery("select username from Karyawan where idKaryawan=?1").setParameter(1, k.getId()).getSingleResult();
    }

    @Override
    public UserKaryawan getLogin(String userName, String password) {
        UserKaryawan tes=null;
        try {
            tes=(UserKaryawan)em.createQuery("select u from UserKaryawan u where u.usernameK=?1 and u.passwordK=?2").setParameter(1,userName).setParameter(2, password).getSingleResult();
        } catch (Exception e) {
        }
        return tes;
    }
}
