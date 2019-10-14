package com.wipro.bank.service;

import com.wipro.bank.acc.RDAccount;
import com.wipro.bank.exception.BankValidationException;

public class BankService {
	public boolean validateData(float principal,int tenure,int age,String gender)
	{
		try
		{
			if(principal>=500)
			{
				if(tenure==5 || tenure==10)
				{
					if(gender=="Male"||gender=="Female")
					{
						if(age>1&&age<100)
						{
							return true;
						}
						else
						{
							throw new BankValidationException("False");
						}
					}
					else
					{
						throw new BankValidationException("False");
					}
				}
				else
				{
					throw new BankValidationException("False");
				}
			}
			else
			{
				throw new BankValidationException("False");
			}
		}
		catch(BankValidationException be)
		{
			return false;
		}
	}
	public void calculate(float principal, int tenure, int age, String gender) {
		 boolean check=validateData(principal,tenure,age,gender);
		 if(check==true)
		 {
			 RDAccount rda=new RDAccount(tenure,principal);
			 rda.setInterest(age, gender);
			 System.out.println("TotalPrincipal Amount: "+rda.calculateInterest());
			 rda.calculateAmountDeposit();
		 }
	}
}
