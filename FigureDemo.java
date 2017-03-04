package com.acad.core;

public class FigureDemo {
public static void main(String[] args) {
	Circle c=new Circle(7,8);

	c.findArea();
	c.findPerimeter();
	
	Ractangle r=new Ractangle(7,8);
	r.findArea();
	r.findPerimeter();
	
	Triangle t=new Triangle(2,6,4);
	t.findArea();
	t.findPerimeter();
}
}
