/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.Bahasa;

/**
 *
 * @author Dell Inspiron
 */
public interface BahasaDAO extends GeneralDAO{
    public Bahasa getById(long id);
    public List<Bahasa> getAll();
}