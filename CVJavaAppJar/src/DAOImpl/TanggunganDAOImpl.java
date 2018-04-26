/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import DAO.TanggunganDAO;
import java.util.List;
import model.Tanggungan;

/**
 *
 * @author Dell Inspiron
 */
public class TanggunganDAOImpl extends GeneralDAOImpl implements TanggunganDAO{

    public TanggunganDAOImpl(){
        super();
    }
    
    @Override
    public Tanggungan getById(long id) {
        return em.find(Tanggungan.class, id);
    }

    @Override
    public List<Tanggungan> getAll() {
        return em.createQuery("from Tanggungan t").getResultList();
    }
    
}
