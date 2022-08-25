/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlbx.controllers;

import com.qlbx.service.CarCompanyService;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 *
 * @author ASUS
 */
@Controller
@ControllerAdvice
public class CommonController {
    @Autowired
    private CarCompanyService carCompanyService;
    
    @ModelAttribute
    public void commonAttr(Model model, HttpSession session){
        model.addAttribute("carCompany", this.carCompanyService.getListCarCompany());
        model.addAttribute("currentUser", session.getAttribute("currentUser"));
    }
    
    @GetMapping(value = "error")
    public String error(){
        return "error";
    }
}
