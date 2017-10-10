/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hi.framework.hibernate.controllers;

import javax.enterprise.context.ApplicationScoped;
import org.emerjoin.hi.web.mvc.Controller;
import org.emerjoin.hi.web.mvc.exceptions.MvcException;

/**
 *
 * @author zjohn
 */
@ApplicationScoped
public class Members extends Controller{
    
    public void index() throws MvcException{
        this.callView();
    }
    
}
