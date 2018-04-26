/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import DAO.LevelDAO;
import java.util.List;
import model.Level;

/**
 *
 * @author Dell Inspiron
 */
public class LevelDAOImpl extends GeneralDAOImpl implements LevelDAO{

    public LevelDAOImpl(){
        super();
    }
    
    @Override
    public Level getById(long id) {
        return em.find(Level.class, id);
    }

    @Override
    public List<Level> getAll() {
        return em.createQuery("from Level l").getResultList();
    }
    
}
