/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.scabdi.controller;

import com.google.gson.Gson;
import com.mycompany.scabdi.DAO.CapacitacionesDAO;
import com.mycompany.scabdi.DAOImp.CapacitacionesDAOImp;
import com.mycompany.scabdi.model.Capacitacionesmodel;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Christian
 */
@WebServlet(name = "CapacitacionController", urlPatterns = {"/capacitacion"})
public class CapacitacionController extends HttpServlet {
private Gson gson = new Gson();
    private CapacitacionesDAO capacitacionesDAO = new CapacitacionesDAOImp();
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
       int opcion = Integer.parseInt(request.getParameter("opc"));//opc='1'
		switch (opcion) {
		case 1://todos los roles                    
                    out.println(gson.toJson(capacitacionesDAO.findcapacitacionbyarea()));
                    System.out.println(gson.toJson(capacitacionesDAO.findcapacitacionbyarea()));
			break;
                case 2:
                    out.println(gson.toJson(capacitacionesDAO.readcapacitacion(Integer.parseInt(request.getParameter("capacitacion_id")))));
			break;
                 case 3:
                     
                    out.println(gson.toJson(capacitacionesDAO.updatecapacitacion(new Capacitacionesmodel(request.getParameter("nombre"), Integer.parseInt(request.getParameter("area_id")), Integer.parseInt(request.getParameter("persona_id")),request.getParameter("capaciatacion_id")))));
			break;
                 case 4:
                    out.println(gson.toJson(capacitacionesDAO.createcapaciacion(new Capacitacionesmodel(request.getParameter("nombre"), Integer.parseInt(request.getParameter("area_id")), Integer.parseInt(request.getParameter("persona_id"))))));
			break;
                
                case 5:
                    out.println(gson.toJson(capacitacionesDAO.deletecapacitacion(Integer.parseInt(request.getParameter("area_id")))));
			break;
                }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
