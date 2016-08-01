package com.springmvc.utils;

import javax.servlet.ServletContextEvent;
import org.springframework.web.util.Log4jConfigListener;

public class Log4jConfigListenerExt extends Log4jConfigListener {
    @Override
    public void contextInitialized(ServletContextEvent event) {
        System.setProperty("log4j_path",event.getServletContext().getRealPath("/"));
        super.contextInitialized(event);
    }    
}

