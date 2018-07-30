package com.corejava.TryCatchExceptionExcercise;

public class TestMain {
    public static void main(String args[]) {
       TryAndCatch tryAndCatch = new TryAndCatch();
       try{
           tryAndCatch.arismetic(1,2,0);
       }

       catch (ArithmeticException a){
           System.out.println ("Exception Found: "+a);
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
