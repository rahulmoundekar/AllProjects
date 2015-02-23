package com.service;

import java.util.ArrayList;
import java.util.List;

import com.dao.cityDaoImpl;
import com.dao.cityDao;
import com.hibernate.City;
import com.hibernate.Country;
import com.hibernate.State;

public class cityServiceImpl implements Cityservice {

	List<Country> list=new ArrayList<Country>();
	
	List<State> list2=new ArrayList<State>();
	
	List<City> list1=new ArrayList<City>();
	
	cityDao citydao=new cityDaoImpl();
	
	public List<City> ajaxCityService(State state, City city, int stat) {
		list1=citydao.ajaxCityDao(state,city,stat);
		return list1;
	}
	public List<State> ajaxStateService(Country country, State state, int coun) {
		list2=citydao.ajaxStateDao(country,state, coun);
		return list2;
	}
	public List<Country> cityService(Country country) {
		System.out.println("in service");
		list=citydao.fetchCity(country);
	
		return list;
	}
	

}
