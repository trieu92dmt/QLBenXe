package com.qlbx.pojo;

import com.qlbx.pojo.Book;
import com.qlbx.pojo.Trip;
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
@StaticMetamodel(Ticket.class)
public class Ticket_ { 

    public static volatile SetAttribute<Ticket, Book> bookSet;
    public static volatile SingularAttribute<Ticket, BigInteger> price;
    public static volatile SingularAttribute<Ticket, Trip> tripId;
    public static volatile SingularAttribute<Ticket, Integer> ticketId;
    public static volatile SingularAttribute<Ticket, String> seatNumber;

}