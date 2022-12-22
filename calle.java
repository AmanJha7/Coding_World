package com.firstpackage;
abstract class Bank1 {
	abstract int min_bal();
	abstract int rate_Interest();	
}
class SBI extends Bank1
{
	int num=3000;
	float rt=6.7f;
	int min_bal()
	{
		
		System.out.println("SBI min balance "+num);
		return 0;
	}
	int rate_Interest()
	{
		System.out.println("SBI rate of interest  "+rt);
		return 0;
		
	}
}
class AXIS extends Bank1
{

	int num=4800;
	float rt=8.37f;
	int min_bal()
	{
		System.out.println("AXIS min balance "+num);
		return 0;
	}
	int rate_Interest()
	{
		System.out.println("AXIS rate of interest "+rt);
		return 0;
		
	}
}
class ICICI extends Bank1
{

	int num=9300;
	float rt=8.67f;
	int min_bal()
	{
		System.out.println("ICICI min balance "+num);
		return 0;
	}
	int rate_Interest()
	{
		System.out.println("ICICI rate of interest "+rt);
		return 0;	
	}
}
class calle
{
	public static void main(String args[]){

		Bank1 b;
		b=new SBI();
		b.min_bal();
		b.rate_Interest();

		
		b=new AXIS();
		b.min_bal();
		b.rate_Interest();

		
		b=new ICICI();
		b.min_bal();
		b.rate_Interest();
	}
}
