/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.RiwayatPendidikan;

/**
 *
 * @author Cuek3
 */
public interface RiwayatPendidikanDAO extends GeneralDAO{
    public RiwayatPendidikan getById(long id);
    public List<RiwayatPendidikan> getAll();
}
