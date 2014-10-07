package com.chautha.containedserver;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;


/**
 * Created by rewati on 9/27/14.
 */
public class Main {


    public static void main(String[] args) throws Exception {

        Server server = new Server(8080);
        WebAppContext webAppContext = new WebAppContext();
        webAppContext.setContextPath("/");
        webAppContext.setWar("./lib/Webapp-1.0-SNAPSHOT.war");
        server.setHandler(webAppContext);

        server.start();
        server.join();
    }
}
