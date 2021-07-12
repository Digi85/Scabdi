/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.scabdi.DAO;

import com.mycompany.scabdi.model.Loginmode;

/**
 *
 * @author Christian
 */
public interface LoginDAO {
    Loginmode finduser(String user);
    int findpassword(String password);
}
