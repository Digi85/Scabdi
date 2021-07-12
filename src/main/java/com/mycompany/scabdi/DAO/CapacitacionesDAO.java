/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.scabdi.DAO;

import com.mycompany.scabdi.model.Capacitacionesmodel;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Christian
 */
public interface CapacitacionesDAO{
    List<Map<String, Object>> findcapacitacionbyarea();
    int createcapaciacion(Capacitacionesmodel capacitacionesmodel);
    int updatecapacitacion(Capacitacionesmodel capacitacionesmodel);
    int deletecapacitacion(int id_capacitacion);
    Capacitacionesmodel readcapacitacion(int id_capacitacion);
}
