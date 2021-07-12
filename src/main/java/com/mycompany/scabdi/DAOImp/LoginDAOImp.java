/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.scabdi.DAOImp;

import com.mycompany.scabdi.DAO.LoginDAO;
import com.mycompany.scabdi.model.Loginmode;
import com.mycompanyscabdi.config.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author Christian
 */
public class LoginDAOImp implements LoginDAO {
private PreparedStatement ps;
	private ResultSet rs;
	private Connection cx = null;
    @Override
    public Loginmode finduser(String user) {
        Loginmode users = new Loginmode();
        String SQL = "select USERNAME, CONTRASENA, PERSONA_ID from usuario where username = ? ";
		try {
			cx = conexion.getConexion();
			ps = cx.prepareStatement(SQL);
			ps.setString(1, user);
			rs = ps.executeQuery();
			while (rs.next()) {				
				users.setPERSONA_ID(rs.getInt("PERSONA_ID"));
				users.setUSERNAME(rs.getString("USERNAME"));
                                users.setCONTRASENA(rs.getString("CONTRASENA"));
                                System.out.println(rs.getString("USERNAME"));
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
                return users;
		
    }

    @Override
    public int findpassword(String password) {
        Loginmode users = new Loginmode();
        String SQL = "select *from rol where id_rol=?";
		try {
			//cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQL);
			ps.setString(1, password);
			rs = ps.executeQuery();
			while (rs.next()) {				
				users.setPERSONA_ID(rs.getInt("PERSONA_ID"));
				users.setUSERNAME(rs.getString("USERNAME"));
                                users.setCONTRASENA(rs.getString("CONTRASENA"));
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
                if (password == null) {
            return 1;
        } else {
                    return 0;
        }
		
    }
    
}
