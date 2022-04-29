package com.rbi.atm.impl;

import com.rbi.atm.ATM;

public class SbiATM implements ATM{

	@Override
	public void withdraw() {
		System.out.println(" sbi withdraw");
	}

	@Override
	public void balanceEnquiry() {
		System.out.println(" sbi balanceEnquiry");
		
	}

	@Override
	public void miniStatment() {
		System.out.println(" sbi miniStatment");
		
	}

	@Override
	public void fundTransfer() {
		System.out.println(" sbi fundTransfer");
		
	}

}
