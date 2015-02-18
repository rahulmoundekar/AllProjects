package com;

public class  AssignmentMaxMin
{
    public static void main (String args[])
    {
        // Declare the variables of Short,Int ,Long
        Short i,j,x;
        Integer k,l,y;
        Long m,n,z;
        System.out.println("Short MAX value is " + Short.MAX_VALUE);
        System.out.println("Short MIN value is " + Short.MIN_VALUE);
        System.out.println("Integer MAX value is " + Integer.MAX_VALUE);
        System.out.println("Integer MIN value is " + Integer.MIN_VALUE);
        System.out.println("Long MAX value is " + Long.MAX_VALUE);
        System.out.println("Long MIN value is " + Long.MIN_VALUE);
        i= Short.MAX_VALUE ;
        j= Short.MIN_VALUE ;
        k= Integer.MAX_VALUE;
        l= Integer.MIN_VALUE;
        m= Long.MAX_VALUE;
        n= Long.MIN_VALUE;
        short w=(short)1;
        x=(short)(i+w);
        //the main problem arises above when we need to convert integer to short
        // this problem is solved by explicit type casting
        y=k+1;
        z=m+1;
        System.out.println("The values of variables are as follows :");
        System.out.println(" i " + i);
        System.out.println(" j " + j);
        System.out.println(" k " + k);
        System.out.println(" l " + l);
        System.out.println(" m " + m);
        System.out.println(" n " + n);
        System.out.println(" x " + x);
        System.out.println(" y " + y);
        System.out.println(" z " + z);
        
    }
}