/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.httpserver;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public interface Processor {
    public String handle(String path,HttpRequest req, HttpResponse res);
}
