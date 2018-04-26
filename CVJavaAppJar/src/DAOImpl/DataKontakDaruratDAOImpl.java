/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import DAO.DataKontakDaruratDAO;
import java.util.List;
import model.DataKontakDarurat;

/**
 *
 * @author Dell Inspiron
 */
public class DataKontakDaruratDAOImpl extends GeneralDAOImpl implements DataKontakDaruratDAO{

    public DataKontakDaruratDAOImpl(){
        super();
    }
    
    @Override
    public DataKontakDarurat getById(long id) {
        return em.find(DataKontakDarurat.class, id);
    }

    @Override
    public List<DataKontakDarurat> getAll() {
        return em.createQuery("from DataKontakDarurat dk").getResultList();
    }
    
}
