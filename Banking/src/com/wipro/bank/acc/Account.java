package com.wipro.bank.acc;

public abstract class Account {
	int tenure;
	float principal;
	double rateOfInterest;
	public void setInterest(int age,String gender)
	{
		if(gender=="Male")
		{
			if(age<60)
			{
				rateOfInterest=9.8;
			}
			else
			{
				rateOfInterest=10.5;
			}
		}
		else if(gender=="Female")
		{
			if(age<58)
			{
				rateOfInterest=10.2;
			}
			else
			{
				rateOfInterest=10.8;
			}
		}
	}
	public float calculateMaturityAmount(float totalPrincipleDeposited,float maturityInterest)
	{
		return maturityInterest+totalPrincipleDeposited;
		
	}
	public abstract float calculateInterest();
	public abstract float calculateAmountDeposit();

}
