/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.Karyawan;
import model.UserKaryawan;

/**
 *
 * @author Dell Inspiron
 */
public interface UserKaryawannDAO extends GeneralDAO{
    public UserKaryawan getById(long id);
    public List<UserKaryawan> getAll();
    public String getUsername(Karyawan k);
    public UserKaryawan getLogin(String userName,String password);
}
