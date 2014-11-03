package com.chautha.containedserver;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;


/**
 * Created by rewati on 9/27/14.
 */
public class Main {


    public static void main(String[] args) throws Exception {

        Properties prop = new Properties();
        InputStream input = null;
        try {

            String filename = "config.properties";
            input = Main.class.getClassLoader().getResourceAsStream("config.properties");
            if(input != null){
                prop.load(Main.class.getClassLoader().getResourceAsStream("config.properties"));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally{
            if(input!=null){
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        Server server = new Server(8080);
        WebAppContext webAppContext = new WebAppContext();
        webAppContext.setContextPath("/");
        webAppContext.setWar(prop.getProperty("Cautha_Home")+"/lib/Webapp-1.0-SNAPSHOT.war");
        server.setHandler(webAppContext);

        server.start();
        server.join();
    }
}
