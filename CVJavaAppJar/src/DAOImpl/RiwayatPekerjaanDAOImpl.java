/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import DAO.RiwayatPekerjaanDAO;
import java.util.List;
import model.RiwayatPekerjaan;

/**
 *
 * @author Cuek3
 */
public class RiwayatPekerjaanDAOImpl extends GeneralDAOImpl implements RiwayatPekerjaanDAO{
     public RiwayatPekerjaanDAOImpl(){
        super();
    }
    @Override
    public RiwayatPekerjaan getById(long id) {
        return em.find(RiwayatPekerjaan.class, id);
    }

    @Override
    public List<RiwayatPekerjaan> getAll() {
        return em.createQuery("select * from RiwayatPekerjaan rwytker").getResultList();
    }
    
}
