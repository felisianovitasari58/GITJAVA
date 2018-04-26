/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import DAO.LevelPosisiDAO;
import java.util.List;
import model.LevelPosisi;

/**
 *
 * @author Dell Inspiron
 */
public class LevelPosisiDAOImpl extends GeneralDAOImpl implements LevelPosisiDAO{

    public LevelPosisiDAOImpl(){
        super();
    }
    
    @Override
    public LevelPosisi getById(long id) {
        return em.find(LevelPosisi.class, id);
    }

    @Override
    public List<LevelPosisi> getAll() {
        return em.createQuery("from LevelPosisi lp").getResultList();
    }
    
}
