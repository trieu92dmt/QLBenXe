/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qlbx.controllers;

import com.qlbx.service.CarCompanyService;
import static org.hibernate.criterion.Projections.id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author ACER
 */
@Controller
public class CarCompanyDetailController {
    @Autowired
    private CarCompanyService carCompanyService;
    @GetMapping("/trip/{id}")
    public String  CarCompanyDetail(Model model,@PathVariable(value = "id")int id){
        model.addAttribute("trip",this.carCompanyService.getCarCompanyById(id));
        
        return "carcompanydetail";
    }
        
    
}
