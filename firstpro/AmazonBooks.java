package com.java.firstpro;

public class AmazonBooks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bookshopping b = new BarnesNoble();
		System.out.println(b.Genre);
		System.out.println(b.cost);
		
		
		Bookshopping b1 = new BookMans();
		System.out.println(b1.Genre);
		System.out.println(b1.cost);
		
	}

}
	/*BarnesNoble noble = new BarnesNoble ();
		noble.cost = 15;
		noble.Genre = "science";
				
       System.out.println(noble.Genre);
        System.out.println(noble.cost);*/
        
		
		
       /*BookMans book = new BookMans();
        book.cost = 18;
        book.Genre = "Drama";
        
        System.out.println(book.Genre);
        System.out.println(book.cost);
        */

