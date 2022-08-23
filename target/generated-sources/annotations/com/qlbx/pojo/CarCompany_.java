package com.qlbx.pojo;

import com.qlbx.pojo.Bill;
import com.qlbx.pojo.Comment;
import com.qlbx.pojo.Rate;
import com.qlbx.pojo.Route;
import com.qlbx.pojo.User;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-08-23T21:44:00", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(CarCompany.class)
public class CarCompany_ { 

    public static volatile SingularAttribute<CarCompany, String> address;
    public static volatile SingularAttribute<CarCompany, String> phoneNumber;
    public static volatile SetAttribute<CarCompany, Comment> commentSet;
    public static volatile SingularAttribute<CarCompany, String> companyName;
    public static volatile SingularAttribute<CarCompany, Integer> packageId;
    public static volatile SetAttribute<CarCompany, Bill> billSet;
    public static volatile SingularAttribute<CarCompany, Integer> id;
    public static volatile SetAttribute<CarCompany, Route> routeSet;
    public static volatile SetAttribute<CarCompany, Rate> rateSet;
    public static volatile SetAttribute<CarCompany, User> userSet;
    public static volatile SingularAttribute<CarCompany, String> email;

}