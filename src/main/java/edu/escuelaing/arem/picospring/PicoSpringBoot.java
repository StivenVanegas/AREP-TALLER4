/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.picospring;

import edu.escuelaing.arem.httpserver.HttpServer;
import edu.escuelaing.arem.httpserver.Processor;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PicoSpringBoot implements Processor{
    
    private static PicoSpringBoot _instance = new PicoSpringBoot();
    private Map<String, Method> requestProcessors = new HashMap();
    HttpServer hserver;
    
    private PicoSpringBoot(){
    
    }
    
    public static PicoSpringBoot getInstance(){
        return _instance;
    }
    
    public void loadComponents(String[] componentsList) throws ClassNotFoundException{
        for(String componentName: componentsList){
            loadComponent(componentName);
        }
    }

    private void loadComponent(String componentName) throws ClassNotFoundException {
        Class componentClass = Class.forName(componentName);
        Method[] componentMethods = componentClass.getDeclaredMethods();
        for(Method m: componentMethods){
            if(m.isAnnotationPresent(RequestMapping.class)){
                requestProcessors.put(m.getAnnotation(RequestMapping.class).value() ,m);
            }
        }
    }

    @Override
    public String handle(String path, HttpRequest req, HttpResponse res) {
        
        String resp = "";
        if(requestProcessors.containsKey(path)){
            try {
                resp = requestProcessors.get(path).invoke(null,null).toString();
            } catch (IllegalAccessException ex) {
                Logger.getLogger(PicoSpringBoot.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalArgumentException ex) {
                Logger.getLogger(PicoSpringBoot.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvocationTargetException ex) {
                Logger.getLogger(PicoSpringBoot.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return validOkHttpHeader() + resp;
        
    }
    
    public void startServer() throws IOException{
        hserver = new HttpServer();
        hserver.registerProcessor("/springapp", this);
        hserver.startServer(8080);
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        PicoSpringBoot.getInstance().loadComponents(args);
        PicoSpringBoot.getInstance().startServer();
    }
    
    public String validOkHttpHeader(){
        return "HTTP/1.1 200 OK\r\n"
                + "Content-Type: text/html\r\n"
                + "\r\n";
    }
}
