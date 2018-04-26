/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import DAO.NegaraDAO;
import java.util.List;
import model.Negara;

/**
 *
 * @author Dell Inspiron
 */
public class NegaraDAOImpl extends GeneralDAOImpl implements NegaraDAO{

    public NegaraDAOImpl(){
        super();
    }
    
    @Override
    public Negara getById(long id) {
        return em.find(Negara.class, id);
    }

    @Override
    public List<Negara> getAll() {
        return em.createQuery("from Negara n").getResultList();
    }
    
}
