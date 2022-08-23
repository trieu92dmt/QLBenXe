package com.qlbx.pojo;

import com.qlbx.pojo.CarCompany;
import com.qlbx.pojo.User;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-08-20T22:03:48", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Rate.class)
public class Rate_ { 

    public static volatile SingularAttribute<Rate, CarCompany> companyId;
    public static volatile SingularAttribute<Rate, Integer> id;
    public static volatile SingularAttribute<Rate, User> userId;
    public static volatile SingularAttribute<Rate, Integer> point;

}