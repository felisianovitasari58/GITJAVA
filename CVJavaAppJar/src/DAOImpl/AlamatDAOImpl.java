/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import DAO.AlamatDAO;
import java.util.List;
import model.Alamat;

/**
 *
 * @author Dell Inspiron
 */
public class AlamatDAOImpl extends GeneralDAOImpl implements AlamatDAO{

    public AlamatDAOImpl(){
        super();
    }
    
    @Override
    public Alamat getById(long id) {
        return em.find(Alamat.class, id);
    }

    @Override
    public List<Alamat> getAll() {
        return em.createQuery("from Alamat a").getResultList();
    }
    
}
