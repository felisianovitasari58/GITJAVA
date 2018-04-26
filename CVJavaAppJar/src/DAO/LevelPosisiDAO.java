/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.Bahasa;
import model.LevelPosisi;

/**
 *
 * @author Dell Inspiron
 */
public interface LevelPosisiDAO extends GeneralDAO{
    public LevelPosisi getById(long id);
    public List<LevelPosisi> getAll();
}
