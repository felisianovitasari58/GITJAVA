/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.Agama;

/**
 *
 * @author Dell Inspiron
 */
public interface AgamaDAO extends GeneralDAO{
    public Agama getById(long id);
    public List<Agama> getAll();
}
