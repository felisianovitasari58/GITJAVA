/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import DAO.BahasaDAO;
import java.util.List;
import model.Bahasa;

/**
 *
 * @author Dell Inspiron
 */
public class BahasaDAOImpl extends GeneralDAOImpl implements BahasaDAO{

    public BahasaDAOImpl(){
        super();
    }
    
    @Override
    public Bahasa getById(long id) {
        return em.find(Bahasa.class, id);
    }

    @Override
    public List<Bahasa> getAll() {
        return em.createQuery("from Bahasa b").getResultList();
    }
    
}
