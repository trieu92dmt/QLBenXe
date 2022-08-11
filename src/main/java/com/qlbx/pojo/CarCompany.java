/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlbx.pojo;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "car_company")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CarCompany.findAll", query = "SELECT c FROM CarCompany c"),
    @NamedQuery(name = "CarCompany.findByCompanyId", query = "SELECT c FROM CarCompany c WHERE c.companyId = :companyId"),
    @NamedQuery(name = "CarCompany.findByCompanyName", query = "SELECT c FROM CarCompany c WHERE c.companyName = :companyName"),
    @NamedQuery(name = "CarCompany.findByAddress", query = "SELECT c FROM CarCompany c WHERE c.address = :address"),
    @NamedQuery(name = "CarCompany.findByPacketId", query = "SELECT c FROM CarCompany c WHERE c.packetId = :packetId"),
    @NamedQuery(name = "CarCompany.findByEmail", query = "SELECT c FROM CarCompany c WHERE c.email = :email"),
    @NamedQuery(name = "CarCompany.findByPhoneNumber", query = "SELECT c FROM CarCompany c WHERE c.phoneNumber = :phoneNumber"),
    @NamedQuery(name = "CarCompany.findByNumberAccount", query = "SELECT c FROM CarCompany c WHERE c.numberAccount = :numberAccount")})
public class CarCompany implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "company_id")
    private Integer companyId;
    @Size(max = 45)
    @Column(name = "company_name")
    private String companyName;
    @Size(max = 45)
    @Column(name = "address")
    private String address;
    @Column(name = "packet_id")
    private Integer packetId;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 45)
    @Column(name = "email")
    private String email;
    @Size(max = 45)
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "number_account")
    private Integer numberAccount;
    @ManyToMany(mappedBy = "carCompanySet")
    private Set<User> userSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "companyId")
    private Set<Route> routeSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "companyId")
    private Set<Rate> rateSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "companyId")
    private Set<Comment> commentSet;

    public CarCompany() {
    }

    public CarCompany(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPacketId() {
        return packetId;
    }

    public void setPacketId(Integer packetId) {
        this.packetId = packetId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(Integer numberAccount) {
        this.numberAccount = numberAccount;
    }

    @XmlTransient
    public Set<User> getUserSet() {
        return userSet;
    }

    public void setUserSet(Set<User> userSet) {
        this.userSet = userSet;
    }

    @XmlTransient
    public Set<Route> getRouteSet() {
        return routeSet;
    }

    public void setRouteSet(Set<Route> routeSet) {
        this.routeSet = routeSet;
    }

    @XmlTransient
    public Set<Rate> getRateSet() {
        return rateSet;
    }

    public void setRateSet(Set<Rate> rateSet) {
        this.rateSet = rateSet;
    }

    @XmlTransient
    public Set<Comment> getCommentSet() {
        return commentSet;
    }

    public void setCommentSet(Set<Comment> commentSet) {
        this.commentSet = commentSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (companyId != null ? companyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CarCompany)) {
            return false;
        }
        CarCompany other = (CarCompany) object;
        if ((this.companyId == null && other.companyId != null) || (this.companyId != null && !this.companyId.equals(other.companyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.qlbx.pojo.CarCompany[ companyId=" + companyId + " ]";
    }
    
}