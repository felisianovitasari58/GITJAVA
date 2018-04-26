/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import DAO.KaryawanDAO;
import DAO.UserKaryawannDAO;
import DAOImpl.KaryawanDAOImpl;
import DAOImpl.UserKaryawanDAOImpl;
import Helper.KaryawanHelper;
import Helper.userHelper;
import java.util.Date;
import java.util.Scanner;
import model.JenisKelamin;
import model.Karyawan;
import model.UserKaryawan;

/**
 *
 * @author Dell Inspiron
 */
public class Main {
    public static void main(String[] args) throws Exception {
        KaryawanDAO kdao=new KaryawanDAOImpl();
        UserKaryawannDAO udao=new UserKaryawanDAOImpl();
        Karyawan k =new Karyawan();
        k.setNamaLengkap("Novi");
        k.setEmail("felisianovitasari@yahoo.co.id");
        k.setJenisKelamin(JenisKelamin.WANITA);
        k.setKkPath("https://stackoverflow.com/questio");
        k.setKtpPath("https://stackoverflow.com/questio");
        k.setNikKitasPassport("3462637823628937981");
        k.setNoHp("083232312132");
        k.setNoTelp1("02744348398");
        k.setPasFotoPath("https://stackoverflow.com/questio");
        k.setNpwp("32434123213424");
        k.setTempatLahir("Dumai");
        k.setTglLahir(new Date());
        kdao.insert(k);
        Scanner sc=new Scanner(System.in);
//        Karyawan k=kdao.getById(1);
//        UserKaryawan uk= new UserKaryawan();
//        System.out.println(k.getNamaLengkap());
//        System.out.println("Username : ");
//        String username=sc.next();
//        System.out.println("Password : ");
//        String password=sc.next();
//        uk.setUsernameK(username);
//        uk.setPasswordK(userHelper.encrypt(username+password));
//        uk.setKaryawan(k);
//        udao.insert(uk);
//        UserKaryawan uk= udao.getById(1);
//        System.out.println("Password: ");
//        String pass=sc.next();
//        if(userHelper.encrypt(uk.getUsernameK()+pass).equals(uk.getPasswordK()))
//            System.out.println("benar");
        //coba
        //ajHAJhakJHKJ
        //mbnbnmb
        //AHjaAJH
        //zakiloveeneng
        //nyobaaaaa
    }
}
