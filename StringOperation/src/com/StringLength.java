package com;

public class StringLength
{
    static int i,c,res;
    
    static int length(String s)
    {
        try
        {
            for(i=0,c=0;0<=i;i++,c++)
            s.charAt(i);
        }
        catch(Exception e)
        //Array index out of bounds and array index out of range are different exceptions
        {
            System.out.print("length is ");
            // we can not put return  statement in catch
        }
        return c;
    }
    
    public static void main (String args[])
    {
        
        System.out.println("Original String is : ");
        System.out.println("Alive is awesome ");
        res=StringLength.length("Alive is awesome");
        System.out.println( res);
    }
}
