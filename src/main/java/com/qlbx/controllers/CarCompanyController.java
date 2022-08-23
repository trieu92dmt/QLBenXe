/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlbx.controllers;

import com.qlbx.pojo.Bill;
import com.qlbx.pojo.CarCompany;
import com.qlbx.pojo.CarCompanyRegister;
import com.qlbx.pojo.User;
import com.qlbx.service.CarCompanyService;
import com.qlbx.service.PackageService;
import com.qlbx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author ASUS
 */
@Controller
public class CarCompanyController {

    @Autowired
    private PackageService packageService;
    @Autowired
    private UserService userDetailsService;
    @Autowired
    private CarCompanyService carCompanyService;

    @GetMapping("/package")
    public String chosePackage(Model model) {
        model.addAttribute("packages", this.packageService.getPackages());
        model.addAttribute("carCompanyRegister", new CarCompanyRegister());
        return "package";
    }


    @PostMapping("/carCompanyRegister")
    public String carCompanyRegister(@ModelAttribute(value = "carCompanyRegister") CarCompanyRegister carCompanyRegister) {
        if (userDetailsService.addUser(carCompanyRegister.getUser(), User.COMPANY) == true && 
                carCompanyService.addCarCompany(carCompanyRegister.getCarCompany()) == true) {
            return "redirect:/login";
        }
        return "package";
    }
}
