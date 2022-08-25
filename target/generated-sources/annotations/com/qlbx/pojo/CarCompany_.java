package com.qlbx.pojo;

import com.qlbx.pojo.Bill;
import com.qlbx.pojo.Comment;
import com.qlbx.pojo.Rate;
import com.qlbx.pojo.Route;
import com.qlbx.pojo.User;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-08-24T18:52:49", comments="EclipseLink-2.7.7.v20200504-rNA")
=======
@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-08-23T21:44:00", comments="EclipseLink-2.7.7.v20200504-rNA")
>>>>>>> c111f6ea2af43f7d2510c1cb3084e38cfc5aecbd
@StaticMetamodel(CarCompany.class)
public class CarCompany_ { 

    public static volatile SingularAttribute<CarCompany, String> address;
    public static volatile SingularAttribute<CarCompany, String> phoneNumber;
    public static volatile SetAttribute<CarCompany, Comment> commentSet;
    public static volatile SingularAttribute<CarCompany, String> companyName;
    public static volatile SetAttribute<CarCompany, Bill> billSet;
    public static volatile SingularAttribute<CarCompany, Date> expireDate;
    public static volatile SingularAttribute<CarCompany, Integer> id;
    public static volatile SetAttribute<CarCompany, Route> routeSet;
    public static volatile SetAttribute<CarCompany, Rate> rateSet;
    public static volatile SingularAttribute<CarCompany, User> user;
    public static volatile SingularAttribute<CarCompany, String> email;

}