package com.firstpackage;

public interface Printable {
	void print();
}
public interface Showable
{
	void show();
}
public interface Drawable
{
	void draw();
	void msg() {
		System.out.println("default method  ");
	}
}
