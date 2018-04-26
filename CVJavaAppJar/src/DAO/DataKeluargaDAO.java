/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.Bahasa;
import model.DataKeluarga;

/**
 *
 * @author Dell Inspiron
 */
public interface DataKeluargaDAO extends GeneralDAO{
    public DataKeluarga getById(long id);
    public List<DataKeluarga> getAll();
}
