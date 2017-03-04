package com.acad.core;

public class Circle extends Figure {

	public Circle(double d1,double d2) {
	
	super(d1,d2);
	

	
	}
	@Override
	void findArea() {
	
		double  area = Math.PI * dim1 * dim2;
	
	System.out.println("area of Circle:"+area);	
	}

	@Override
	void findPerimeter() {
		double perimeter = 2 * Math.PI * dim1;
        
		System.out.println("perimeter of perimeter"+perimeter);
	}

}
