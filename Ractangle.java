package com.acad.core;

public class Ractangle extends Figure {
public Ractangle(double d1,double d2) {
	// TODO Auto-generated constructor stub
	super(d1,d2);
}
	@Override
	void findArea() {
		double area = dim1 * dim2;
		System.out.println("area of Ractangle:"+area);
		
	}

	@Override
	void findPerimeter() {

		double perimeter = 2 * (dim1 + dim2);
		System.out.println("perimeter of Ractangle:"+perimeter);
	}

}
