package com.superclassconstructor.java;

public class DemoSuper {

	public static void main (String args[]) {
		BoxWeight mybox1= new BoxWeight(10,20,30,40.7);
		BoxWeight mybox2= new BoxWeight(6,8,5,0.897);
		
		BoxWeight mybox3 = new BoxWeight();
		
		BoxWeight mycube = new BoxWeight(2,3);
		BoxWeight myclone = new BoxWeight(mybox1);
		double vol;
		
		vol= mybox1.volume();
		System.out.println("Volume of mybox1 is " + vol);
		System.out.println("Weight of mybox1 is " + mybox1.weight);
		System.out.println();
		
		
		vol = mybox2.volume();
		System.out.println("Volume of mybox2 is " + vol);
		System.out.println("Weight of mybox2 is " + mybox2.weight);
		System.out.println();
		
		vol = mybox3.volume();
		System.out.println("Volume of mybox3 is " + vol);
		System.out.println("Weight of mybox3 is " + mybox3.weight);
		System.out.println();
		
		
		vol = myclone.volume();
		System.out.println("Volume of myclone is " + vol);
		System.out.println("Weight of myclone is " + myclone.weight);
		System.out.println();
		
		
		vol = mycube.volume();
		System.out.println("Volume of mycube is " + vol);
		System.out.println("Weight of mycube is " + mycube.weight);
		System.out.println();
		}
		}
		
