package com.qlbx.pojo;

import com.qlbx.pojo.Ticket;
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
@StaticMetamodel(Book.class)
public class Book_ { 

    public static volatile SingularAttribute<Book, Integer> ticketQuantity;
    public static volatile SingularAttribute<Book, Integer> bookStatus;
    public static volatile SingularAttribute<Book, String> phoneNumber;
    public static volatile SetAttribute<Book, Ticket> ticketSet;
    public static volatile SingularAttribute<Book, BigInteger> price;
    public static volatile SingularAttribute<Book, String> customerName;
    public static volatile SingularAttribute<Book, Integer> bookId;

}