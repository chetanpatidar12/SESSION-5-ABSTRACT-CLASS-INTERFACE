package com.acad.core;

public abstract class Figure {

	
	
	
	double dim1;
	double dim2;
	double dim3;
	
	  Figure(double a,double b) {    
		  dim1 = a;        
	  dim2 = b;
	
	  }
	  
	  Figure(double a,double b,double c) {    
		  dim1 = a;        
	  dim2 = b;
	  dim3=c;
	  
	  }
	abstract void findArea();
	
	abstract void findPerimeter();
	
	
	
}
