/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.Bahasa;
import model.DataKontakDarurat;

/**
 *
 * @author Dell Inspiron
 */
public interface DataKontakDaruratDAO extends GeneralDAO{
    public DataKontakDarurat getById(long id);
    public List<DataKontakDarurat> getAll();
}
