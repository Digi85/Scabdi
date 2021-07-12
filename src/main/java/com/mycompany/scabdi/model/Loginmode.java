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
public class Loginmode {
    private int PERSONA_ID;
    private String CONTRASENA;
    private String USERNAME;

    public Loginmode() {
    }

    public Loginmode(String CONTRASENA, String USERNAME) {
        this.CONTRASENA = CONTRASENA;
        this.USERNAME = USERNAME;
    }

    public int getPERSONA_ID() {
        return PERSONA_ID;
    }

    public void setPERSONA_ID(int PERSONA_ID) {
        this.PERSONA_ID = PERSONA_ID;
    }

    public String getCONTRASENA() {
        return CONTRASENA;
    }

    public void setCONTRASENA(String CONTRASENA) {
        this.CONTRASENA = CONTRASENA;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }

  

    
}
