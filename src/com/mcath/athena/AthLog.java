package com.mcath.athena;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.bukkit.Bukkit;

public class AthLog {

    private static Logger l = Bukkit.getLogger();
    private static String pre = "[Athena] ";
    private static String premsg;
    
    /* Logger level set in parameters */
    public static void log(String level,String message) {
        premsg = pre+message;
        switch(level) {
            default:
                l.log(Level.INFO,premsg);
                break;
            case "info":
                l.log(Level.INFO,premsg);
                break;
            case "warning":
                l.log(Level.WARNING,premsg);
                break;
            case "severe":
                l.log(Level.SEVERE,premsg);
                break;
        }
    }
    
    /* Logger level info */
    public static void info(String message) {
        premsg = pre+message;
        l.log(Level.INFO,premsg);
    }
    
    /* Logger level warning */
    public static void warning(String message) {
        premsg = pre+message;
        l.log(Level.WARNING,premsg);
    }
    
    /* Logger level severe */
    public static void severe(String message) {
        premsg = pre+message;
        l.log(Level.SEVERE,premsg);
    }
    
    /* Custom debug logger level */
    public static void debug(String message) {
        premsg = pre+message;
        pre = "[Athena-DEBUG] ";
        l.log(Level.INFO,premsg);
    }
    
}