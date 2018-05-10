package com.methodsandclasses.java;

//Overloading Construtcor
public class Boxs {

	double width;
	double height;
	double depth;

	Boxs(double w,double h,double d){
		
		width = w;
		height = h;
		depth = d;
	}
	
	//when no dimensions needed
	Boxs(){
		width =-1;
		height =-1;
		depth =-1;
		
	}
	
	//constructor when cube is created 
	Boxs(double len) {
		width = height = depth = len;
		}
	
		// compute and return volume
		double volume() {
		return width * height * depth;
		}
		}

		
