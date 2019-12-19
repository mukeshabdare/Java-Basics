package com.practice;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes

*/
import java.util.*;
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    private static Scanner s = new Scanner(System.in);
    
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        */

        // Write your code here
//        int N = s.nextInt();
//        
//        for(int i=0; i<1; i++){
//            int size = s.nextInt();
//            s.nextLine();
//            checkInversrion(size);
//        }
    	int size = 5;
    	   for(int k=0; k<size; k++) {
               for(int l=0;l<size;l++){
               for(int m=k; m<size; m++) {
               for(int n=l; n<size; n++){
            	   System.out.println("H");
                     }
                   }
               }
           }

    }
    
    private static void checkInversrion(int size){
        //System.out.println("Size"+size);
        int [] [] array = new int [size][size];
        for(int i=0; i<size; i++){
            String [] line = s.nextLine().split(" ");
           // addLineToArray(size,line,i,array);
        }
        
    }
    
    private static void addLineToArray(int size, String [] line, int lineNo, int [][] array){
        for(int i=0; i<size; i++){
            array[lineNo][i] = Integer.parseInt(line[i]); 
        }
        
        for(int k=0; k<size;k++){
            for(int l=0; l<size; l++){
                System.out.print(array[k][l]+" ");
            }
            System.out.println("");
        }
            
        
    }
}

