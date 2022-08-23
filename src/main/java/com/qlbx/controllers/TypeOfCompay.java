/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qlbx.controllers;

import com.qlbx.service.CarCompanyService;
import com.qlbx.service.PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author ACER
 */
@Controller
public class TypeOfCompay {
    @Autowired
    private CarCompanyService carCompanyService;
    @GetMapping("/trip")
    public String TypeCPN(Model model){
        model.addAttribute("carcompany", this.carCompanyService.getListCarCompany());
        
    return "trip";
    }
}
