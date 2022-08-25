package com.qlbx.pojo;

import com.qlbx.pojo.CarCompany;
import com.qlbx.pojo.Package;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-08-24T18:52:49", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Bill.class)
public class Bill_ { 

    public static volatile SingularAttribute<Bill, Package> packetId;
    public static volatile SingularAttribute<Bill, CarCompany> companyId;
    public static volatile SingularAttribute<Bill, Integer> id;
    public static volatile SingularAttribute<Bill, Date> paymentDate;
    public static volatile SingularAttribute<Bill, String> paymentOpt;

}