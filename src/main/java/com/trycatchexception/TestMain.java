package com.trycatchexception;

public class TestMain {
    public static void main(String args[]) {
       TryAndCatch tryAndCatch = new TryAndCatch();
       try{
           tryAndCatch.arismetic(1,2,0);
       }

       catch (ArithmeticException a){
           System.out.println ("Invalid number of C, can not be zero");
       }

       try{
           tryAndCatch.array();
       }
       catch (ArrayIndexOutOfBoundsException b)
       {
           System.out.println ("Exception Found: "+b);
       }
    }
}
