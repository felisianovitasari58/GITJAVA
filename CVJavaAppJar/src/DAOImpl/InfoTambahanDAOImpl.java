/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import DAO.InfoTambahanDAO;
import java.util.List;
import model.InfoTambahan;

/**
 *
 * @author Dell Inspiron
 */
public class InfoTambahanDAOImpl extends GeneralDAOImpl implements InfoTambahanDAO{

    public InfoTambahanDAOImpl(){
        super();
    }
    
    @Override
    public InfoTambahan getById(long id) {
        return em.find(InfoTambahan.class, id);
    }

    @Override
    public List<InfoTambahan> getAll() {
        return em.createQuery("from InfoTambahan it").getResultList();
    }
    
}
