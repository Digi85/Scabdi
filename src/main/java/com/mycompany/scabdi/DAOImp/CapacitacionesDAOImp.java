/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.scabdi.DAOImp;

import com.mycompany.scabdi.DAO.CapacitacionesDAO;
import com.mycompany.scabdi.model.Capacitacionesmodel;
import com.mycompanyscabdi.config.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Christian
 */

public class CapacitacionesDAOImp implements CapacitacionesDAO{
private PreparedStatement ps;
	private ResultSet rs;
	private Connection cx = null;
    @Override
    
    public List<Map<String, Object>> findcapacitacionbyarea() {
        List<Map<String, Object>> lista = new ArrayList<>();
        String SQL = "select c.capacitacion_id, a.nombre as area, c.nombre as capacitacion, p.nombre, p.apellido from  capacitacion c " +
                     "inner join area a on c.area_id = a.area_id " +
                     "inner join persona p on c.persona_id = p.persona_id";
		try {
			cx = conexion.getConexion();
			ps = cx.prepareStatement(SQL);
			rs = ps.executeQuery(SQL);
			while (rs.next()) {
                                Map<String, Object> map = new HashMap<>();
                                map.put("capacitacion_id",rs.getInt("capacitacion_id"));
                                map.put("area",rs.getString("area"));
                                map.put("capacitacion",rs.getString("capacitacion"));
                                map.put("nombres",rs.getString("nombre")+" "+rs.getString("apellido"));
                                lista.add(map);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e);
		}
                return lista;
    }

    @Override
    public int createcapaciacion(Capacitacionesmodel capacitacionesmodel) {
       int x = 0;
       String SQL = "insert into capacitacion (NOMBRE, AREA_ID, PERSONA_ID) values(?,?,?)";
        try {
       cx = conexion.getConexion();
       ps = cx.prepareStatement(SQL);
       ps.setString(1, capacitacionesmodel.getNOMBRE());
       ps.setInt(2, capacitacionesmodel.getAREA_ID());
       ps.setInt(3, capacitacionesmodel.getPERSONA_ID());
        x = ps.executeUpdate();
        } catch (Exception e) {
            
        }
        return x;
    }

    @Override
    public int updatecapacitacion(Capacitacionesmodel capacitacionesmodel) {
        int x = 0;
       String SQL = "update capacitacion set NOMBRE = ?, AREA_ID = ?, PERSONA_ID = ? where CAPACITACION_ID = ?;";
        try {
       cx = conexion.getConexion();
       ps = cx.prepareStatement(SQL);
       ps.setString(1, capacitacionesmodel.getNOMBRE());
       ps.setInt(2, capacitacionesmodel.getAREA_ID());
       ps.setInt(3, capacitacionesmodel.getPERSONA_ID());
       ps.setString(4, capacitacionesmodel.getCAPACITACION_ID());
        x = ps.executeUpdate();
        } catch (Exception e) {
            
        }
        return x;
    }

    @Override
    public int deletecapacitacion(int id_capacitacion) {
            int x = 0;
       String SQL = "delete from CAPACITACION where CAPACITACION_ID = ?;";
        try {
       cx = conexion.getConexion();
       ps = cx.prepareStatement(SQL);
       ps.setInt(1,id_capacitacion);
        x = ps.executeUpdate();
        } catch (Exception e) {
            
        }
        return x;
    }

    @Override
    public Capacitacionesmodel readcapacitacion(int id_capacitacion) {
        Capacitacionesmodel cp = new Capacitacionesmodel();
        String SQL = "select * from capacitacion where capacitacion_id = ?;";
        try {
             cx = conexion.getConexion();
			ps = cx.prepareStatement(SQL);
			ps.setInt(1, id_capacitacion);
			rs = ps.executeQuery();
			while (rs.next()) {
                                cp.setCAPACITACION_ID(rs.getString("CAPACITACION_ID"));
				cp.setPERSONA_ID(rs.getInt("PERSONA_ID"));
				cp.setNOMBRE(rs.getString("NOMBRE"));
                                cp.setAREA_ID(rs.getInt("AREA_ID"));
			}
        } catch (Exception e) {
        }
        return cp;
    }
}
