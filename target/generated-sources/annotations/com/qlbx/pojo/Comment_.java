package com.qlbx.pojo;

import com.qlbx.pojo.CarCompany;
import com.qlbx.pojo.User;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-08-19T15:24:57", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Comment.class)
public class Comment_ { 

    public static volatile SingularAttribute<Comment, CarCompany> companyId;
    public static volatile SingularAttribute<Comment, Integer> id;
    public static volatile SingularAttribute<Comment, User> userId;
    public static volatile SingularAttribute<Comment, String> content;

}