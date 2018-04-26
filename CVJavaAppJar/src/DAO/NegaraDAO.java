/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.Bahasa;
import model.Negara;

/**
 *
 * @author Dell Inspiron
 */
public interface NegaraDAO extends GeneralDAO{
    public Negara getById(long id);
    public List<Negara> getAll();
}
