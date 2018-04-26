/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.Alamat;

/**
 *
 * @author Dell Inspiron
 */
public interface AlamatDAO extends GeneralDAO{
    public Alamat getById(long id);
    public List<Alamat> getAll();
}
