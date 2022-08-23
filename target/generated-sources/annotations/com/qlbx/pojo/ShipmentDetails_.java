package com.qlbx.pojo;

import com.qlbx.pojo.Trip;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-08-20T22:03:48", comments="EclipseLink-2.7.7.v20200504-rNA")
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