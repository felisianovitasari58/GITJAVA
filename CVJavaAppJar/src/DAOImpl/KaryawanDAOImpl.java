/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import DAO.KaryawanDAO;
import java.util.List;
import model.Karyawan;

/**
 *
 * @author Dell Inspiron
 */
public class KaryawanDAOImpl extends GeneralDAOImpl implements KaryawanDAO{

    public KaryawanDAOImpl(){
        super();
    }
    
    @Override
    public Karyawan getById(long id) {
        return em.find(Karyawan.class, id);
    }

    @Override
    public List<Karyawan> getAll() {
        return em.createQuery("from Karyawan k").getResultList();
    }

    @Override
    public List<Karyawan> getByKsediaanLK() {
        return em.createQuery("from Karyawan k").getResultList();
    }
    
}
