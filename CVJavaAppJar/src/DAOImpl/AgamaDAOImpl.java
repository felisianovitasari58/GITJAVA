/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import DAO.AgamaDAO;
import java.util.List;
import model.Agama;

/**
 *
 * @author Dell Inspiron
 */
public class AgamaDAOImpl extends GeneralDAOImpl implements AgamaDAO{

    public AgamaDAOImpl(){
        super();
    }
    
    @Override
    public Agama getById(long id) {
        return em.find(Agama.class, id);
    }

    @Override
    public List<Agama> getAll() {
        return em.createQuery("from Agama a").getResultList();
    }
    
}
