/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.Bahasa;
import model.SkillTeknis;

/**
 *
 * @author Dell Inspiron
 */
public interface SkillTeknisDAO extends GeneralDAO{
    public SkillTeknis getById(long id);
    public List<SkillTeknis> getAll();
}
