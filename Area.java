package com.firstpackage;

public interface Area {
	final static float PI=3.14f;
	float compute(float x,float y);
}
class Rectangle implements Area
{
	public float compute(float x,float y)
	{
		return (x*y);
	}
}
class Circle implements Area
{
	public float compute(float x,float y)
	{
		return (PI*x*x); // here y is useless...
	}
}