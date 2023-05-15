package com.sau.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sau.core.dao.PaymentDAO;
@Service  //all the stereotype annotations tells spring that a bean of this class can be created and injected
public class PaymentServiceImpl implements PaymentService {
	
@Autowired // tells spring that this dependency should be automatically wired at runtime
           // spring search for the implementation class(i.e PaymentDAOImpl) of this PaymentDAO dao interface at runtime 
           // it will create bean of PaymentDAOImpl because it is already marked with a stereotype annotation(i.e @Repository)
           // and inject it into this field here
 private PaymentDAO dao;

public PaymentDAO getDao() {
	return dao;
}

public void setDao(PaymentDAO dao) {
	this.dao = dao;
}
 
public int calculate(int a , int b)
{
	return a+b;
}
}
