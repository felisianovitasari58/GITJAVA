/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import DAO.SertifikasiTrainingDAO;
import java.util.List;
import model.SertifikasiTraining;

/**
 *
 * @author Dell Inspiron
 */
public class SertifikasiTrainingDAOImpl extends GeneralDAOImpl implements SertifikasiTrainingDAO{

    public SertifikasiTrainingDAOImpl(){
        super();
    }
    
    @Override
    public SertifikasiTraining getById(long id) {
        return em.find(SertifikasiTraining.class, id);
    }

    @Override
    public List<SertifikasiTraining> getAll() {
        return em.createQuery("from SertifikasiTraining st").getResultList();
    }
    
}
