package com.practice;

public class ExceptionDemo {

	public static void main(String[] args) {

		  try{    
			    int a[]=new int[5];
			    a[7]=30/0;    
			   }    
			   catch(Exception d ){
				   d.printStackTrace();
				   System.out.println("common task completed");
				   
			   }    
			   //catch(ArithmeticException e){System.out.println("task1 is completed");}    
			   System.out.println("rest of the code..."); 
			   
	}

}
