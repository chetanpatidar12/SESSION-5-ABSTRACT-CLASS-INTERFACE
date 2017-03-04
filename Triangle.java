package com.acad.core;

public class Triangle extends Figure {

	public Triangle(double d1,double d2,double d3){
		super(d1,d2,d3);
		
	}

	@Override
	void findArea() {
		double area = (dim1* dim2)/2;
		System.out.println("area of Triangle:"+area);
	}

	@Override
	void findPerimeter() {
		double perimeter=(dim1+dim2+dim3);
		System.out.println("perimeter of Triangle"+perimeter);
		
	}
}
