/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Dell Inspiron
 */
public class DBConnection {
    public static EntityManager getConnection(){
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("CVJavaAppJarPU");
        EntityManager em= emf.createEntityManager();
        if(em!=null)
            System.out.println("sukses");
        return em;
    }
}
