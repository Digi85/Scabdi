/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompanyscabdi.config;

import com.google.gson.Gson;
import com.mycompany.scabdi.DAO.CapacitacionesDAO;
import com.mycompany.scabdi.DAO.LoginDAO;
import com.mycompany.scabdi.DAOImp.CapacitacionesDAOImp;
import com.mycompany.scabdi.DAOImp.LoginDAOImp;

/**
 *
 * @author Christian
 */

public class Test {
    static LoginDAO x = new LoginDAOImp();
    static CapacitacionesDAO y = new CapacitacionesDAOImp();
    static Gson g = new Gson();
    public static void main(String[] args) {
        // TODO code application logic here
      
        System.out.println(g.toJson(y.findcapacitacionbyarea()));
}
}