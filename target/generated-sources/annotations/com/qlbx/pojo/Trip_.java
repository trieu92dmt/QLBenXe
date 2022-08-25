package com.qlbx.pojo;

import com.qlbx.pojo.Route;
import com.qlbx.pojo.ShipmentDetails;
import com.qlbx.pojo.Ticket;
import java.math.BigInteger;
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
@StaticMetamodel(Trip.class)
public class Trip_ { 

    public static volatile SingularAttribute<Trip, Date> date;
    public static volatile SingularAttribute<Trip, String> departureTime;
    public static volatile SingularAttribute<Trip, Route> routeId;
    public static volatile SingularAttribute<Trip, BigInteger> ticketPrice;
    public static volatile SetAttribute<Trip, Ticket> ticketSet;
    public static volatile SetAttribute<Trip, ShipmentDetails> shipmentDetailsSet;
    public static volatile SingularAttribute<Trip, Integer> tripId;
    public static volatile SingularAttribute<Trip, String> time;

}