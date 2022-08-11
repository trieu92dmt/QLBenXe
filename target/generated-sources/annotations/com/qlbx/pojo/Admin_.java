package com.qlbx.pojo;

import com.qlbx.pojo.User;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-08-09T20:24:08", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Admin.class)
public class Admin_ { 

    public static volatile SingularAttribute<Admin, String> address;
    public static volatile SingularAttribute<Admin, Date> joinDate;
    public static volatile SingularAttribute<Admin, String> name;
    public static volatile SingularAttribute<Admin, Integer> userId;
    public static volatile SingularAttribute<Admin, User> user;

}