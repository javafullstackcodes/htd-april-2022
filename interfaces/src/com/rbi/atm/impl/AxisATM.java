package com.rbi.atm.impl;

import com.rbi.atm.ATM;

public  class AxisATM implements ATM{  //0-100
	
	@Override
	public void withdraw() {
		System.out.println(" axis withdraw");
	}
	
	

	@Override
	public void balanceEnquiry() {
		System.out.println(" axis balanceEnquiry");
		
	}

	@Override
	public void miniStatment() {
		System.out.println(" axis miniStatment");
		
	}
	
	
	public void printStatement() {
		System.out.println(" hello");
	}



	@Override
	public void fundTransfer() {
		// TODO Auto-generated method stub
		
	}

	
  
	
	/*
	
	@Override
	public void fundTransfer() {
		System.out.println(" axis fundTransfer");
		
	} */


}
