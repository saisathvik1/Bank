package com.wipro.bank.acc;
public class RDAccount extends Account{

	@Override
	public float calculateInterest() {
		float sum=0;
		double power=1;
		for(int i=tenure*12;i>=1;i--) {
		power = Math.pow(1+(rateOfInterest/100*4*tenure), 4*i/12);
		sum=(float) (sum+principal*(power-1));
		}
		return sum;
	}

	@Override
	public float calculateAmountDeposit() {
		
		return principal*tenure*12;
	}
	public RDAccount(int tenure , float principal)
	{
		this.tenure=tenure;
		this.principal=principal;
	}

}
