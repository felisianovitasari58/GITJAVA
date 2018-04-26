/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import DAO.KaryawanDAO;
import DAO.UserKaryawannDAO;
import Helper.KaryawanHelper;
import Helper.userHelper;
import java.util.List;
import model.Karyawan;
import model.UserKaryawan;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dell Inspiron
 */
public class UserKaryawanDAOImplTest {
    
    public UserKaryawanDAOImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getById method, of class UserKaryawanDAOImpl.
     */
//    @Test
//    public void testGetById() {
//        System.out.println("getById");
//        long id = 1;
//        UserKaryawanDAOImpl instance = new UserKaryawanDAOImpl();
//        UserKaryawan expResult = null;
//        UserKaryawan result = instance.getById(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
    @Test
    public void testRegistrasi(){
        String username="novi";
        String password="Novi123";
        String repassword="Novi123";
        assertTrue(userHelper.cekPasswordConfPassword(password, repassword));
        UserKaryawan u= new UserKaryawan();
        KaryawanDAO kdao=new KaryawanDAOImpl();
        Karyawan k=kdao.getById(1);
        u.setUsernameK(username);
        u.setPasswordK(password);
        u.setKaryawan(k);
        UserKaryawannDAO udao=new UserKaryawanDAOImpl();
        udao.insert(u);
        List<UserKaryawan> list=udao.getAll();
        UserKaryawan expResult= new UserKaryawan();
        for (UserKaryawan result: list){
            if(u.getUsernameK()==result.getUsernameK()){
                expResult=result;
                break;
            }
        }
        assertSame(expResult, u);
    }

//    /**
//     * Test of getAll method, of class UserKaryawanDAOImpl.
//     */
//    @Test
//    public void testGetAll() {
//        System.out.println("getAll");
//        UserKaryawanDAOImpl instance = new UserKaryawanDAOImpl();
//        List<UserKaryawan> expResult = null;
//        List<UserKaryawan> result = instance.getAll();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getUsername method, of class UserKaryawanDAOImpl.
//     */
//    @Test
//    public void testGetUsername() {
//        System.out.println("getUsername");
//        Karyawan k = null;
//        UserKaryawanDAOImpl instance = new UserKaryawanDAOImpl();
//        String expResult = "";
//        String result = instance.getUsername(k);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * UseCase (kode berapa) gagal login
     */
    @Test
    public void testGetLogin() {
        System.out.println("getLogin");
        String userName = "adminn";
        String password = "adminadmin";
        UserKaryawanDAOImpl instance = new UserKaryawanDAOImpl();
//        UserKaryawan expResult = null;
        UserKaryawan result = instance.getLogin(userName, password);
        assertNull(result); 
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
