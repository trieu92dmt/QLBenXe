package com.qlbx.pojo;

import com.qlbx.pojo.Trip;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-08-24T18:52:49", comments="EclipseLink-2.7.7.v20200504-rNA")
=======
@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-08-23T21:44:00", comments="EclipseLink-2.7.7.v20200504-rNA")
>>>>>>> c111f6ea2af43f7d2510c1cb3084e38cfc5aecbd
@StaticMetamodel(ShipmentDetails.class)
public class ShipmentDetails_ { 

    public static volatile SingularAttribute<ShipmentDetails, Date> receivingTime;
    public static volatile SingularAttribute<ShipmentDetails, String> receiverPhone;
    public static volatile SingularAttribute<ShipmentDetails, BigInteger> cost;
    public static volatile SingularAttribute<ShipmentDetails, String> receiver;
    public static volatile SingularAttribute<ShipmentDetails, String> sender;
    public static volatile SingularAttribute<ShipmentDetails, Trip> tripId;
    public static volatile SingularAttribute<ShipmentDetails, String> receiverEmail;
    public static volatile SingularAttribute<ShipmentDetails, Date> sendingTime;
    public static volatile SingularAttribute<ShipmentDetails, Integer> shipId;
    public static volatile SingularAttribute<ShipmentDetails, Integer> status;

}