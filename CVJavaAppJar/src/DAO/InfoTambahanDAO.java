/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.Bahasa;
import model.InfoTambahan;

/**
 *
 * @author Dell Inspiron
 */
public interface InfoTambahanDAO extends GeneralDAO{
    public InfoTambahan getById(long id);
    public List<InfoTambahan> getAll();
}
