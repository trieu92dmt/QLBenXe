/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlbx.repository;

import com.qlbx.pojo.CarCompany;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface CarCompanyRepository {
    List<CarCompany> getListCarCompany();
}
