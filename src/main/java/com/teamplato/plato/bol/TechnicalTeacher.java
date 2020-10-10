/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamplato.plato.bol;

/**
 *
 * @author Thijme.Langelaar
 */
public class TechnicalTeacher extends Teacher {
    private final String job = "Technical";
    
    public TechnicalTeacher(String name) {
        super(name);
    }
    
    public String getJob(){
        return this.job;
    }
}
