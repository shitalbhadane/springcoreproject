package com.prowing.consinjectAmbigutity;

public class Addition {
private int a;
private int b;
public Addition(double a,double b)

{
	this.a=(int)a;
	this.b=(int)b;
	System.out.println("Constructor :double,double");
}
public Addition(int a,int b)
{
	this.a=a;
	this.b=b;
	System.out.println("constructor :int,int");
}
public Addition(String a,String b)
{
	this.a=Integer.parseInt(a);
	this.b=Integer.parseInt(b);
	System.out.println("constructor is:String ,String");
	
}

public void dosum()
{
	System.out.println("sum is=="+(this.a+this.b));
}
}
