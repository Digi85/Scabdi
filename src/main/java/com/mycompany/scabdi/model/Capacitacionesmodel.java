/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.scabdi.model;

/**
 *
 * @author Christian
 */
public class Capacitacionesmodel {
    private String CAPACITACION_ID;
    private String NOMBRE;
    private int AREA_ID;
    private int PERSONA_ID;

    public Capacitacionesmodel() {
    }

    public Capacitacionesmodel(String NOMBRE, int AREA_ID, int PERSONA_ID) {
        this.NOMBRE = NOMBRE;
        this.AREA_ID = AREA_ID;
        this.PERSONA_ID = PERSONA_ID;
    }
     public Capacitacionesmodel(String NOMBRE, int AREA_ID, int PERSONA_ID, String CAPACITACION_ID) {
        this.NOMBRE = NOMBRE;
        this.AREA_ID = AREA_ID;
        this.PERSONA_ID = PERSONA_ID;
        this.CAPACITACION_ID=CAPACITACION_ID;
    }

    public String getCAPACITACION_ID() {
        return CAPACITACION_ID;
    }

    public void setCAPACITACION_ID(String CAPACITACION_ID) {
        this.CAPACITACION_ID = CAPACITACION_ID;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public int getAREA_ID() {
        return AREA_ID;
    }

    public void setAREA_ID(int AREA_ID) {
        this.AREA_ID = AREA_ID;
    }

    public int getPERSONA_ID() {
        return PERSONA_ID;
    }

    public void setPERSONA_ID(int PERSONA_ID) {
        this.PERSONA_ID = PERSONA_ID;
    }

   
}
