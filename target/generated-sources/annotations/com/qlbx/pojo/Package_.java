package com.qlbx.pojo;

import com.qlbx.pojo.Bill;
import java.math.BigInteger;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-08-24T18:52:49", comments="EclipseLink-2.7.7.v20200504-rNA")
=======
@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-08-23T21:44:00", comments="EclipseLink-2.7.7.v20200504-rNA")
>>>>>>> c111f6ea2af43f7d2510c1cb3084e38cfc5aecbd
@StaticMetamodel(Package.class)
public class Package_ { 

    public static volatile SingularAttribute<Package, BigInteger> price;
    public static volatile SetAttribute<Package, Bill> billSet;
    public static volatile SingularAttribute<Package, Integer> expireDate;
    public static volatile SingularAttribute<Package, Integer> id;
    public static volatile SingularAttribute<Package, String> packageName;

}