/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.KaryawanBahasa;

/**
 *
 * @author Dell Inspiron
 */
public interface KaryawanBahasaDAO extends GeneralDAO{
    public KaryawanBahasa getById(long idKaryawan,long idBahasa);
    public List<KaryawanBahasa> getAll();
}