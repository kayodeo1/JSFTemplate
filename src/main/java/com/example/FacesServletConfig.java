package com.example;

import jakarta.faces.webapp.FacesServlet;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class FacesServletConfig implements jakarta.servlet.ServletContextListener {

    
    public void contextInitialized(ServletContext ctx) throws ServletException {
        ServletRegistration.Dynamic facesServlet = ctx.addServlet("FacesServlet", FacesServlet.class);
        facesServlet.setLoadOnStartup(1);
        facesServlet.addMapping("*.xhtml");
    }
}
