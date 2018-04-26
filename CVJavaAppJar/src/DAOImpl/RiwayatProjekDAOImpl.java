/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import DAO.RiwayatProjekDAO;
import java.util.List;
import model.RiwayatProjek;

/**
 *
 * @author Dell Inspiron
 */
public class RiwayatProjekDAOImpl extends GeneralDAOImpl implements RiwayatProjekDAO{

    public RiwayatProjekDAOImpl(){
        super();
    }
    
    @Override
    public RiwayatProjek getById(long id) {
        return em.find(RiwayatProjek.class, id);
    }

    @Override
    public List<RiwayatProjek> getAll() {
        return em.createQuery("from RiwayatProjek rp").getResultList();
    }
    
}
