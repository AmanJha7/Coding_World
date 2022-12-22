package com.firstpackage;

class pyramid
{
	synchronized void draw_pyramid(char ch) 
	{
		for(int i=0;i<10;i+=2) {
			for(int k=10-i;k>10;k-=2)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
class A extends Thread
{
	pyramid p;
	A(pyramid p)
	{
		this.p=p;
	}
	public void run()
	{
		p.draw_pyramid('#');
	}
}
class B extends Thread
{
	pyramid p;
	B(pyramid p)
	{
		this.p=p;
	}
	public void run()
	{
		p.draw_pyramid('*');
	}
}
public class SycronizedTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	pyramid obj=new pyramid();
	A hash=new A(obj);
	B str=new B(obj);
	hash.start();
	str.start();
	
	}

}
