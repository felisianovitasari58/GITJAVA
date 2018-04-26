/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import DAO.SkillTeknisDAO;
import java.util.List;
import model.SkillTeknis;

/**
 *
 * @author Dell Inspiron
 */
public class SkillTeknisDAOImpl extends GeneralDAOImpl implements SkillTeknisDAO{

    public SkillTeknisDAOImpl(){
        super();
    }
    
    @Override
    public SkillTeknis getById(long id) {
        return em.find(SkillTeknis.class, id);
    }

    @Override
    public List<SkillTeknis> getAll() {
        return em.createQuery("from SkillTeknis st").getResultList();
    }
    
}
