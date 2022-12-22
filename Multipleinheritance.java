package com.firstpackage;

class Multipleinheritance implements Printable,Showable,Drawable
{
	public void print() {
		System.out.println("Hello ");
	}
	public void show()
	{
	System.out.println("java is a fucking language ");
	}
	public void msg() {
		System.out.println("draw by yourself i am not your slave...");
	}
	public void draw() {
		System.out.println("draw by yourself i am not your slave...");
	}
	public static void main(String[] args) {
	Multipleinheritance obj=new Multipleinheritance();
	obj.show();
	obj.print();
	obj.msg();
	obj.draw();
}
}// we have to override each and every method of interface...
//where as we have choice in abstract class...
