package com.superclassconstructor.java;

public class Box {

	private double width;
	private double height;
	private double depth;
	
	
	//constructor clone for an object
	
	Box(Box ob){   //passing object to constructor
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
		}
	
Box (double w,double h, double d){ //Construcot with a ll dimesnions
	width =w;
	height =h;
	depth =d;
}

Box(){  // Construcot with no dimesnions
	width = -1;
	height = -1;
	depth = -1;
}

Box(double len){
	width = height = depth =len;
	
			}
//compute and return value
double volume() {
	return width*height*depth;
}
}



