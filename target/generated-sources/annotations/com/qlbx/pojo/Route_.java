package com.qlbx.pojo;

import com.qlbx.pojo.CarCompany;
import com.qlbx.pojo.Trip;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-08-26T21:03:19", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Route.class)
public class Route_ { 

    public static volatile SingularAttribute<Route, CarCompany> companyId;
    public static volatile SingularAttribute<Route, Integer> routeId;
    public static volatile SingularAttribute<Route, String> startingPlace;
    public static volatile SingularAttribute<Route, String> destination;
    public static volatile SetAttribute<Route, Trip> tripSet;

}