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
public class BookService {
    
    @RequestMapping("/Book/put")
    public static String putBook(){
        return "Putting book";
    }
    
    @RequestMapping("/Book/delete")
    public static String deleteBook(){
        return "Deleting book";
    }
}
