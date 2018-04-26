/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import DAO.KaryawanDAO;
import DAO.UserKaryawannDAO;
import DAO.UserPerusahaannDAO;
import Helper.KaryawanHelper;
import Helper.userHelper;
import java.util.List;
import model.Karyawan;
import model.UserKaryawan;
import model.UserPerusahaan;
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
public class UserPerusahaanDAOImplTest {
    
    public UserPerusahaanDAOImplTest() {
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
     * Test of getById method, of class UserPerusahaanDAOImpl.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        long id = 0L;
        UserPerusahaanDAOImpl instance = new UserPerusahaanDAOImpl();
        UserPerusahaan expResult = null;
        UserPerusahaan result = instance.getById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class UserPerusahaanDAOImpl.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        UserPerusahaanDAOImpl instance = new UserPerusahaanDAOImpl();
        List<UserPerusahaan> expResult = null;
        List<UserPerusahaan> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    public void testRegistrasi(){
        String username="novi";
        String password="Novi123";
        String repassword="Novi123";
        String nama="novi";
        String noHp="0812232312";
        String email="felisianovitasas@yahoo.co.id";
        assertTrue(userHelper.cekPasswordConfPassword(password, repassword));
        assertTrue(KaryawanHelper.cekEmail(email));
        UserPerusahaan u= new UserPerusahaan();
        u.setUsernameP(username);
        u.setPasswordP(password);
        u.setEmailP(email);
        u.setNoHpP(noHp);
        u.setNamaP(nama);
        UserPerusahaannDAO udao=new UserPerusahaanDAOImpl();
        udao.insert(u);
        List<UserPerusahaan> list=udao.getAll();
        UserPerusahaan expResult= new UserPerusahaan();
        for (UserPerusahaan result: list){
            if(u.getUsernameP()==result.getUsernameP()){
                expResult=result;
                break;
            }
        }
        assertSame(expResult, u);
    }
     @Test
    public void testGetLogin() {
        System.out.println("getLogin");
        String userName = "adminn";
        String password = "adminadmin";
        UserPerusahaanDAOImpl instance = new UserPerusahaanDAOImpl();
//        UserPerusahaan expResult = null;
        UserPerusahaan result = instance.getLogin(userName, password);
        assertNull(result); 
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
