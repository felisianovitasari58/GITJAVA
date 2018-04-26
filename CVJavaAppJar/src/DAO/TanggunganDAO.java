/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.Bahasa;
import model.Tanggungan;

/**
 *
 * @author Dell Inspiron
 */
public interface TanggunganDAO extends GeneralDAO{
    public Tanggungan getById(long id);
    public List<Tanggungan> getAll();
}
