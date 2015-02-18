package com.extremityindia;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class ReadURLSource 
{

  public static void main(String args[]) throws Exception
  {
	  URL jftUrl = new URL("http://www.jusfortechies.com/");
	  URLConnection jc = jftUrl.openConnection();
	  BufferedReader in = new BufferedReader(new InputStreamReader(jc.getInputStream()));
	  String inputLine;
	  while ((inputLine = in.readLine()) != null) 
		  System.out.println(inputLine);

	  in.close();

  }

}
