package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable{
	
	
	@Override
	public int plus(int a, int b) {
		int c=a+b;
		System.out.println(a+"+"+b+"="+c);
		return c;
	}

	@Override
	public int minus(int a, int b) {
		int c=a-b;
		System.out.println(a+"-"+b+"="+c);
		return c;
	}

	@Override
	public int devide(int a, int b) {
		int c=a/b;
		System.out.println(a+"/"+b+"="+c);
		return c;
	}

	@Override
	public int multiply(int a, int b) {
		int c=a*b;
		System.out.println(a+"*"+b+"="+c);
		return c;
	}

}
