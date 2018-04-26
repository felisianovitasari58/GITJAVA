/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import java.util.List;
import model.UserPerusahaan;
import DAO.UserPerusahaannDAO;

/**
 *
 * @author Dell Inspiron
 */
public class UserPerusahaanDAOImpl extends GeneralDAOImpl implements UserPerusahaannDAO{

    public UserPerusahaanDAOImpl(){
        super();
    }
    
    @Override
    public UserPerusahaan getById(long id) {
        return em.find(UserPerusahaan.class, id);
    }

    @Override
    public List<UserPerusahaan> getAll() {
        return em.createQuery("from UserPerusahaan up").getResultList();
    }

    @Override
   public UserPerusahaan getLogin(String userName, String password) {
        UserPerusahaan tes=null;
        try {
            tes=(UserPerusahaan)em.createQuery("select up from UserPerusahaan up where up.usernameP=?1 and up.passwordP=?2").setParameter(1,userName).setParameter(2, password).getSingleResult();
        } catch (Exception e) {
        }
        return tes;
    }
    
}
