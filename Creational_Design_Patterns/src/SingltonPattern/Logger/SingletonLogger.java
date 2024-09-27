/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingltonPattern.Logger;

import java.io.IOException;
import java.util.logging.FileHandler;

/**
 *
 * @author A_Murad
 */
public class SingletonLogger {

    private java.util.logging.Logger logger;
    private static SingletonLogger instance;

    private SingletonLogger() {
        logger = java.util.logging.Logger.getLogger("log_file");
        try {
            logger.addHandler(new FileHandler("logFile.txt"));
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static synchronized SingletonLogger getInstance() {
        if (instance == null) {
            instance = new SingletonLogger();
        }
        return instance;
    }

    public java.util.logging.Logger getLogger() {
        return logger;
    }
}
