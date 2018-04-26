/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;

import model.UserPerusahaan;

/**
 *
 * @author Dell Inspiron
 */
public interface UserPerusahaannDAO extends GeneralDAO{
    public UserPerusahaan getById(long id);
    public List<UserPerusahaan> getAll();
    public UserPerusahaan getLogin(String userName,String password);
}
