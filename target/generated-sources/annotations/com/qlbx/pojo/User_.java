package com.qlbx.pojo;

import com.qlbx.pojo.Admin;
import com.qlbx.pojo.CarCompany;
import com.qlbx.pojo.Comment;
import com.qlbx.pojo.Customer;
import com.qlbx.pojo.Rate;
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
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> role;
    public static volatile SingularAttribute<User, Admin> admin;
    public static volatile SingularAttribute<User, String> avatar;
    public static volatile SingularAttribute<User, Integer> userId;
    public static volatile SingularAttribute<User, String> password;
    public static volatile SingularAttribute<User, CarCompany> carCompany;
    public static volatile SingularAttribute<User, String> phoneNumber;
    public static volatile SingularAttribute<User, Date> createdDate;
    public static volatile SetAttribute<User, Comment> commentSet;
    public static volatile SetAttribute<User, Rate> rateSet;
    public static volatile SingularAttribute<User, String> email;
    public static volatile SingularAttribute<User, String> username;
    public static volatile SingularAttribute<User, Customer> customer;

}