package Vector;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vect {
public static void main(String[] args) {
	
	/*
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(30);
	al.add(20);
	al.add(1);
	
	System.out.println(al);*/
	
	Vector<Integer> v=new Vector<Integer>();
	
	System.out.println(v.capacity());
	System.out.println(v.size());
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		v.add(60);
		v.add(70);
		v.add(80);
		v.add(90);
		v.add(100);
		v.add(110);
		/*System.out.println(v.capacity());
		System.out.println(v.size());
		*/
		
		ListIterator<Integer> lt=v.listIterator();
		
		while (lt.hasNext())
		{
			System.out.println(lt.next());
			
		}
		System.out.println("=======");
		while (lt.hasPrevious()) 
		{
			System.out.println(lt.previous());
			
		}
			lt.remove();
		
		/*Enumeration<Integer> enumeration=v.elements();
		
	while (enumeration.hasMoreElements()) {
		Integer element = (Integer) enumeration.nextElement();
		System.out.println(element);*/
	}
		
	
	}	
