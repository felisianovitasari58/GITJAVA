/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import DAO.CatatanHRDAO;
import java.util.List;
import model.CatatanHR;


/**
 *
 * @author Cuek3
 */
public class CatatanHRDAOImpl extends GeneralDAOImpl implements CatatanHRDAO{
    public CatatanHRDAOImpl(){
        super();
    }
    @Override
    public CatatanHR getById(long id) {
        return em.find(CatatanHR.class, id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CatatanHR> getAll() {
        return em.createQuery("select * from CatatanHR catHR").getResultList();//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CatatanHR> getByName(String nama) {
        return em.createNativeQuery("select * from CatatanHR c join Karyawan k on k.id=c.idKaryawan where k.namaLengkap like 1?").setParameter(1, nama).getResultList();
    }
    
}
