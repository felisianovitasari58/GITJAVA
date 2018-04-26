/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.KaryawanSkillTeknis;

/**
 *
 * @author Cuek3
 */
public interface KaryawanSkillTeknisDAO extends GeneralDAO{
    public KaryawanSkillTeknis getById(long id);
    public List<KaryawanSkillTeknis> getAll();
}
