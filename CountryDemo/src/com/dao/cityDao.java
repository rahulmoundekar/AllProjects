package com.dao;

import java.util.List;

import com.hibernate.City;
import com.hibernate.Country;
import com.hibernate.State;

public interface cityDao {
	
	public List<Country> fetchCity(Country country);
	
	public List<State> ajaxStateDao(Country country, State state, int coun);	
	
	public List<City> ajaxCityDao(State state,City city,int stat);
}
