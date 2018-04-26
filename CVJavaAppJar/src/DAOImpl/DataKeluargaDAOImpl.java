/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import DAO.DataKeluargaDAO;
import java.util.List;
import model.DataKeluarga;

/**
 *
 * @author Dell Inspiron
 */
public class DataKeluargaDAOImpl extends GeneralDAOImpl implements DataKeluargaDAO{

    public DataKeluargaDAOImpl(){
        super();
    }
    
    @Override
    public DataKeluarga getById(long id) {
        return em.find(DataKeluarga.class, id);
    }

    @Override
    public List<DataKeluarga> getAll() {
        return em.createQuery("from DataKeluarga dk").getResultList();
    }
    
}
