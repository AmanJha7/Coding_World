	// to chk whether a given number is armstom or not
#include<iostream>
using namespace std;
int main()
{
	int num,temp,result=0;
	cout<<"enter no. to be checked....";
	cin>>num;
	int c=0;
	temp=num;
	while(temp>0)
	{
		temp/=10;
		c++;
	}
	int d=c;
	temp=num;
	while(num>0)
	{
		int rem=num%10;
		int f=1;
		while(c>0)
		{
			f=f*rem;
			c--;
		}
		c=d;
		result+=f;
		num/=10;
	}
	if(temp==result){
		cout<<"no. is armstrong...";
	}
	else{
		cout<<"no way...";
	}
}
