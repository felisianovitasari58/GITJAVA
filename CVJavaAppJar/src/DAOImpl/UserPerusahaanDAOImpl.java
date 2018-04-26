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
    
}
