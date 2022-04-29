package com.rbi.atm.impl;

import java.util.ArrayList;
import java.util.List;

import com.rbi.atm.ATM;

public class AtmTest {

	public static void main(String[] args) {
		
		//AxisATM a= new AxisATM();
		
		//SbiATM s= new SbiATM();
		
		// Parent p = new Child();
		
		ATM axis= new AxisATM();
		axis.balanceEnquiry();
		axis.fundTransfer();
		axis.withdraw();
		axis.miniStatment();
		
		ATM sbi= new SbiATM(); // runtime polymorphism
	// interface reference= new ImplementationClassName();
		System.out.println("====================================");
		sbi.balanceEnquiry();
		sbi.fundTransfer();
		sbi.withdraw();
		sbi.miniStatment();
		
		List list = new ArrayList();
		
		
	}

}
