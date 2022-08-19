/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlbx.controllers;

import com.qlbx.pojo.User;
import com.qlbx.service.CarCompanyService;
import com.qlbx.service.PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ASUS
 */
@Controller
public class HomeController {
    @Autowired
    private PackageService packageService;
    
    @GetMapping(value="/")
    public String index(){
        return "home";
    }
}
