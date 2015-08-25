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

    int port;
    String configFile;
    String war;
    String contextPath;


    public static void main(String[] args) throws Exception {

        /**
         * Configuration file selection.
         */
        Properties prop = new Properties();
        InputStream input = null;
        try {
            input = Main.class.getClassLoader().getResourceAsStream("config.properties");
            if(input != null){
                prop.load(input);
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
        WebAppContext webAppContext = getWebAppContext(prop);
        server.setHandler(webAppContext);
        server.start();
        server.join();
    }

    /**
     * Prepare webapp context for the server.
     * @param prop
     * @return
     */
    static WebAppContext getWebAppContext(Properties prop) {
        WebAppContext webAppContext = new WebAppContext();
        webAppContext.setContextPath("/");
        webAppContext.setWar(prop.getProperty("Web_AppLIB"));
        webAppContext.setExtractWAR(true);
        webAppContext.setCopyWebDir(true);
        webAppContext.setCopyWebInf(true);
        return webAppContext;
    }
}
