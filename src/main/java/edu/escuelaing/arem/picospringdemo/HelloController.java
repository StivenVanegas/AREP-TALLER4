/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.picospringdemo;

import edu.escuelaing.arem.picospring.RequestMapping;

/**
 *
 * @author StivenVanegas
 */
public class HelloController {
    
    @RequestMapping("/simplehello")
    public static String index() {
        return "Greetings from Spring Boot!";
    }
    
    @RequestMapping("/hola")
    public static String hola() {
        return "Hola desde Pico Spring Boot!";
    }
}
