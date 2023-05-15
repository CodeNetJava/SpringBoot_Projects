package com.sau.core.dao;

import org.springframework.stereotype.Repository;

// we use PaymentDAOImpl class for the data access
@Repository // we use @Repository for the classes that handle the database
            // this is a stereotype annotation
            //all the stereotype annotations tells spring that a bean of this class can be created and injected
public class PaymentDAOImpl implements PaymentDAO {

}
