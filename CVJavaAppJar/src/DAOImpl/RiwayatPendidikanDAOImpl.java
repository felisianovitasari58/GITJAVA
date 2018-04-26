/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import DAO.RiwayatPendidikanDAO;
import java.util.List;
import model.RiwayatPendidikan;

/**
 *
 * @author Cuek3
 */
public class RiwayatPendidikanDAOImpl extends GeneralDAOImpl implements RiwayatPendidikanDAO{
    public RiwayatPendidikanDAOImpl(){
        super();
    }
    @Override
    public RiwayatPendidikan getById(long id) {
        return em.find(RiwayatPendidikan.class, id);
    }
    @Override
    public List<RiwayatPendidikan> getAll() {
        return em.createQuery("select * from RiwayatPendidikan rwytpen").getResultList();
    }
    
}
