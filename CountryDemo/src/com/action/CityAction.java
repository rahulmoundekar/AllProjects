package com.action;


import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletResponseAware;

import com.hibernate.City;
import com.hibernate.Country;
import com.hibernate.State;
import com.service.Cityservice;
import com.service.cityServiceImpl;

public class CityAction implements ServletResponseAware{
	int coun;
	int stat;
	String sta;
	String con;
	String cit;
	HttpServletResponse response;
	List<Country> list=new ArrayList<Country>();
	Country country=new Country();
	
	State state=new State();
	List<State> list2=new ArrayList<State>();
	
	City city=new City();
	List<City> list1=new ArrayList<City>();
	
	Cityservice cityservice;
	
	public String getcity()
	{
		cityservice=new cityServiceImpl();
		System.out.println("in action");	
		
		list=cityservice.cityService(country);
		System.out.println(list);
		return "hi";
	}
	public String ajaxCal() throws Exception{
		PrintWriter pw=response.getWriter();
		cityservice=new cityServiceImpl();
		list2=cityservice.ajaxStateService(country, state, coun);
		
		Iterator itr=list2.iterator();
		while(itr.hasNext()){
			State state=(State)itr.next();
			pw.write("<option value="+state.getStateid()+">"+state.getStatename()+"</option>");
			
		}
		
		return null;
	}
	
	public String ajaxCal1() throws Exception{
		PrintWriter pw=response.getWriter();
		cityservice=new cityServiceImpl();
		list1=cityservice.ajaxCityService(state,city,stat);
		
		Iterator itr1=list1.iterator();
		while(itr1.hasNext()){
			City city=(City)itr1.next();
			pw.write("<option value="+city.getCityid()+">"+city.getCityname()+"</option>");
			
		}
		
		return null;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public List<Country> getList() {
		return list;
	}

	public void setList(List<Country> list) {
		this.list = list;
	}

	public String getCon() {
		return con;
	}

	public void setCon(String con) {
		this.con = con;
	}

	public int getCoun() {
		return coun;
	}

	public void setCoun(int coun) {
		this.coun = coun;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public List<City> getList1() {
		return list1;
	}
	public void setList1(List<City> list1) {
		this.list1 = list1;
	}
	public List<State> getList2() {
		return list2;
	}
	public void setList2(List<State> list2) {
		this.list2 = list2;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public String getSta() {
		return sta;
	}
	public void setSta(String sta) {
		this.sta = sta;
	}
	public void setServletResponse(HttpServletResponse response) {
		this.response=response;
		
	}
	public int getStat() {
		return stat;
	}
	public void setStat(int stat) {
		this.stat = stat;
	}
	public String getCit() {
		return cit;
	}
	public void setCit(String cit) {
		this.cit = cit;
	}

}
