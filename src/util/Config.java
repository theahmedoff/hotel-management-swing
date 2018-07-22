/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.FileInputStream;
import java.util.Properties;

/**
 *
 * @author Ahme_vn75
 */
public class Config {
    
    private static Properties properties;
    
    static{
        try {
            properties = new Properties();
            properties.load(new FileInputStream("hmapp.properties"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static String getDBUsername(){
        return properties.getProperty("db.username");
    }
    
    public static String getDBPassword(){
        return properties.getProperty("db.password");
    }
    
    
    
}
